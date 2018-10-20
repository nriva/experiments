package nrsoft.wintool.test;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.MenuDetectEvent;

public class WinTest {
	/**
	 * @wbp.nonvisual location=74,189
	 */
	private static final TrayItem trayItem = new TrayItem(Display.getDefault().getSystemTray(), SWT.NONE);
	private static Menu menu;

	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		trayItem.addMenuDetectListener(new MenuDetectListener() {
			public void menuDetected(MenuDetectEvent arg0) {
				menu.setVisible(true);
			}
		});
		trayItem.setImage(SWTResourceManager.getImage( WinTest.class,"/squirrel.ico"));
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		menu = new Menu(shell);
		shell.setMenu(menu);
		
		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("New Item");
		
		MenuItem mntmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mntmNewItem_1.setText("New Item2");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
