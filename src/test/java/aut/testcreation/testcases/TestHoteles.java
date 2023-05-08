package aut.testcreation.testcases;

import aut.testcreation.pages.ReservaPage;
import aut.testcreation.pages.ResultadosPage;
import aut.testcreation.pages.RumboHomePage;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestHoteles extends SeleniumTestBase {
    WebDriver driver;

    RumboHomePage rumboHomePage;
    ReservaPage reservaPage;

    ResultadosPage resultadosPage;


    @Test
    public void CP0001_BusquedaAlojamiento_OK() throws InterruptedException {
        rumboHomePage= new RumboHomePage(super.driver);
        rumboHomePage.navigateTo("https://www.rumbo.es/");
        rumboHomePage.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePage.buscarLugarAlojamiento("barc");
        Thread.sleep(10000);
    }


    @Issue("123")
    @Issue("432")
    @DisplayName("Human-readable test name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test creado para bootcamp 9 tsoft")
    public void testDemo() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);
        Thread.sleep(5000);
        Assertions.assertTrue(true);
    }
}

