package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static framework.engine.utils.Constants.BASE_URL_AUT;


public class RumboHomePageVuelos extends SeleniumWrapper {

    public RumboHomePageVuelos(WebDriver driver) {
        super(driver);
    }
    //locators

    //Rechazar cookies

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");
    By origenLocator = By.xpath("//input[@id=\":Riqed6lalallbla2m:\"]");
    By itemVuelosCentral = By.xpath("//div[@class=\"tab-button selected d-16uu04l\"]");

    By itemVuelosNav = By.xpath("//a[@class=\"evvzyi82 d-134lsl7 e89md6u0\"]//ancestor::div[@class=\"d-1ytebqy e10w470p3\"]");

    By itemOrigenLocator = By.name("Buenos Aires (BUE");

    By destinoLocator = By.xpath("//input[@id=\":Rjaed6lalallbla2m:\"]");

    By origenVacioLocator = By.xpath("//input[@value=\"\" and @aria-label=\"Origen\"]");

    By destinoVacioLocator= By.xpath("//input[@value=\"\" and @aria-label=\"Destino\"]");
    By btnBorrarDatosOrigen = By.xpath("//button[@class=\"d-1nmp0nm ed5mks90\" ]//preceding::label[@class=\"d-1vyfrs4\" and contains(text(), 'Origen')]");
    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocator = By.xpath("//button[@class=\"d-1rd1vwn\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\"d-fje0wm\"]");

    By agregaAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Aumentar el número de adultos\"]");

    By reduceAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Reducir el número de adultos\"]");

    By checkboxAniadirHotel = By.xpath("//input[@id=\"isDpSearch\"]//ancestor::div[@class=\"d-bss3ni\"]");

    By selectorFechaVueltaLocator = By.xpath("//button[@class=\"d-1kuzy14\" and contains(number(), '31')]");

    By selectorFechaIdaLocator = By.xpath("//button[@class=\"d-1kuzy14\" and contains(number(), '17')]//ancestor::div[@aria-labelledby=\"5\"]");
    By inputOrigenBsAs = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");
    By inputDestinoSantiagoCl = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");

    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Introduce ciudad o aeropuerto de destino')]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]//ancestor::div[@class=\"d-xxdz9z\"]");

    By selectorVuelomasRapido = By.xpath("//div[@class=\"Container__StyledContainer-sc-sb5e2u-0 cenTRx\"]//li[3]//h5[contains(text(), 'Más rápido')]");

    By selectPrimerOpcionIda = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[1]");

    By selectPrimerOpcionVuelta = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[2]");


    public void rechazarCookies(){
        if(isEnabled(cookiesLocator)){
            click(rechazarCookiesLocator);

        }

    }

    public void ingresarOrigen(String origen) {


        click(origenLocator);
        clear(origenLocator);
        isSelected(origenVacioLocator);
        write(origen, origenLocator);

        if (isDisplayed(origenLocator)) {
            click(inputOrigenBsAs);
        }
    }
    public void ingresarDestino(String destino) {


        click(destinoLocator);
        clear(destinoLocator);
        isSelected(destinoVacioLocator);
        write(destino, destinoLocator);

        if (isDisplayed(destinoLocator)) {
            click(inputDestinoSantiagoCl);
        }
    }
    public void borrarInputDestino(){

        click(destinoLocator);
        clear(destinoLocator);
        isSelected(destinoVacioLocator);

    }
    public void ingresarFecha(){


        click(inputFechaIdaLocator);

        if(isDisplayed(inputFechaIdaLocator)){
            WebElement fechaIdaSeleccionada = findElement(selectorFechaIdaLocator);
            click(selectorFechaIdaLocator);
            boolean sehizoClick = fechaIdaSeleccionada.getAttribute("class").contains("selected");
            if(sehizoClick){

                click(selectorFechaVueltaLocator);
            }

        }

    }



    public void buscarVuelo(){

        submit(btnBuscarLocator);

    }
    public String mensajeErrorIngreseDestino() {
        return getText(mjeErrorIntroduceDestino);
    }

    public void aniadirHotel(){
        click(checkboxAniadirHotel);

    }

    public void seleccionarMasRapido(){

        click(selectorVuelomasRapido);

    }
    public void seleccionarVueloIda(){
        click(selectPrimerOpcionIda);
    }

    public void seleccionarVueloVuelta(){

        click(selectPrimerOpcionVuelta);
    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }





}
