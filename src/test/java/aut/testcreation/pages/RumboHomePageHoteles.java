package aut.testcreation.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.engine.utils.Constants.BASE_URL_AUT;
import static org.junit.Assert.assertFalse;

public class RumboHomePageHoteles extends SeleniumWrapper {

    public RumboHomePageHoteles(WebDriver driver) {
        super(driver);
    }

    //localizadores de HOTELES
    By btnHotelesLocator = By.xpath("(//a[@title='Hoteles'][normalize-space()='Hoteles'])[1]");
    By btnCookiesAceptarLocator = By.xpath("//button[contains(text(),'Aceptar todo')]");
    By buscarAlojamientoEnLocator = By.xpath("(//input[@id=':R8qjalalaqlql2m:'])[1]");
    By primerOpcionAlojamientoEnLocator = By.xpath("//li[@id=':R8qjalalaqlql2m:-option-0']");
    By seleccionFechaDeEntradaLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/button[4]");
    By seleccionFechaDeSalidaLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/button[9]");
    By btnMasPersonasLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/button[2]");
    By btnBuscarHotelesLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]/div[1]/*[1]");
    By selectPrimerHotelLocator= By.xpath("(//a[@class='sc-jFJHMl jtYlit'])[1]");
    By btnReservarLocator = By.xpath("//button[@class='Button-sc-1bbve8d-0 bsSjVP Hero___StyledScrollToIdButton-sc-1pqg2ch-22 bZMZIZ']");
    By btnSoloAlojamientoLocator = By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
    By btnContinuarReservaLocator = By.xpath("//button[normalize-space()='Continuar']");
    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");
    By cbCodigoAreaLocator = By.xpath("//li[@class='country highlight preferred']//span[@class='country-name'][normalize-space()='Argentina']");
    By txtTelefonoLocator = By.xpath("//input[@name='phone']");
    By selectorNoProtegerViajeLocator = By.xpath("//label[@class='insurance__noThanks-radio-label']//span[@class='circle']");
    By txtBonoDescuentoLocator = By.xpath("//input[@name='voucher']");
    By btnAplicarDescuentoLocator = By.xpath("//div[contains(text(),'Aplicar')]");
    By selectorTarjetaCreditoDebitoLocator = By.xpath("//span[@data-test='radio-paymentGroups-creditCard-custom-radio']//span[@class='check']");
    By txtNombreTitularTarjetaLocator = By.xpath("(//input[@name='creditCard.cardHolder'])[1]");
    By txtNumeroTarjetaLocator = By.xpath("(//input[@name='creditCard.cardNumber'])[1]");
    By txtMesTarjetaLocator = By.xpath("//input[@placeholder='MM']");
    By txtYearTarjetaLocator = By.xpath("//input[@placeholder='AA']");
    By txtCVVLocator = By.xpath("//input[@name='creditCard.cvv']");
    By selectorOfertasLocator = By.xpath("//span[@data-test='privacyPolicy-check']");

    //methods


    public void ingresarSeccionHoteles() {
        click(btnCookiesAceptarLocator);
        click(btnHotelesLocator);
    }

    public void buscarLugarAlojamiento ( String lugar){

       // WebElement esperarAlojamiento = findElement(buscarAlojamientoEnLocator);
        click(buscarAlojamientoEnLocator);
        write(lugar, buscarAlojamientoEnLocator);
        click(primerOpcionAlojamientoEnLocator);
    }


    public void fechaEntradaSalida () throws InterruptedException {

        click(seleccionFechaDeEntradaLocator);
        Thread.sleep(5000);
        click(seleccionFechaDeSalidaLocator);
    }

    public void buscarHotel() throws InterruptedException {
        click(btnBuscarHotelesLocator);
        Thread.sleep(3000);
    }

    public void clickCantMaximaPersonas() {
        buscarElementosWeb(btnMasPersonasLocator);
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            click(btnMasPersonasLocator);
            contador++;
        }
        if (contador == 10) {
            System.out.println("La cantidad de personas no puede superar los 10");
        }
    }

    public void ReservarHotel () throws InterruptedException {
        click(selectPrimerHotelLocator);
        Thread.sleep(15000);
        scrolling(buscarElementoWeb(btnReservarLocator));
        Thread.sleep(2000);
        click(btnReservarLocator);
        //scrolling(buscarElementoWeb(btnReservarLocator));
        //Thread.sleep(2000);
        //click(btnSoloAlojamientoLocator);
    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
