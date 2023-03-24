package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.WaitUtils;

public class MyInfoPage extends Navigation{

    public MyInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //label[text()='Employee Id']/../following-sibling::div/input
    @FindBy(xpath = "//label[text()='Street 1']/../following-sibling::div/input")
    public WebElement streetOneInputBox;

    @FindBy(xpath = "//label[text()='Street 2']/../following-sibling::div/input")
    public WebElement streetTwoInputBox;


    //Contact Details Elements
    public WebElement getContactDetailsInputBoxElement(String label){
        String xpath = " //label[text()='"+label+"']/../following-sibling::div/input";
        WebElement inputBoxElement = Driver.getDriver().findElement(By.xpath(xpath));
        return inputBoxElement;
    }

    public void sendKeysToContactDetailInputBoxes(String label, String value){

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
//        wait.until(ExpectedConditions.elementToBeClickable(getContactDetailsInputBoxElement(label)));
        WaitUtils.pauseFor(700);
        getContactDetailsInputBoxElement(label).sendKeys(Keys.chord(Keys.CONTROL+"a"));
        getContactDetailsInputBoxElement(label).sendKeys(value);

    }

    public WebElement getMyInfoOption (String myInfoOption){
        String xpath = "//div/a[.='"+myInfoOption+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public void clickOnMyInfoOption(String myInfoOption){
        getMyInfoOption(myInfoOption).click();
    }
}
