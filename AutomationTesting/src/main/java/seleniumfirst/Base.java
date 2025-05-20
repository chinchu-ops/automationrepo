package seleniumfirst;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static void main(String[] args) {
		Base base=new Base();//obj creation 
	base.initializeBrowser();
	base.closeAndQuit();//calling closeAndQuiit
	}
	WebDriver driver;//globally initializing
	public void initializeBrowser()
	{
		 driver=new ChromeDriver();//initialization ,ref variable (driver)/webDriver driver=new ChromeDriver
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in/index.php");//abstract method 
		driver.manage().window().maximize();//maximising window
		
	}
public void closeAndQuit()
{
	//driver.close();//last opened url get closed
	driver.quit();//entire windows got closed,commonly used
}
}
