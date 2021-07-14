package pageobjectmodel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage1 {
WebDriver driver;

      @FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement Reglink;
      
      @FindBy(name="firstName")
  	WebElement FirstName;
	
 @FindBy(name="lastName")
WebElement LastName;

 @FindBy(name="phone")
	WebElement Phone;
 
 @FindBy(name="userName")
	WebElement Email;
 
 @FindBy(name="address1")
	WebElement Address;
 
 @FindBy(name="city")
	WebElement City;
 
 @FindBy(name="state")
	WebElement State;
 
 @FindBy(name="postalCode")
	WebElement PostalCode;
 
 @FindBy(name="country")
	WebElement Country;
 
 @FindBy(name="email")
	WebElement UserName;
 
 @FindBy(name="password")
	WebElement Password;
 
 @FindBy(name="confirmPassword")
	WebElement ConfirmPassword;

 
 
 public RegistrationPage1(WebDriver d) {
	//this.driver=driver;
	 driver=d;
	PageFactory.initElements(d, this);
}
public void clickRegLink() {
	Reglink.click();
}
public void setFirstName(String fname) {
	FirstName.sendKeys(fname);
}
public void setLastName(String flast) {
	LastName.sendKeys(flast);
}
public void setPhone(String fphone) {
	Phone.sendKeys(fphone);
}
public void setAddress1(String fadd) {
	Address.sendKeys(fadd);
}
public void setEmail(String fema) {
	Email.sendKeys(fema);
}
public void setcity(String fcity) {
	City.sendKeys(fcity);
}
public void setState(String fstate) {
	State.sendKeys(fstate);
}
public void setPostalCode(String fpost) {
	PostalCode.sendKeys(fpost);
}
public void setCountry(String fcount) {
	Country.sendKeys(fcount);
}
public void setUserNmae(String fuser) {
	UserName.sendKeys(fuser);
}
public void setPassword(String fpass) {
	Password.sendKeys(fpass);
}
public void setConfirmPassword(String fconf) {
	ConfirmPassword.sendKeys(fconf);
}
}