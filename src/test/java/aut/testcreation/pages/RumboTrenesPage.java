package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RumboTrenesPage extends SeleniumWrapper {
    public RumboTrenesPage(WebDriver driver) {
        super(driver);
    }
    //locators

    //Rechazar cookies

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");

    By itemTrenesCentral = By.xpath("//div[@class=\"tab-button selected evvzyi82 d-134lsl7)\"]");

    By origenLocator = By.xpath("//input[@id=\":Rmhl6lalaqlql2m:\"]");
    By itemOrigenLocator = By.name("Madrid (madr)");

    By destinoLocator = By.xpath("//input[@id=\":Rqhl6lalaqlql2m:\"]");
    By itemDestinoLocator = By.name("Cordoba (Cor)");

    By origenVacioLocator = By.xpath("//input[@value=\"\" and @aria-label=\"Origen\"]");
    By destinoVacioLocator= By.xpath("//input[@value=\"\" and @aria-label=\"Destino\"]");

    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By mjeError31DiasoMas= By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Lo sentimos, no se pueden reservar más de 31 noches')]");

    By itemTrenesHotel = By.xpath("//div[@class=\"tab-button selected evvzyi82 d-1l2p86v )\"]");

    By selectorFechaVueltaLocator = By.xpath("//button[@class=\"d-ccz9o3\" and contains(number(), '16')]");

    By selectorFechaIdaLocator = By.xpath("//button[@class=\"d-ccz9o3\" and contains(number(), '14')]//ancestor::div[@aria-labelledby=\"5\"]");
    By selecorigenLocator = By.xpath("//input[@id=\":Rmhl6lalaqlql2m:\"]");


    By DestinoLocator = By.xpath("//input[@id=\"d-1r0xobh ed5mks91\"]");




    By FechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By FechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocatortreh = By.xpath("//button[@class=\"d-1vl9gkt\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\\\"d-1k5t2mm\\\"]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]//ancestor::div[@class=\"d-xxdz9z\"]");

    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");
    By txtTelefonoLocator = By.xpath("//input[@name='phone']");
    By SrapasajeroLocator = By.xpath("//div[@class=\"radio-groups.1.travellers.1.title-MALE-label\"]");

    By txtPasajeroNombreLocator = By.xpath("//input[@name='name']");
    By txtPasajeroApellidoLocator = By.xpath("//input[@name='surname']");
    By inputDiaNacimientoLocator = By.xpath("//input[@id=\"input-groups.1.travellers.1.dateOfBirth-day\"]//ancestor::div[@class=\"form-control text-input date__field date_day\"]");

    By mesNacimientoLocator = By.xpath("//select[@class='form-control select-input date__field' and @aria-label='Selecciona el mes']");

    By anoNacimientoLocator = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year' and @class='form-control text-input date__year date__field ']");

    By SelecionDocumentoLocator = By.xpath("//select[@class='form-control select-input' and @aria-label='groups.1.travellers.1.documentType' ]");

    By checkboxAniadirAsistenciaEsp = By.xpath("//input[@id=\"checkbox \"]//ancestor::div[@class=\"check\"]");

    By siguienteButtonLocator = By.xpath("//button[contains(text(), 'Siguiente')]");


    By inputOrigenMadrid = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");
    By inputDestinoCordoba = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");





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
            click(inputOrigenMadrid);
        }
    }

    public void ingresarDestino(String destino) {


        click(destinoLocator);
        clear(destinoLocator);
        isSelected(destinoVacioLocator);
        write(destino, destinoLocator);

        if (isDisplayed(destinoLocator)) {
            click(inputDestinoCordoba);
        }
    }
    public void ingresarFecha(){

        click(inputFechaIdaLocator);

        if(isDisplayed(inputFechaIdaLocator)) {
            WebElement fechaIdaSeleccionada = findElement(selectorFechaIdaLocator);
            click(selectorFechaIdaLocator);
            boolean sehizoClick = fechaIdaSeleccionada.getAttribute("class").contains("selected");


        }
    }





}
