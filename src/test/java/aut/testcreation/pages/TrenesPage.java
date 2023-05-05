package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPage extends SeleniumWrapper {
    public TrenesPage(WebDriver driver) {
        super(driver);
    }
    By itemTrenesCentral = By.xpath("//div[@class=\"tab-button selected evvzyi82 d-134lsl7)\"]");

    By origenLocator = By.xpath("//input[@id=\":Rmhl6lalaqlql2m:\"]");
    By itemOrigenLocator = By.name("mad");

    By destinoLocator = By.xpath("//input[@id=\"::Rqhl6lalaqlql2m:\"]");

    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocator = By.xpath("//button[@class=\"d-1vyfrs4\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\"d-1rd1vwn\"]");

    By agregaAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Aumentar el número de adultos\"]");

    By reduceAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Reducir el número de adultos\"]");

    By mjeErrorMasde31dias = By.xpath("//span[@class=\"d-1toc9z2\"]");

    By buttonBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]");

}
