import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class GameLauncher {
	private static Text username;
    
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(1080, 747);
		shell.setText("SWT Application");
		
	    Color red = display.getSystemColor(SWT.COLOR_RED);
	    Color gray = display.getSystemColor(SWT.COLOR_GRAY);
	    Color blue = display.getSystemColor(SWT.COLOR_BLUE);
	    Color green = display.getSystemColor(SWT.COLOR_GREEN);
		
		Composite tools = new Composite(shell, SWT.NONE);
		tools.setBounds(0, 590, 1062, 108);
		
		Browser browser = new Browser(shell, SWT.NONE);
		browser.setUrl("https://www.minecraft.net/tr-tr/community");
		browser.setBounds(0, 0, 1062, 588);
		
		Button gobtn = new Button(tools, SWT.NONE);
		gobtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
			}
		});
		gobtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		gobtn.setBounds(10, 25, 161, 60);
		gobtn.setText("GO");
		gobtn.setBackground(green);
		
		username = new Text(tools, SWT.BORDER);
		username.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		username.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		username.setBounds(505, 42, 229, 26);
		username.setMessage("Your user name...");
		
		Label version = new Label(tools, SWT.NONE);
		version.setBounds(1026, 78, 36, 20);
		version.setText("1.0.0");
		
		

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
