package se.claremont.test;
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
    By repositoriesLinkIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.UnderlineNav.user-profile-nav.js-sticky.top-0 > nav > a:nth-child(2)");
    By firstRepoIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.position-relative > div:nth-child(1) > div > ol > li:nth-child(1) > span > span > a");

    @Before
    public void setUp(){
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void closeDown(){
        browser.quit();
    }
    @Test
    public void simplePageObjectTest() throws InterruptedException {
        browser.get("https://github.com/Jacob-Hedman");

        WebElement repositoriesLink = browser.findElement(repositoriesLinkIdentifier);
        repositoriesLink.click();

        WebElement firstRepo = browser.findElement(firstRepoIdentifier);
        Assert.assertEquals(
                "hello-world",firstRepo.getText()
        );

    }
}
