package temp.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import temp.product.cscart.po.PO_search;
import temp.product.cscart.utils.BrowserManager;

public class TC_HealthCheck {
	

	@Test
	@Parameters({"browser","url"})
	public void t_01_cscart_search(String Browser,String url) {
		WebDriver driver = BrowserManager.getDriver(Browser,url);
		//driver.get(url);
		
       PO_search obj= PageFactory.initElements(driver, PO_search.class);
       obj.SearchAProduct("computer");
	}

}
