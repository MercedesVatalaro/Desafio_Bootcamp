package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //locators

    By itemVuelosCentral = By.xpath("//div[@class=\"tab-button selected d-16uu04l\"]");

    By itemVuelosNav = By.xpath("//a[@class=\"evvzyi82 d-134lsl7 e89md6u0\"]//ancestor::div[@class=\"d-1ytebqy e10w470p3\"]");
    By origenLocator = By.xpath("//input[@id=\":Riqed6lalallbla2m:\"]");
    By itemOrigenLocator = By.name("bue");

    By destinoLocator = By.xpath("//input[@id=\":Rjaed6lalallbla2m:\"]");

    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocator = By.xpath("//button[@class=\"d-1rd1vwn\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\"d-fje0wm\"]");

    By agregaAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Aumentar el número de adultos\"]");

    By reduceAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Reducir el número de adultos\"]");


    By checkboxAniadirHotel = By.xpath("//input[@id=\"isDpSearch\"]//ancestor::div[@class=\"d-bss3ni\"]");

    By selectorFechaIdaLocator = By.xpath("//div[@class=\"d-fjquq8\"]");

    By selectorFechaVueltaLocator = By.xpath("//div[@class=\"d-fjquq8\"]");

    By inputOrigenBsAs = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");

    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\"]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]");
    //methods

    public void ingresarOrigen(String busqueda){
        click(origenLocator);
        write(busqueda,itemOrigenLocator);
    }
    public void ingresarFechaIda(){


    }
    public void iconoBusqueda(){

        click(btnBuscarLocator);
    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
