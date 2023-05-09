package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class ReservaPage extends SeleniumWrapper {
    public ReservaPage(WebDriver driver) {
        super(driver, js);
    }
}
