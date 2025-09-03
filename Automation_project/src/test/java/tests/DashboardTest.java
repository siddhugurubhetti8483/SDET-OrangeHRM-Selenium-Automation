package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Login;

public class DashboardTest extends BaseTest {
    private Login login;
    private Dashboard dashboard;

    @BeforeClass
    public void initPage(){
        super.setup();
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        login.performLogin(config.getProperty("username"), config.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyDashboardHeader(){
        Assert.assertTrue(dashboard.isDashboardHeaderVisible(), "Dashboard header not visible");
    }

    @Test(priority = 2)
    public void verifyAdminMenu(){
        Assert.assertTrue(dashboard.isAdminVisible(), "Admin Menu not visible");
    }

    @Test(priority = 3)
    public void verifyPIMMenu(){
        Assert.assertTrue(dashboard.isPIMVisible(), "PIM Menu not visible");
    }

    @Test(priority = 4)
    public void verifyLeaveMenu(){
        Assert.assertTrue(dashboard.isLeaveVisible(), "Leave Menu not visible");
    }
}
