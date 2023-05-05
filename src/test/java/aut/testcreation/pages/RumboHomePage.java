package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    By selectorFechaLocator = By.xpath("//div[@class=\"d-fjquq8\"]");

    By inputOrigenBsAs = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");

    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\"]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]");

    //localizadores de HOTELES
    By btnHotelesLocator = By.xpath("//button[.='Hoteles']");
    By txtBuscarLugarAlojamientoLocator = By.xpath("//label[.='Buscar alojamiento en']");
    By selectorFechaEntradaLocator = By.xpath("(//label[normalize-space()='Fecha de entrada'])[1]");
    By selectorFechaSalidaLocator = By.xpath("(//label[normalize-space()='Fecha de salida'])[1]");
    By btnMasPersonasLocator = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By btnAgregarHabitacionLocator = By.xpath("//button[normalize-space()='Añadir habitación']");
    By btnMasHabitacionLocator = By.xpath("//section[2]//button[2]");
    By btnAplicarPersonasHabitacionLocator = By.xpath("//button[.='Aplicar']");
    By btnBuscarHotelesLocator = By.xpath("(//button[contains(@aria-label,'Buscar')])[2]");
    By selectorHotelLocator = By.xpath("//div[@class='sc-ZzDLD jNAHvM']/div[1]/a[1]");
    By selectorSoloAlojamientoLocator = By.xpath("(//div)[208]");
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

    public void ingresarOrigen(String busqueda) {
        click(origenLocator);
        write(busqueda, itemOrigenLocator);
        if (isDisplayed(origenLocator)) {
            click(inputOrigenBsAs);
        }
    }
    public void ingresarFecha(){
            List<WebElement> fechaIngresada = findElements(selectorFechaLocator);

               if(fechaIngresada.size()==2){
                    fechaIngresada.get(0).click();
                    fechaIngresada.get(1).click();
                }

}

    public void iconoBusqueda(){

        click(btnBuscarLocator);
    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
