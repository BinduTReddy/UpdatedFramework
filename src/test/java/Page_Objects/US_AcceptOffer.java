package Page_Objects;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Methods.GenericLib;

public class US_AcceptOffer {	
	WebDriver driver;
	GenericLib lib;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement AdminBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='583']")
	private WebElement History;

	@FindBy(xpath="//*[@class='shm_link003' and @id='599']")
	private WebElement EmailHistory;

	@FindBy(xpath="//*[@id='txtToMail']")
	private WebElement ToEmail;

	@FindBy(xpath="//*[@id='ddlCategory']")
	private WebElement Category;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement Viewlogo;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]")
	private WebElement OfferLink;
	
	@FindBy(xpath="//*[@id='EmailId']")
	private WebElement Emailid;
	
	@FindBy(xpath="//*[@id='AccessCode']")
	private WebElement Accesscode;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Login;
	
	@FindBy(xpath="//*[@onclick='CPXWindow_Close(this);']")
	private WebElement Close;
	
	@FindBy(xpath="//*[@id='IAgree'][@value='True']")
	private WebElement IAgreeRadioBtn;
	
	@FindBy(xpath="//*[@id='EATerms']/tbody/tr[5]/td/input[2]")
	private WebElement IAccept;
	
	public US_AcceptOffer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	public void Accept_Offer(Map<String,String> hmap) throws Exception {
		Thread.sleep(3000);
		AdminBtn.click();
		Thread.sleep(1000);
		History.click();
		EmailHistory.click();
		lib = new GenericLib(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		SearchImg.click();
		Thread.sleep(2000);
		Viewlogo.click();
		lib.switchOutOfFrame();
		
		driver.switchTo().parentFrame();
		String str = OfferLink.getText();
//		System.out.println(str);
		String AccessCode = str.split("Your access code is: ")[1].trim();
		AccessCode =AccessCode.split("I")[0];
		System.out.println(AccessCode);
		Thread.sleep(2000);

		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/a")).click();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		Emailid.sendKeys(hmap.get("Email"));
		Accesscode.sendKeys(AccessCode);
		Login.click();
		Thread.sleep(1500);
		IAgreeRadioBtn.click();
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", IAccept);
//		IAccept.click();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(2000);
	}
}