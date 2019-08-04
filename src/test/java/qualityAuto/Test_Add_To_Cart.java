package qualityAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test_Add_To_Cart {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jollybrown030@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("validate12");
        driver.findElement(By.xpath("//p[@class='submit']//span[1] ")).click();


        driver.findElement(By.linkText("T-SHIRTS")).click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);

        //action.moveToElement(driver.findElement(By.linkText("Tops"))).build().perform();
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();

        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).sendKeys("T-SHIRTS");
        //Action sendPageDown = actions.sendKeys(Keys.PAGE_DOWN).build();
        //sendPageDown.perform();

        driver.findElement(By.id("add_to_cart")).click();

        driver.findElement(By.linkText("Proceed to checkout")).click();

        Thread.sleep(2000);

        driver.findElement(By.className("row")).click();

        driver.findElement(By.id("cart_title")).click();

        Thread.sleep(3000);

        //driver.quit();



    }

}
