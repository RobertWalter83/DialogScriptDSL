package de.unidue.ecg.dialogScript.ui.wizard;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.Messages;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class DialogScriptProjectCreator extends WorkspaceModifyOperation implements IProjectCreator {
  @Inject
  private Provider<ProjectFactory> projectFactoryProvider;
  
  private IFile result;
  
  private IProjectInfo projectInfo;
  
  private final static String SCRIPT_ROOT = "scripts";
  
  private final ImmutableList<String> FOLDER_LIST = new Function0<ImmutableList<String>>() {
    public ImmutableList<String> apply() {
      ImmutableList<String> _of = ImmutableList.<String>of(DialogScriptProjectCreator.SCRIPT_ROOT);
      return _of;
    }
  }.apply();
  
  private final ImmutableList<String> PROJECT_NATURES = new Function0<ImmutableList<String>>() {
    public ImmutableList<String> apply() {
      ImmutableList<String> _of = ImmutableList.<String>of(XtextProjectHelper.NATURE_ID);
      return _of;
    }
  }.apply();
  
  private final ImmutableList<String> BUILDER_IDS = new Function0<ImmutableList<String>>() {
    public ImmutableList<String> apply() {
      ImmutableList<String> _of = ImmutableList.<String>of(XtextProjectHelper.BUILDER_ID);
      return _of;
    }
  }.apply();
  
  protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
    String _createModelProjectMessage = this.getCreateModelProjectMessage();
    final SubMonitor subMonitor = SubMonitor.convert(monitor, _createModelProjectMessage, 2);
    try {
      SubMonitor _newChild = subMonitor.newChild(1);
      final IProject project = this.createProject(_newChild);
      boolean _equals = Objects.equal(project, null);
      if (_equals) {
        return;
      }
      SubMonitor _newChild_1 = subMonitor.newChild(1);
      IFile _enhanceProject = this.enhanceProject(project, _newChild_1);
      this.result = _enhanceProject;
    } finally {
      subMonitor.done();
    }
  }
  
  public IFile getResult() {
    return this.result;
  }
  
  public void setProjectInfo(final IProjectInfo projectInfo) {
    this.projectInfo = projectInfo;
  }
  
  public String getCreateModelProjectMessage() {
    String _projectName = this.projectInfo.getProjectName();
    return (Messages.AbstractProjectCreator_0 + _projectName);
  }
  
  public IProject createProject(final IProgressMonitor monitor) {
    IProject _xblockexpression = null;
    {
      final ProjectFactory factory = this.projectFactoryProvider.get();
      this.configureProjectFactory(factory);
      IProject _createProject = factory.createProject(monitor, null);
      _xblockexpression = (_createProject);
    }
    return _xblockexpression;
  }
  
  public ProjectFactory configureProjectFactory(final ProjectFactory factory) {
    String _projectName = this.projectInfo.getProjectName();
    factory.setProjectName(_projectName);
    factory.addFolders(this.FOLDER_LIST);
    factory.addProjectNatures(((String[])Conversions.unwrapArray(this.PROJECT_NATURES, String.class)));
    factory.addBuilderIds(((String[])Conversions.unwrapArray(this.BUILDER_IDS, String.class)));
    return factory;
  }
  
  public IFile enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
    String _plus = ("./" + DialogScriptProjectCreator.SCRIPT_ROOT);
    String _plus_1 = (_plus + "/characters");
    Path _path = new Path(_plus_1);
    final Path charaPath = _path;
    String _plus_2 = ("./" + DialogScriptProjectCreator.SCRIPT_ROOT);
    String _plus_3 = (_plus_2 + "/dialog");
    Path _path_1 = new Path(_plus_3);
    final Path dialogPath = _path_1;
    CharSequence _createCharacterContent = this.createCharacterContent();
    String _string = _createCharacterContent.toString();
    this.createFile(project, "Characters.chara", charaPath, _string, monitor);
    CharSequence _createDialogContent = this.createDialogContent();
    String _string_1 = _createDialogContent.toString();
    final IFile dialogFile = this.createFile(project, "Dialog.dialog", dialogPath, _string_1, monitor);
    project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
    return dialogFile;
  }
  
  private IFile createFile(final IProject project, final String fileNameWithExtension, final Path path, final String content, final IProgressMonitor monitor) {
    try {
      IFile _xblockexpression = null;
      {
        final IFolder folder = project.getFolder(path);
        folder.create(true, true, monitor);
        Path _path = new Path(fileNameWithExtension);
        final IFile file = folder.getFile(_path);
        ByteArrayInputStream stream = ((ByteArrayInputStream) null);
        IFile _xtrycatchfinallyexpression = null;
        try {
          byte[] _bytes = content.getBytes();
          ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
          stream = _byteArrayInputStream;
          file.create(stream, true, monitor);
          return file;
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException io = (IOException)_t;
            _xtrycatchfinallyexpression = null;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        } finally {
          stream.close();
        }
        _xblockexpression = (_xtrycatchfinallyexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence createDialogContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Some useful shortcuts");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* CTRL+SPACE: Get context sensitive help at the current cursor position");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* CTRL+SHIFT+F: Auto-format your file");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("characters: Leia, Han");
    _builder.newLine();
    _builder.newLine();
    _builder.append("scene \"The Sealing\" ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Leia: \"I love you.\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Han: \"I know.\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("end scene");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createCharacterContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Some useful shortcuts");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* CTRL+SPACE: Get context sensitive help at the current cursor position");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* CTRL+SHIFT+F: Auto-format your file");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("character Leia");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("full name \"Leia Organa\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"Princess of Alderaan, daughter of Padme Amidala and Anakin Skywalker.\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("age 22");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sex female");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("type NPC");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("character Han");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("full name \"Han Solo\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"Corellian Smuggler\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("age 32");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sex male");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("type PC");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  public String getEncoding() throws CoreException {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    String _defaultCharset = _root.getDefaultCharset();
    return _defaultCharset;
  }
}
