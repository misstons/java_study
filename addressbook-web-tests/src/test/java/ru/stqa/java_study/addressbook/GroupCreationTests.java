package ru.stqa.java_study.addressbook;
import org.testng.annotations.*;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    goToGroupPage();
    initGroupCreation("new");
    fillGroupForm(new GroupData("test2", "test3", "test4"));
    submitGroupCreation("submit");
    returnToGroupPage();
    logout("Logout");
  }


}
