package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleAramaStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google sayfasina gier")
    public void kullanici_google_sayfasina_gier() {
        System.out.println("kullanici googla gitti");

        Driver.getDriver().get("https://google.com");
            WebElement element1 = Driver.getDriver().findElement(By.xpath("(//div[@role='none'])[5]"));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", element1);
            element1.click();



    }
    @Given("arama kutusuna techproeducation yazar")
    public void arama_kutusuna_techproeducation_yazar() {
        System.out.println("kullanici techpro yazi");
        googlePage.searchBox.sendKeys("techproeducation"+ Keys.ENTER);

    }
    @Then("arama sonuclari sayfasinin basligini kontrol eder")
    public void arama_sonuclari_sayfasinin_basligini_kontrol_eder() throws InterruptedException {
        System.out.println("Kulllanici basligi kontrol etti");
        Thread.sleep(2000);
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains("techproeducation");
        Assert.assertTrue(iceriyorMu);
        Driver.CloseDriver();
    }
    @Given("arama kutusuna selenium yazar")
    public void arama_kutusuna_selenium_yazar() {
        System.out.println("Kullanici arama kutusuna selenium yazi");
        googlePage.searchBox.sendKeys("selenium"+Keys.ENTER);
    }

    @Then("arama sonuclari sayfasinin sonuc sayisimi kontrol eder")
    public void arama_sonuclari_sayfasinin_sonuc_sayisimi_kontrol_eder() {
        System.out.println("kullanici sonuc sayisini kontrol etti");
        String sonuc = googlePage.sonucSayisi.getText();
        System.out.println("toplam sonuc: "+sonuc);
        Driver.getDriver().close();
    }

    @Given("user searches {string}")
    public void user_searches(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify results has {string}")
    public void verify_results_has(String string) {
        String title = Driver.getDriver().getTitle();
        System.out.println("Title= "+title);
        Assert.assertTrue(title.contains(string));
        Driver.getDriver().close();
    }

}
