package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class atc01_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
     void serviciosRumbo(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        Assertions.assertAll(rumboHomePage.getUrlTitle());
    }
}
