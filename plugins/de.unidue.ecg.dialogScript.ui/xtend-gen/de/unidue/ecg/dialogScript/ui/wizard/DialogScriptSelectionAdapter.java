package de.unidue.ecg.dialogScript.ui.wizard;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

@SuppressWarnings("all")
public class DialogScriptSelectionAdapter extends SelectionAdapter {
  private Shell shell = null;
  
  private Text containerText = null;
  
  public DialogScriptSelectionAdapter(final Shell shell, final Text containerText) {
    this.shell = shell;
    this.containerText = containerText;
  }
  
  public void widgetSelected(final SelectionEvent e) {
    this.handleBrowse();
  }
  
  /**
   * Uses the standard container selection dialog to choose the new value for
   * the container field.
   */
  public void handleBrowse() {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    ContainerSelectionDialog _containerSelectionDialog = new ContainerSelectionDialog(this.shell, _root, false, 
      "Select new file container");
    final ContainerSelectionDialog dialog = _containerSelectionDialog;
    int _open = dialog.open();
    boolean _equals = (_open == ContainerSelectionDialog.OK);
    if (_equals) {
      final Object[] result = dialog.getResult();
      int _length = result.length;
      boolean _equals_1 = (_length == 1);
      if (_equals_1) {
        Object _get = result[0];
        String _string = ((Path) _get).toString();
        this.containerText.setText(_string);
      }
    }
  }
}
