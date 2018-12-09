package csii.com.cn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class seldomo1 {

  WebDriver dr;
    @BeforeMethod
    public  void openfire(){
        System.setProperty("webdriver.chrome.driver", "D:\\fox\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.bin","C:\\Users\\15833\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        //System.setProperty("webdriver.gecko.driver","E:\\workspace1\\src\\main\\java\\csii\\com\\driver\\geckodriver.exe");
        dr =new ChromeDriver();
    }
    @Test
    public  void  test001() throws InterruptedException {
        dr.get("https://www.baidu.com/");
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        Thread.sleep(3000);
        WebElement ls=dr.findElement(By.xpath("//*[@id=\"2\"]/h3/a"));
      System.out.print(ls.getText());
      //Assert.assertEquals(ls.getText(),"Selenium(浏览器自动化测试框架)");
        Actions ac=new Actions(dr);
        ac.contextClick(ls);


    }
    @Test
    public  void  test002() throws InterruptedException {
        dr.get("https://www.baidu.com/");
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        Thread.sleep(3000);
        WebElement ls=dr.findElement(By.xpath("//*[@id=\"2\"]/h3/a"));
        System.out.print(ls.getText());
        //Assert.assertEquals(ls.getText(),"Selenium(浏览器自动化测试框架)");
        Actions ac=new Actions(dr);
       // ac.contextClick(ls).perform();



    }
    @Test
    public  void  test003() throws InterruptedException {
        dr.get("https://www.baidu.com/");
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        Thread.sleep(3000);
        WebElement ls=dr.findElement(By.xpath("//*[@id=\"u\"]/a[2]"));
        System.out.print(ls.getText());
        //Assert.assertEquals(ls.getText(),"Selenium(浏览器自动化测试框架)");
        Actions ac=new Actions(dr);
        ac.moveToElement(ls).perform();



    }
    @Test
    public  void  test004() throws InterruptedException {
        dr.get("https://www.baidu.com/");
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        Thread.sleep(3000);
        WebElement ls=dr.findElement(By.xpath("//*[@id=\"u\"]/a[2]"));
        System.out.print(ls.getText());
        //Assert.assertEquals(ls.getText(),"Selenium(浏览器自动化测试框架)");
        Actions ac=new Actions(dr);
        ac.moveToElement(ls).perform();



    }
   @AfterMethod
    public void guanbi(){
       //dr.quit();
    }
}
