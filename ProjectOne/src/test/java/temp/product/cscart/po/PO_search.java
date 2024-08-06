package temp.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;
                                                     //page factory page object model
public class PO_search {
	WebDriver driver;

	public PO_search(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.NAME,using = "hint_q")
	private WebElement txtbox_search;
	@FindBy(how=How.CLASS_NAME,using = "ty-serach-magnifier")
	private WebElement btn_search;
//	driver.findElement(By.name("hint_q")).sendKeys("computer");
//	driver.findElement(By.className("ty-serach-magnifier")).click();
	
	//Methods
	public void SetSearchTextBox(String arg) {
		txtbox_search.sendKeys(arg);
		Reporter.log("Product entered in search Box :", true);
	}
    
	public void ClickSearchButton() {
		btn_search.click();
		Reporter.log("Search box button clicked :", true);
	}
	
	//Business Method
	public void SearchAProduct(String arg) {
		SetSearchTextBox(arg);
		ClickSearchButton();
		String actual = driver.getTitle();
		String expected = "Serach Results";
		//if assert is failed report this
		Assert.assertEquals(actual, expected,"Search product not displayed" +arg);
		//if assert is passed print this
		Reporter.log("Able to search the product successfully , Product is:"+arg+ true);
	}
}

