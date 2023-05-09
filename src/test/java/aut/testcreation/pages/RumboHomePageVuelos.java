package aut.testcreation.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
    By origenLocator = By.xpath("//input[@aria-label=\"Origen\"]");

    By origenPresenteLocator = By.xpath("//input[@value=\"Madrid (MAD) - Adolfo Suárez Barajas, España\"]");
    By itemVuelosCentral = By.xpath("//div[@class=\"tab-button selected d-16uu04l\"]");

    By itemVuelosNav = By.xpath("//a[@class=\"evvzyi82 d-134lsl7 e89md6u0\"]//ancestor::div[@class=\"d-1ytebqy e10w470p3\"]");

    By destinoLocator = By.xpath("//input[@aria-label=\"Destino\"]");

    By destinoVacioLocator= By.xpath("//input[@value=\"\" and @aria-label=\"Destino\"]");
    By btnBorrarDatosOrigen = By.xpath("//button[@class=\"d-1nmp0nm ed5mks90\" ]//preceding::label[@class=\"d-1vyfrs4\" and contains(text(), 'Origen')]");
    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocator = By.xpath("//button[@class=\"d-1rd1vwn\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\"d-fje0wm\"]");

    By agregaAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Aumentar el número de adultos\"]");

    By reduceAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Reducir el número de adultos\"]");

    By checkboxAniadirHotel = By.xpath("//input[@id=\"isDpSearch\"]//ancestor::div[@class=\"d-bss3ni\"]");
    By selectorFechaIdaLocator = By.xpath("//button[@class=\"d-1kuzy14\"]//preceding::span[contains(text(), 'mayo 2023')][1]");
    By selectorFechaVueltaLocator = By.xpath("//button[@class=\"d-1kuzy14\"]//preceding::span[contains(text(), 'junio 2023')][1]");
    By inputOrigenElegido = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]//preceding::label[contains(text(), 'Origen')][1]");
    By inputDestinoElegido = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]//preceding::label[contains(text(), 'Destino')][1]");

    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Introduce ciudad o aeropuerto de destino')]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]//ancestor::div[@class=\"d-xxdz9z\"]");

    By selectorVuelomasRapido = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'Container__StyledContainer-sc-sb5e2u-0 cenTRx')]//ancestor::h5[normalize-space()='Más rápido']");

    By selectOpcionesIda = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[1]");

    By tildeOpcionIdaElegida = By.xpath("//div[@aria-labelledby=\"mui-336\"]");

    By tildeOpcionVueltaElegida = By.xpath("//div[@aria-labelledby=\"mui-514\"]");
    By selectOpcionesVuelta = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[2]");

    By selectEsperarResultados = By.xpath("//title[contains(text(), 'Rumbo vuelos baratos Buenos Aires - Santiago')]");
    By selectFiltrarvuelos = By.xpath("//ul[@class=\"Tabs__UlElement-cncr__sc-61rlvo-0 evvvUR\"]");

    By locatorCheckBoxsVuelos = By.xpath("//div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 fXPHoK\"]");
    public void rechazarCookies(){
        if(isEnabled(cookiesLocator)){
            click(rechazarCookiesLocator);

        }

    }

    public void ingresarOrigen(String origen) {

        click(btnBorrarDatosOrigen);
        click(origenLocator);
        clear(origenLocator);

        write(origen, origenLocator);

        if (isDisplayed(origenLocator)) {

            click(inputOrigenElegido);
        }
    }
    public void ingresarDestino(String destino) {


        click(destinoLocator);
        //clear(destinoLocator);
        write(destino, destinoLocator);

        if (isDisplayed(destinoLocator)) {

            click(inputDestinoElegido);
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

    switchToTabByTitleContains("Rumbo vuelos baratos Madrid - Cancún");

    click(selectorVuelomasRapido);

    }

    /*public void seleccionarVueloIda() throws InterruptedException {

        switchToTabByTitleContains("Rumbo vuelos baratos Madrid - Santiago");
        if(isEnabled(selectOpcionesIda)){

        click(tildeOpcionIdaElegida);
        }


    }

    public void seleccionarVueloVuelta() {
        if (isEnabled(selectOpcionesVuelta)) {

            click(tildeOpcionVueltaElegida);
        }
    }*/
    public void tildarOpcionIdayVuelta(boolean ida, boolean vuelta){
        List <WebElement> checks = buscarElementosWeb(locatorCheckBoxsVuelos);

        scrolling(checks.get(0));

        if(ida){
            clickear(checks.get(0));
        }

        scrolling(checks.get(1));

        if(vuelta){
            clickear(checks.get(1));
        }

    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }





}
