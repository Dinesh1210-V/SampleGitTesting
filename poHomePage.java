package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.commonMethods;

public class poHomePage extends commonMethods{
	WebDriver driver;
	
	public poHomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath = "//a[text()='LOGIN']")
	WebElement LoginButton;

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement RegisterButton;

	@FindBy(xpath = "(//a[text()='Home'])[1]")
	WebElement HomeButton;

	@FindBy(xpath = "(//a[text()='Departments'])[1]")
	WebElement DepartmentsButton;

	@FindBy(xpath = "(//a[text()='How to apply'])[1]")
	WebElement HowtoapplyButton;

	@FindBy(xpath = "(//a[text()='Dashboard'])[1]")
	WebElement DashboardButton;
	
	/*
	 * @FindBy(xpath = "//h2[text()='FILMED IN KARNATAKA']") public WebElement
	 * filminkarnataka;
	 * 
	 * @FindBy(xpath = "//h2[text()='Meet the celebrities']") WebElement
	 * meettheceleberities;
	 */
	@FindBy(xpath = "//i[@class='common-arrow common-arrow--prev top--arrow top--arrow--prev fas fa-arrow-left slick-arrow']")
	WebElement leftnavigationofFIK;

	@FindBy(xpath = "//i[@class='common-arrow common-arrow--next top--arrow top--arrow--next fas fa-arrow-right slick-arrow']")
	WebElement rightnavigationofFIK;

	@FindBy(xpath = "//i[@class='common-arrow common-arrow--prev top--arrow top--arrow--two top--arrow--prev fas fa-arrow-left slick-arrow']")
	WebElement leftnavigationofMTC;

	@FindBy(xpath = "//i[@class='common-arrow common-arrow--next top--arrow top--arrow--two top--arrow--next fas fa-arrow-right slick-arrow']")
	WebElement rightnavigationofMTC;
	
	/*
	 * @FindBy(xpath = "//a[text()='Company History']") public WebElement
	 * companyhistory;
	 */
	
	@FindBy(xpath = "//button[@class='scroll-top tran3s']")
	WebElement uparrow;
	
      public poLoginPage_welcomepage clicktheloginbutton() {
		LoginButton.click();
		return new poLoginPage_welcomepage(driver);
	}

	public poHomePage clickRegisterbutton() {
		RegisterButton.click();
		return this;
	}

	public poHomePage clickhomebutton() {
		HomeButton.click();
	
		return this;	
	}

	public poHomePage clickdepartmentsbutton() {
		DepartmentsButton.click();
		return this;
	}

	public poHomePage clickhowtoapplybutton() {
		HowtoapplyButton.click();
		return this;
	}

	public poHomePage clickdashboardbutton() {
		DashboardButton.click();
		return this;
	}

	public poHomePage leftarrowclickforFIK() throws InterruptedException {
		
		for (int i = 1; i <= 5; i++) {
			leftnavigationofFIK.click();
			
			//Thread.sleep(5000);
			
		}
		return this;
	}

	public poHomePage rightarrowclickforFIK() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			try {
				rightnavigationofFIK.click();
				
			} catch (Exception e) {
				
			}
		
			//Thread.sleep(5000);
		}
		return this;
	}

	public poHomePage leftarrowclickforMTC() {
		for (int i = 1; i <= 5; i++) {
			leftnavigationofMTC.click();
		}
		return this;
	}

	public poHomePage rightarrowclickforMTC() {
		for (int i = 1; i <= 5; i++) {
			rightnavigationofMTC.click();
		}
		return this;
	}
	
	public poHomePage uparrowinhomepage() {
		uparrow.click();
		return this;
	}
}
