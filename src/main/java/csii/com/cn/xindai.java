package csii.com.cn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class xindai {
    WebDriver dr;
    @BeforeMethod
    public  void openfire(){
        System.setProperty("webdriver.chrome.driver", "D:\\fox\\chromedriver.exe");
        // System.setProperty("webdriver.chrome.bin","C:\\Users\\15833\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        //System.setProperty("webdriver.gecko.driver","E:\\workspace1\\src\\main\\java\\csii\\com\\driver\\geckodriver.exe");
        dr =new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.manage().window().maximize();
    }
    @Test
    public  void  test001() throws InterruptedException {
        dr.get("http://115.182.90.214:4000/#/login/");
        WebElement username=dr.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/p[1]/input"));
        username.clear();
        username.sendKeys("sunin");
        WebElement passwd=dr.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/p[2]/input"));
        passwd.clear();
        passwd.sendKeys("1");
        dr.findElement(By.cssSelector("#loginBtn")).click();
        WebElement ls = dr.findElement(By.cssSelector("#header > div.head_center.el-dropdown > img"));

        Actions ac=new Actions(dr);
        ac.moveToElement(ls).perform();


        WebElement ds=  dr.findElement(By.xpath("//*[@id=\"dropdown-menu-6252\"]/li[3]"));
        ac.moveToElement(ds).click();
      /*  JavascriptExecutor xs=(JavascriptExecutor)dr;
        xs.executeScript(" document.querySelector(\"#dropdown-menu-7277 > li:nth-child(4)\")");
        Thread.sleep(30000);*/



    }


    @Test
    public  void  test002() throws InterruptedException {
        dr.get("http://115.182.90.214:4000/#/login/");
        WebElement username=dr.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/p[1]/input"));
        username.clear();
        username.sendKeys("sunin");
        WebElement passwd=dr.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/p[2]/input"));
        passwd.clear();
        passwd.sendKeys("1");
        dr.findElement(By.cssSelector("#loginBtn")).click();
        dr.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/li[2]")).click();
        //*[@id="myMenu"]/li[1]/div/span
        dr.findElement(By.xpath("//*[@id=\"myMenu\"]/li[1]/div/span")).click();
        dr.findElement(By.xpath("//*[@id=\"myMenu\"]/li[1]/ul/li[2]/span")).click();

    }
    @AfterMethod
    public void guanbi(){
        //dr.quit();
    }
}
