package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePageVuelos;
import aut.testcreation.pages.RumboTrenesPage;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTrenes extends SeleniumTestBase {
    WebDriver driver;

    RumboTrenesPage rumboTrenesPage;

    @Test
    public void CP0013_BusquedadeBoletosTrenes31Noches(){
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarOrigen("Madrid (Mad)");
        rumboTrenesPage.ingresarDestino("Cordoba (Cor)");
        rumboTrenesPage.fechaIdaVuelta();

        Assertions.assertEquals("ILo sentimos, no se pueden reservar más de 31 noches", rumboTrenesPage.mensajedeErrorFecha());


    }

    @Test
    public void CP00014_DatosViajeTrenesHotel() {
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarOrigen("Buenos Aires (BUE)");
        rumboTrenesPage.ingresarDestino("Santiago (SCL)");
        rumboTrenesPage.fechaIdaVuelta();


    }




}
