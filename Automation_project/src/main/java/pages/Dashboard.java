package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitHelper;

public class Dashboard {
    // Verify widgets load.
    // Sidebar menu navigation.
    // Profile menu check.

    WebDriver driver;
    WaitHelper wait;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardHeader;

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminMenu;

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimMenu;

    @FindBy(xpath = "//span[text()='Leave']")
    WebElement leaveMenu;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WaitHelper(driver);
    }

    public boolean isDashboardHeaderVisible(){
        return wait.waitForVisibility(dashboardHeader).isDisplayed();
    }

    public boolean isAdminVisible(){
        return wait.waitForVisibility(adminMenu).isDisplayed();
    }

    public boolean isPIMVisible(){
        return wait.waitForVisibility(pimMenu).isDisplayed();
    }

    public boolean isLeaveVisible(){
        return wait.waitForVisibility(leaveMenu).isDisplayed();
    }
}
