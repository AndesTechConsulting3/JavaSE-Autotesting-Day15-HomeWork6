package org.andestech.learning.rfb19.g3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IEAppTest {


    private WebDriver wd = null;


    @BeforeClass
    public void initData(){
        System.setProperty("webdriver.ie.driver",
                "C:\\WebDrivers\\IEDriverServer.exe");

        System.out.println("+++ Class: " + this);

    }

    @Test
    public void testCaseChrome01() throws InterruptedException {
        wd = new InternetExplorerDriver();

        wd.get("http://google.com");
        Thread.sleep(5000);
        assertTrue( true );
    }

    @AfterClass
    public void tearDown()
    {
        if(wd != null) wd.quit();
        System.out.println("--- Class: " + this);
    }

}
