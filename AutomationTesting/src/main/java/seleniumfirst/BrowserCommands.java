package seleniumfirst;

public class BrowserCommands extends Base {

	public static void main(String[] args) {
		BrowserCommands cmds=new BrowserCommands();
		cmds.initializeBrowser();//url enter
		cmds.browserCommands();//url
		cmds.closeAndQuit();//close and quit

	}
	public void  browserCommands()
	{
		String title=driver.getTitle();//to get title//datatype variablename
		System.out.println(title);
		String currentURL=driver.getCurrentUrl();//to get Url
		System.out.println(currentURL);
		String pagesource=driver.getPageSource();//to get code
		System.out.println(pagesource);
	}

}
