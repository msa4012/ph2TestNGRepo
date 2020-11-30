package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
    
    WebDriver driver;
    
    @FindBy(id="i-icon-profile")
    WebElement LoginIcon;
    
    @FindBy(id="signInLink")
    WebElement LoginLink;
    
    @FindBy(id="mobileNoInp")
    WebElement MobileNo;
    
    public Loginpage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
    
    public void LogintoApp(String Mobilenum) {
        
        LoginIcon.click();
        LoginLink.click();
        
        driver.switchTo().frame(0);
        MobileNo.sendKeys(Mobilenum);
        
    }
}