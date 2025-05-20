package seleniumfirst;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Locators extends Base{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void idLocator()
{
	WebElement messagefield=driver.findElement(By.id("single-input-field"));//by is class name and id()is a method name, webelemet is an interface, elmemnt name is messagefield 

	WebElement showmessagefield=driver.findElement(By.id("button-one"));
	WebElement entervalueafield=driver.findElement(By.id("ivalue-a"));
	WebElement gettotalfield=driver.findElement(By.id("button-two"));
	
	
}
public void classlocator()
{
	WebElement messageclassfield=driver.findElement(By.className("form-control"));
}
public void nameLocator()
{
	WebElement messagenamefield=driver.findElement(By.name("viewport"));//press ctrl+f then type name
}
public void linktext()
{
	WebElement radiobuttondemofield=driver.findElement(By.linkText("radio-button-demo.php"));//click with href
}
public void partiallinktext() 
{
	WebElement radiobuttondemofield=driver.findElement(By.partialLinkText("radio-button"));
}
public void cssselector()//tag.class//tag and class
{
	WebElement checkboxdemo=driver.findElement(By.cssSelector("input.form-check-input"));
}
public void cssselectors()//tag#id//tag and id
{
	WebElement radiobuttondemo=driver.findElement(By.cssSelector("button#button-one"));
}
public void cssselectorsatrribute()//tag[attributeype=value]//tag and attribute


{
	WebElement radiobuttondemo=driver.findElement(By.cssSelector("button[id=button-one]"));


}
public void cssselectorattributes()//tag.class[attributetype=value]//tag ,class and attribute

{
	WebElement ajaxform=driver.findElement(By.cssSelector("input.form-control[id=subject]"));
}

}