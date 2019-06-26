package ru.stqa.java_study.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();


  }

  private void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  private void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }

}
