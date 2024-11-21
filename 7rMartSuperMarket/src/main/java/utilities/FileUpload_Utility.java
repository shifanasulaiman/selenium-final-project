package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileUpload_Utility 
{
public static void uploadfile(String filepath) throws AWTException
{
	
	Robot robot=new Robot();
	File file=new File(filepath);
	StringSelection filePathSelection = new StringSelection(file.getAbsolutePath());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
	robot.delay(250);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(90);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
