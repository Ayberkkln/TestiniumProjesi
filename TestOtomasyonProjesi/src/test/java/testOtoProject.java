import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testOtoProject {


    @Test
    public void ilkTestCase() throws InterruptedException {

        //ChromeDriver ile gittigidiyor sitesine giriş yapıldı

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/uye-girisi");

        //Giriş için bilgiler girildi ve Giriş tuşuna basıldı

        driver.findElement(By.cssSelector("#H-Login")).click();
        driver.findElement(By.id("L-UserNameField")).sendKeys("ayberktest123@gmail.com");
        driver.findElement(By.id("L-PasswordField")).sendKeys("test1234test");
        driver.findElement(By.cssSelector("#gg-login-enter")).click();

        //Gelen sayfada arama kutucuğuna tıklandı ve Bilgisayar kelimesi arandı

        WebElement searchBox = driver.findElement(By.cssSelector("#main-header > div:nth-child(3) >" +
                               " div > div > div > div.sc-1nx8ums-0.fXQfgp > form > div > div.sc-1yew439-3.dkiUfE > div.sc-4995aq-4.dNPmGY > input"));
                ((WebElement) searchBox).click();
                searchBox.sendKeys("Bilgisayar");
        driver.findElement(By.className("qjixn8-0 sc-1bydi5r-0 hKfdXF")).click();

        //Gelen sayfadan 2. sayfaya geçiş yapıldı ve bir ürün seçildi

        driver.findElement(By.cssSelector("#best-match-right > div.pager.pt30.hidden-m.gg-d-24 > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("product_id_646934313")).click();

        //Açılan ürünü sepete ekleme

        driver.findElement(By.id("add-to-basket")).click();

        //Sepete git tuşuna basılır

        driver.findElement(By.cssSelector("#header_wrapper > div.header-icon-container.robot-header-iconContainer." +
                "gg-w-5.gg-d-6.gg-t-14.gg-m-11.gg-w-push-14.gg-d-push-12.gg-t-push-0.gg-m-push-0 > div.basket-container.robot-header-iconContainer-cart > a")).click();

        //Sepette ürün sayısı 2ye çıkartılır

        driver.findElement(By.cssSelector("#cart-item-455065194 > div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none.product-item-box-container " +
                "> div.gg-w-4.gg-d-4.gg-t-5.gg-m-16.pull-right-m.hidden-m.padding-none > div > span.plus.icon-plus.gg-icon.gg-icon-plus")).click();

        //Sepetteki ürünler silinir

        driver.findElement(By.id("646934313")).click();

    }

}


