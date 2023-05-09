package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePageHoteles;
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
import static org.junit.Assert.assertFalse;

public class TestHotelesRumbo extends SeleniumTestBase {
    WebDriver driver;

    RumboHomePageHoteles rumboHomePageHoteles;




    @Test
    public void CP0001_BusquedaAlojamiento_OK() throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        Thread.sleep(5000);
    }
    @Test
    public void CP0002_BusquedaAlojamiento_CantMaxPersonas () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(1000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.clickCantMaximaPersonas();
    }

    @Test
    public void CP0003_ReservaAlojamiento_PagoRechazado () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        rumboHomePageHoteles.ReservarHotel();


    }

    @Test
    public void CP0003_ReservaAlojamiento_DatosUsuario_OK (){

    }




    @Issue("123")
    @Issue("432")
    @DisplayName("Human-readable test name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test creado para bootcamp 12 tsoft")
    public void testDemo() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);
        Thread.sleep(5000);
        Assertions.assertTrue(true);
    }
}

