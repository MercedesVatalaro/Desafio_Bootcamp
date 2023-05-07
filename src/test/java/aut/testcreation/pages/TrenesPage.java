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

    //CP0014
    By itemTrenesHotel = By.xpath("//div[@class=\"tab-button selected evvzyi82 d-1l2p86v )\"]");

    By selecorigenLocator = By.xpath("//input[@id=\":Rmhl6lalaqlql2m:\"]");
    By itemOrigenBar = By.name("Bar");

    By destinoCor = By.xpath("//input[@id=\":Rqhl6lalaqlql2m:\"]");

    By SelecFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By SelecFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocatortreh = By.xpath("//button[@class=\"d-1vl9gkt\"]");

    By cargaPasajerosLocatortrenh = By.xpath("//div[@class=\\\"d-1k5t2mm\\\"]");

    By anadirhabitacionLocaltor = By.xpath("//button[@class=\"d-1yh6sny\"]");

    //CP0015
    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");
    By txtTelefonoLocator = By.xpath("//input[@name='phone']");
    By Srapasajero = By.xpath("//div[@class=\"radio-group-choices__wrapper\"]");
    By tNombreLocator = By.xpath("//input[@name='name']");
    By ApellidoLocator = By.xpath("//input[@name='surname']");
    By TelefonoLocator = By.xpath("//input[@name='phone']");













}
