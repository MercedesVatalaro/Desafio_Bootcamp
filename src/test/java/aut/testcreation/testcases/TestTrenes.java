package aut.testcreation.testcases;

import aut.testcreation.pages.RumboTrenesPage;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTrenes extends SeleniumTestBase {
    WebDriver driver;

    RumboTrenesPage rumboTrenesPage;

    @Test
    public void CP00_BusquedadeBoletosTrenes(){
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarOrigen("Madrid (Mad)");
        rumboTrenesPage.ingresarDestino("Cordoba (Cor)");
        rumboTrenesPage.ingresarFecha();

    }















}
