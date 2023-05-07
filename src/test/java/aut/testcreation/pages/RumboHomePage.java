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

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");
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








    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
