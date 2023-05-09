package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePageHoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class atc01_POM extends SeleniumTestBase {

    RumboHomePageHoteles rumboHomePage;

    @Test
     void serviciosRumbo(){
        rumboHomePage = new RumboHomePageHoteles(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        Assertions.assertAll(rumboHomePage.getUrlTitle());
    }
}
