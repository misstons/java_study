package ru.stqa.java_study.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupCreationTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    login("user", "pass", By.xpath("//input[@value='Login']"), "admin", "secret");
  }

  private void login(String user, String pass, By xpath, String username, String password) {
    wd.findElement(By.name(user)).clear();
    wd.findElement(By.name(user)).sendKeys(username);
    wd.findElement(By.name(pass)).click();
    wd.findElement(By.name(pass)).clear();
    wd.findElement(By.name(pass)).sendKeys(password);
    wd.findElement(xpath).click();
  }

  @Test
  public void testGroupCreation() throws Exception {

    initGroupCreation("new");
    fillGroupForm(new GroupData("test2", "test3", "test4"));
    submitGroupCreation("submit");
    returnToGroupPage("group page");
    logout("Logout");
  }

  private void initGroupCreation(String s) {
    wd.findElement(By.name(s)).click();
  }

  private void fillGroupForm(GroupData groupData) {
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

  private void submitGroupCreation(String submit) {
    wd.findElement(By.name(submit)).click();
  }

  private void returnToGroupPage(String s) {
    wd.findElement(By.linkText(s)).click();
  }
  private void logout(String logout) {
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

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
