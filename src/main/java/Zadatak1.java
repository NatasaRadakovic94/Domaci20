import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.AbstractExecutorService;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\bootcamp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Natasa");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("natasa@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Novi Sad");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Novi Sad");

        //Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        /*String expectedFullName = "Natasa";
        String actualFullName = driver.get();
        if (expectedFullName.equals(actualFullName)) {
            System.out.println("Full name je isti");
        } else {
            System.out.println("Full name nije isti");
        }
    */}
    }
/*Napraviti maven projekat i dodati selenium dependency.
U Mainu preko selenijuma otici na https://demoqa.com/text-box.
Zadatak je da popunite sva polja (Full Name, email, Current Address, Permanent Address) i da kliknete submit.
Uporediti da li u rezultatu (ispod submit), full name i email su isti kao uneseni pre submita, da nije doslo do izmene.
Upisati odgovarajucu poruku ako su isti ili ako se razlikuju podaci.
Zadatak okaciti na github.

*/