package ru.stqa.java_study.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Popka on 24.06.2019.
 */
public class TestBase {

    public WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
      wd = new ChromeDriver();
      wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/group.php");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      wd.get("http://localhost/addressbook/");
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.id("LoginForm")).submit();
    }

    protected void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    protected void initGroupCreation(String s) {
      wd.findElement(By.name(s)).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void submitGroupCreation(String submit) {
      wd.findElement(By.name(submit)).click();
    }

    protected void returnToGroupPage(String submit) {
      wd.findElement(By.linkText(submit)).click();
    }

    protected void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    protected void logout(String logout) {
      wd.findElement(By.linkText(logout)).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

}
