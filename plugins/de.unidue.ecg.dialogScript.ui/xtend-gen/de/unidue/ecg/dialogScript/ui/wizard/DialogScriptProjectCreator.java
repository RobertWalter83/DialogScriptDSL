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
    try {
      Path _path = new Path("./scripts/samples");
      final IFolder folder = project.getFolder(_path);
      folder.create(true, true, monitor);
      Path _path_1 = new Path("Sample.dialog");
      final IFile file = folder.getFile(_path_1);
      final CharSequence content = this.createContent();
      ByteArrayInputStream stream = ((ByteArrayInputStream) null);
      try {
        String _string = content.toString();
        byte[] _bytes = _string.getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
        stream = _byteArrayInputStream;
        file.create(stream, true, monitor);
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException io = (IOException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        stream.close();
      }
      project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
      return file;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence createContent() {
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
    _builder.append("characters: Bill, Tom");
    _builder.newLine();
    _builder.newLine();
    _builder.append("scene \"Project Sample\" ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Bill: \"Hi, Tom.\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Tom: \"Hey, Bill.\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("end scene");
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
