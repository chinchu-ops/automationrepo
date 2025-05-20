package seleniumfirst;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		NavigationCommands navigate = new NavigationCommands();
		navigate.initializeBrowser();
		navigate.navigationcommand();

	}
	public void navigationcommand()
	{
		driver.navigate().to("https://www.amazon.in/");//to move to amazon site
	    driver.navigate().back();//back to obsqura
		driver.navigate().forward();//go to amazon
		driver.navigate().refresh();//refreshing amazon site
	}
	

}
