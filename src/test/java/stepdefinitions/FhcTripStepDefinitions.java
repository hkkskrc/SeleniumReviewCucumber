package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.FhcTripKayitPage;
import pages.GooglePage;
import utilities.Driver;

public class FhcTripStepDefinitions {
    FhcTripKayitPage fhcTripKayitPage=new FhcTripKayitPage();
    @Given("kullanici fhctrip kayit sayfasina gider")
    public void kullanici_fhctrip_kayit_sayfasina_gider() {
        Driver.getDriver().get("http://fhctrip-qa.com/Account/Register");
    }

    @Given("kullanici username {string} girer")
    public void kullanici_username_girer(String string) {
        fhcTripKayitPage.username.sendKeys(string);
    }

    @Given("kullanici email {string} girer")
    public void kullanici_email_girer(String string) {
        fhcTripKayitPage.email.sendKeys(string);
    }

    @Given("kullanicifullname  {string} girer")
    public void kullanicifullname_girer(String string) {
       fhcTripKayitPage.fullName.sendKeys(string);
    }

}
