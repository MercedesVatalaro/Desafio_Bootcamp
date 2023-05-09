package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePageVuelos;
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

    RumboHomePageVuelos rumboHomePageVuelos;




    @Test //OK
    public void CP0007_DatosVueloDebeElegirDestino() throws InterruptedException {

    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
    rumboHomePageVuelos.navegarAlHome();
    rumboHomePageVuelos.rechazarCookies();
    Thread.sleep(5000);
    rumboHomePageVuelos.ingresarOrigen("Buenos Aires (BUE)");
    Thread.sleep(5000);
    rumboHomePageVuelos.borrarInputDestino();
    Thread.sleep(5000);
    rumboHomePageVuelos.ingresarFecha();
    Thread.sleep(5000);
    rumboHomePageVuelos.buscarVuelo();Thread.sleep(5000);
    Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumboHomePageVuelos.mensajeErrorIngreseDestino());


    }

    @Test //OK
    public void CP0008_DatosVueloAniadirHotel() throws InterruptedException {
    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
        rumboHomePageVuelos.navegarAlHome();
        rumboHomePageVuelos.rechazarCookies();
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarOrigen("Buenos Aires (BUE)");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarDestino("Santiago (SCL)");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarFecha();
        Thread.sleep(5000);
        rumboHomePageVuelos.aniadirHotel();
        Thread.sleep(5000);
        rumboHomePageVuelos.buscarVuelo();


    }

    @Test
    public void CP0009_DatosVuelo_Y_SeleccionVuelo() throws InterruptedException {
        rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
        rumboHomePageVuelos.navegarAlHome();
        rumboHomePageVuelos.rechazarCookies();
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarOrigen("Madrid");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarDestino("Santiago (SCL)");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarFecha();
        Thread.sleep(5000);
        rumboHomePageVuelos.buscarVuelo();
        Thread.sleep(5000);
        rumboHomePageVuelos.tildarOpcionIdayVuelta(true,true);
        Thread.sleep(5000);



    }

    @Test
    public void CP0010_reservaVuelomasRapido() throws InterruptedException {
        rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
        rumboHomePageVuelos.navegarAlHome();
        rumboHomePageVuelos.rechazarCookies();
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarOrigen("Madrid");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarDestino("Cancún (CUN)");
        Thread.sleep(5000);
        rumboHomePageVuelos.ingresarFecha();
        Thread.sleep(5000);
        rumboHomePageVuelos.buscarVuelo();
        Thread.sleep(5000);
        rumboHomePageVuelos.seleccionarMasRapido();

    }

    @Test
    public void CP0011_DatosReservaFaltaIngresarMedioDePago() {
    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
    rumboHomePageVuelos.navegarAlHome();
    rumboHomePageVuelos.rechazarCookies();
    rumboHomePageVuelos.ingresarOrigen("Sao Paulo (SAO)");
    rumboHomePageVuelos.ingresarDestino("Cancún (CUN)");
    rumboHomePageVuelos.ingresarFecha();
    rumboHomePageVuelos.buscarVuelo();

    }

    @Test
    public void CP0012_ReservaPersona_con_MovilidadReducida() {
        rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
        rumboHomePageVuelos.navegarAlHome();
        rumboHomePageVuelos.rechazarCookies();
        rumboHomePageVuelos.ingresarOrigen("Sao Paulo (SAO)");
        rumboHomePageVuelos.ingresarDestino("Cancún (CUN)");
        rumboHomePageVuelos.ingresarFecha();
        rumboHomePageVuelos.buscarVuelo();

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