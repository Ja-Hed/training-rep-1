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

public class SeleniumTest1 {

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
    public void simpleSeleniumTest() throws InterruptedException {
        //WebDriver browser = new ChromeDriver(); //if I only validate this method inside of test, it will only be inside of test.
        //browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //IF it doesn't find a click or assert, wait MAX 5 sec.
        //React och angular. poluläraste ramverk
        //Xpath stegrar igenom inspekt trädet. Selector går efter CCS kod och identifiers där
        browser.get("https://github.com/Jacob-Hedman");

        WebElement repositoriesLink = browser.findElement(repositoriesLinkIdentifier);
        repositoriesLink.click();

        WebElement firstRepo = browser.findElement(firstRepoIdentifier);
        Assert.assertEquals(
                "hello-world",firstRepo.getText()
        );
        //firstRepo.click();


        //Thread.sleep(4000); //Should not be in a final test

        //browser.quit(); //you can't run several tests if this is inside of 1 method but there is a shared browser among tests
    }
}
