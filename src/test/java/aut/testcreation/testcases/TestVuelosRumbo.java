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
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestVuelosRumbo extends SeleniumTestBase {
    WebDriver driver;

    RumboHomePage rumboHomePage;
    ReservaPage reservaPage;

    ResultadosPage resultadosPage;

    @Test
    public void CP0007_DatosVueloDebeElegirDestino() {
    rumboHomePage= new RumboHomePage(super.driver);
    rumboHomePage.navigateTo("https://www.rumbo.es/");
    rumboHomePage.rechazarCookies();
    rumboHomePage.ingresarOrigen("Buenos Aires (BUE)");
    rumboHomePage.borrarInputDestino();
    rumboHomePage.ingresarFecha();
    rumboHomePage.buscarVuelo();
    Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumboHomePage.mensajeErrorIngreseDestino());




    }

    @Test
    public void CP0008_DatosVueloAniadirHotel(){
    rumboHomePage= new RumboHomePage(super.driver);
        rumboHomePage.navigateTo("https://www.rumbo.es/");
        rumboHomePage.rechazarCookies();
        rumboHomePage.ingresarOrigen("Buenos Aires (BUE)");
        rumboHomePage.ingresarDestino("Santiago (SCL)");
        rumboHomePage.ingresarFecha();

        rumboHomePage.buscarVuelo();

    }

    @Test
    public void CP0011_DatosReservaFaltaIngresarMedioDePago() {
    rumboHomePage= new RumboHomePage(super.driver);
    rumboHomePage.navigateTo("https://www.rumbo.es/");

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