package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitHelper;

public class Logout {
    WebDriver driver;
    WaitHelper wait;

    @FindBy(css = "p.oxd-userdropdown-name")
    WebElement profileDropdown;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WaitHelper(driver);
    }

    public void performLogout(){
        wait.waitForClickable(profileDropdown).click();
        wait.waitForClickable(logoutBtn).click();
        // WebElement logoutBtn = wait.waitForClickable(
        //     driver.findElement(By.xpath("//a[text()='Logout']"))
        // );
        // logoutBtn.click();
    }
}
