package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    //Rechazar cookies

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");
    By origenLocator = By.xpath("//input[@id=\":Riqed6lalallbla2m:\"]");
    By itemVuelosCentral = By.xpath("//div[@class=\"tab-button selected d-16uu04l\"]");

    By itemVuelosNav = By.xpath("//a[@class=\"evvzyi82 d-134lsl7 e89md6u0\"]//ancestor::div[@class=\"d-1ytebqy e10w470p3\"]");

    By itemOrigenLocator = By.name("Buenos Aires (BUE");

    By destinoLocator = By.xpath("//input[@id=\":Rjaed6lalallbla2m:\"]");

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
    By inputDestinoSantiagoCl = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\" and @value=\"Santiago (SCL) - Arturo Merino Benítez, Chile\"]");

    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Introduce ciudad o aeropuerto de destino')]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]//ancestor::div[@class=\"d-xxdz9z\"]");

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


    public void rechazarCookies(){
        if(isEnabled(cookiesLocator)){
            click(rechazarCookiesLocator);

        }

    }

   public void ingresarOrigen(String origen) {

        WebElement inputIngreseOrigen = findElement(origenLocator);
        click(origenLocator);
        inputIngreseOrigen.clear();
        write(origen, origenLocator);

        if (isDisplayed(origenLocator)) {
            click(inputOrigenBsAs);
        }
    }
    public void ingresarDestino(String destino) {

        click(destinoLocator);
        clear(destinoLocator);
        write(destino, destinoLocator);

        if (isDisplayed(destinoLocator)) {
            click(inputOrigenBsAs);
        }
    }
    public void borrarInputDestino(){

        click(destinoLocator);
        clear(destinoLocator);

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

        click(btnBuscarLocator);
    }
    public String mensajeErrorIngreseDestino() {
        return getText(mjeErrorIntroduceDestino);
    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
