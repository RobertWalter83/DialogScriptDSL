package de.unidue.ecg.dialogScript.ui.wizard;

import com.google.common.base.Objects;
import de.unidue.ecg.dialogScript.ui.wizard.DialogScriptSelectionAdapter;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("all")
public class DialogScriptNewDialogScriptWizardPage extends WizardPage {
  private Text containerText = null;
  
  private Text fileText = null;
  
  private ISelection selection = null;
  
  /**
   * Constructor for SampleNewWizardPage.
   * 
   * @param pageName
   */
  public DialogScriptNewDialogScriptWizardPage(final ISelection selection) {
    super("wizardPage");
    this.setTitle("New Dialog Script");
    this.setDescription("Creates a new dialog script.");
    this.selection = selection;
  }
  
  /**
   * @see IDialogPage#createControl(Composite)
   */
  public void createControl(final Composite parent) {
    Composite _composite = new Composite(parent, SWT.NULL);
    final Composite container = _composite;
    GridLayout _gridLayout = new GridLayout();
    final GridLayout layout = _gridLayout;
    container.setLayout(layout);
    layout.numColumns = 3;
    layout.verticalSpacing = 9;
    Label _label = new Label(container, SWT.NULL);
    Label label = _label;
    label.setText("&Folder name:");
    int _bitwiseOr = (SWT.BORDER | SWT.SINGLE);
    Text _text = new Text(container, _bitwiseOr);
    this.containerText = _text;
    GridData _gridData = new GridData(GridData.FILL_HORIZONTAL);
    this.containerText.setLayoutData(_gridData);
    final ModifyListener _function = new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        DialogScriptNewDialogScriptWizardPage.this.dialogChanged();
      }
    };
    this.containerText.addModifyListener(_function);
    Button _button = new Button(container, SWT.PUSH);
    final Button button = _button;
    button.setText("Browse...");
    Shell _shell = this.getShell();
    DialogScriptSelectionAdapter _dialogScriptSelectionAdapter = new DialogScriptSelectionAdapter(_shell, this.containerText);
    button.addSelectionListener(_dialogScriptSelectionAdapter);
    Label _label_1 = new Label(container, SWT.NULL);
    label = _label_1;
    label.setText("&Script name:");
    int _bitwiseOr_1 = (SWT.BORDER | SWT.SINGLE);
    Text _text_1 = new Text(container, _bitwiseOr_1);
    this.fileText = _text_1;
    GridData _gridData_1 = new GridData(GridData.FILL_HORIZONTAL);
    this.fileText.setLayoutData(_gridData_1);
    final ModifyListener _function_1 = new ModifyListener() {
      public void modifyText(final ModifyEvent it) {
        DialogScriptNewDialogScriptWizardPage.this.dialogChanged();
      }
    };
    this.fileText.addModifyListener(_function_1);
    this.initialize();
    this.dialogChanged();
    this.setControl(container);
  }
  
  /**
   * Tests if the current workbench selection is a suitable container to use.
   */
  public void initialize() {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(this.selection, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      boolean _isEmpty = this.selection.isEmpty();
      boolean _equals = (_isEmpty == false);
      _and_1 = (_notEquals && _equals);
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = (_and_1 && (this.selection instanceof IStructuredSelection));
    }
    if (_and) {
      final IStructuredSelection ssel = ((IStructuredSelection) this.selection);
      int _size = ssel.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        return;
      }
      final Object obj = ssel.getFirstElement();
      if ((obj instanceof IResource)) {
        IContainer container = null;
        if ((obj instanceof IContainer)) {
          container = ((IContainer) obj);
        } else {
          IContainer _parent = ((IResource) obj).getParent();
          container = _parent;
        }
        IPath _fullPath = container.getFullPath();
        String _string = _fullPath.toString();
        this.containerText.setText(_string);
      }
    }
    this.fileText.setText("script.dialog");
  }
  
  /**
   * Ensures that both text fields are set.
   */
  public void dialogChanged() {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    String _containerName = this.getContainerName();
    Path _path = new Path(_containerName);
    final IResource container = _root.findMember(_path);
    final String fileName = this.getFileName();
    String _containerName_1 = this.getContainerName();
    int _length = _containerName_1.length();
    boolean _equals = (_length == 0);
    if (_equals) {
      this.updateStatus("Please specify a folder for your new script");
      return;
    }
    boolean _or = false;
    boolean _equals_1 = Objects.equal(container, null);
    if (_equals_1) {
      _or = true;
    } else {
      int _type = container.getType();
      int _bitwiseOr = (IResource.PROJECT | IResource.FOLDER);
      int _bitwiseAnd = (_type & _bitwiseOr);
      boolean _equals_2 = (_bitwiseAnd == 0);
      _or = (_equals_1 || _equals_2);
    }
    if (_or) {
      this.updateStatus("Folder does not exist");
      return;
    }
    boolean _isAccessible = container.isAccessible();
    boolean _not = (!_isAccessible);
    if (_not) {
      this.updateStatus("You don\'t seem to have writing permission in this project");
      return;
    }
    int _length_1 = fileName.length();
    boolean _equals_3 = (_length_1 == 0);
    if (_equals_3) {
      this.updateStatus("Please specify a name for your new script");
      return;
    }
    String _replace = fileName.replace("\\", "/");
    int _indexOf = _replace.indexOf("/", 1);
    boolean _greaterThan = (_indexOf > 0);
    if (_greaterThan) {
      this.updateStatus("The current name is invalid; please don\'t use \'\\\' (back slash) symbols");
      return;
    }
    final int dotLoc = fileName.lastIndexOf(".");
    if ((dotLoc != (-1))) {
      final String ext = fileName.substring((dotLoc + 1));
      boolean _equalsIgnoreCase = ext.equalsIgnoreCase("dialog");
      boolean _equals_4 = (_equalsIgnoreCase == false);
      if (_equals_4) {
        this.updateStatus("File extension has to be \"dialog\"");
        return;
      }
    }
    this.updateStatus(null);
  }
  
  public void updateStatus(final String message) {
    this.setErrorMessage(message);
    boolean _equals = Objects.equal(message, null);
    this.setPageComplete(_equals);
  }
  
  public String getContainerName() {
    return this.containerText.getText();
  }
  
  public String getFileName() {
    return this.fileText.getText();
  }
}
