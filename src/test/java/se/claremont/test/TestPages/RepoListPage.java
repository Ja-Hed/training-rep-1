package se.claremont.test.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoListPage {
    WebDriver browser;
    By firstRepoIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.position-relative > div:nth-child(1) > div > ol > li:nth-child(1) > span > span > a");

    public RepoListPage(WebDriver browser){
        this.browser = browser;
    }
    public String getNameOfFirstRepo(){
        return browser.findElement(firstRepoIdentifier).getText(); //Get that identifyer and then in the text, say the expected text
    }
}
