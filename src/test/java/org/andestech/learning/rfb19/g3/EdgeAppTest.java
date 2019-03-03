package org.andestech.learning.rfb19.g3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class EdgeAppTest
{
    private WebDriver wd = null;

    @BeforeClass
    public void initData(){
    System.setProperty("java.net.preferIPv4Stack", "true");
    System.setProperty("webdriver.ie.driver",
            "D:\\drivers\\IEDriverServer.exe");  // укажите свой каталог, где находится драйвер
    System.out.println("+++ Class: " + this);

    }

    @Test
    public void testCaseChrome01() throws InterruptedException {
        wd = new InternetExplorerDriver();
        wd.get("http://google.com");
        assertTrue( true );
        Thread.sleep(3000);
    }


    @AfterClass
    public void tearDown()
    {
      if(wd != null) wd.quit();
      System.out.println("--- Class: " + this);
    }

}
