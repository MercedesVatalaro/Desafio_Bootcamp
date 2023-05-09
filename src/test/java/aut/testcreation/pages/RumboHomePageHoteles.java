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
import static org.junit.Assert.assertTrue;

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
    By txtPrecioLocator = By.xpath("//div[@class='sc-rZqKh jEcotq']/div[1]//span[@class='sc-iqavZe kDhOEP']");
    By selectHotelLocator = By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By btnResevaDesdeLocator = By.xpath("//div[contains(@class, 'info-book')]");
    By selectSoloAlojamientoLocator = By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");
    By txtEmailLocator= By.xpath("//input[@id='contact-email']");
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

    public void aceptarCookies (){
        click(btnCookiesAceptarLocator);
    }
    public void ingresarSeccionHoteles() {

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

    public void cambiarPestania (){
        navigateTo("https://secure.rumbo.es/");
    }

    public void elegirHotel () throws InterruptedException {
        click(selectHotelLocator);
        Thread.sleep(10000);

        buscarElementosWeb(btnResevaDesdeLocator);
        click(btnResevaDesdeLocator);
    }

    public void verificarPrecioHotel () {

        buscarElementosWeb(txtPrecioLocator);

        String precio = obtenerTexto(txtPrecioLocator);

        if(!precio.isEmpty()) {
            System.out.println("El precio es: " + precio);
            } else {
            System.out.println("El precio está vacío");
            }
    }

    public void ingresarDatosUsuario (String nombre, String apellido, String email, int telefono){

        write(nombre, txtNombreLocator);
        write(apellido, txtApellidoLocator);
        write(email, txtEmailLocator);
        seleccionarComboBoxPorTextoVisible(buscarElementoWeb(cbCodigoAreaLocator), "+54");
        write(String.valueOf(telefono), txtTelefonoLocator);

    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
