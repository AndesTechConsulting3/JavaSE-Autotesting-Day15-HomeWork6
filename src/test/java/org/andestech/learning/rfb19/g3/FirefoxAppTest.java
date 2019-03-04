package org.andestech.learning.rfb19.g3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxAppTest {

    private WebDriver wd = null;

    @BeforeClass
    public void initData(){
        System.setProperty("webdriver.gecko.driver",
                "drivers/geckodriver");  // укажите свой каталог, где находится драйвер
        System.out.println("+++ Class: " + this);

    }

    @Test
    public void testCaseChrome01()
    {
        wd = new FirefoxDriver();
        wd.get("http://google.com");

        WebElement $googleImage = wd.findElement(By.cssSelector("img[alt=Google]"));

        Assert.assertTrue($googleImage.isDisplayed());
    }


    @AfterClass
    public void tearDown()
    {
        if(wd != null) wd.quit();
        System.out.println("--- Class: " + this);
    }
}
