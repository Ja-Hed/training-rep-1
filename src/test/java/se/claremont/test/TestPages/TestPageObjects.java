package se.claremont.test.TestPages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class TestPageObjects {

    WebDriver browser; //validate it outside of the method to make it available and share it among tests
    By firstRepoIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.position-relative > div:nth-child(1) > div > ol > li:nth-child(1) > span > span > a");

    @Before
    public void setUp(){
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get("https://github.com/Jacob-Hedman");
    }
    @After
    public void closeDown(){
        browser.quit();
    }
    @Test
    public void simplePageObjectTest() throws InterruptedException {
        //new UserRepoMenu(browser).showRepositoryListPage(); //Open the class UserRepoMenu and then from that, use showRepositoryListPage

        UserRepoMenu menu = new UserRepoMenu(browser); //declare page

        //menu.showRepositoryListPage(); //User method from the declared page/class

        RepoListPage listPage = menu.showRepositoryListPage();

        //RepoListPage listPage = new UserRepoMenu(browser).showRepositoryListPage(); //refractoring to much

        Assert.assertEquals(
                "Checking name of the first Repo is...",
                "hello-world",
                listPage.getNameOfFirstRepo()
        );

    }
}
