import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class AutoTest {

     private WebDriver driver;
     @Before
     public void beforTest() {
         System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://www.mcdonalds.ua/");
         driver.manage().window().maximize();
     }

     @Test

      public void test1 () throws InterruptedException {
         driver.findElement(By.xpath("//*[@id=\"nav-links\"]/li[1]/a/span")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html//section[@id='page-content']/div[@class='columncontrol parbase']/div[@class='multicolumn-section']/div[2]//div[@class='multicolumn-section']/div[2]/div[2]/div[@id='everythingcontainer']/div[@id='everythingmain']//div[@class='EverythingComponenttext']/div[@id='text']/table//a[@href='https://www.mcdonalds.ua/ua/Eat/menu/fullmenu.html']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@id='product-nav']//ul[@class='main-product-nav pull-left']/li[8]/a[@href='#']/h2[1]")).click();
     }

     @Test

     public void test2 () throws InterruptedException {
         driver.findElement(By.xpath("//ul[@id='social-nav']//a[@href='#']")).click();
         Thread.sleep(3000);
         driver.findElement(By.name("q")).sendKeys("Хеппі Міл");
         Thread.sleep(3000);
         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html//section[@id='page-content']/div[2]/div[@class='search-results-wrapper']/div[@class='search-results-list']/div[6]/div[2]/h4/a[@href='http://www.mcdonalds.ua/ua/Play/happy_toys_meal.html']")).click();
         Thread.sleep(3000);
     }

     @Test

    public void test3 () throws InterruptedException {
         driver.findElement(By.className("findus-nav")).click();
         Thread.sleep(3000);
         driver.findElement(By.name("qstore")).sendKeys("Одеса");
         Thread.sleep(3000);
         driver.findElement(By.name("qstore")).sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@id='result-container']/div[3]/div//a[@class='link-yellow']/span[3]")).click();
     }

     @Test

    public void test4 () throws InterruptedException {
         driver.findElement(By.xpath("//div[@id='promoBox']/div/div[2]/a[@href='/content/ua/Know/working_at_mcDdonalds/why_mcdonalds.html']")).click();
         Thread.sleep(3000);
         driver.findElement(By.className("btn")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("city")).click();
         Thread.sleep(3000);
         driver.findElement(By.cssSelector("select#city > option[value='5']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//ul[@id='vacancy-list']//a[@href='/ukr/robota-v-makdonaljdz/anketa-na-robotu/13/1']")).click();

     }


     @After
     public void AfterTest() {
         driver.close();
     }
}
