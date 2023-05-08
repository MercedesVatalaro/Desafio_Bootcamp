package framework.engine.selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SeleniumWrapper {


    private final WebDriver driver;
    private Select select;
    private WebDriverWait wait;
    private JavascriptExecutor js;


    //Constructor Base
    public SeleniumWrapper(WebDriver driver){
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void click(WebElement elemento){
        elemento.click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public void clear(By locator) {
        WebElement indexTexto = driver.findElement(locator);
        indexTexto.clear();
    }
    public void submit(By locator) {
        WebElement enviarDatos = driver.findElement(locator);
        enviarDatos.submit();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public String getUrlTitle(){
        return driver.getTitle();
    }


    public WebElement buscarElementoWeb (By localizador){
        return driver.findElement(localizador);
    }

    public List<WebElement> buscarElementosWeb (By localizador){
        return driver.findElements(localizador);
    }

     public void escribir (String texto, WebElement elemento){
        elemento.sendKeys(texto);
        elemento.click();
    }

    public void cerrarVentana (){
        driver.close();
    }

    public String obtenerTexto (By localizador){
        return driver.findElement(localizador).getText();
    }

    public Boolean estaDesplegado (By localizador){
        try{
            return driver.findElement(localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }

    }

    public Boolean estaSeleccionado(By localizador){
        try{
            return driver.findElement(localizador).isSelected();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }

    }

    public void scroll(int horizontal, int vertical) {
        ((JavascriptExecutor) driver).executeScript("scroll(" + horizontal + "," + vertical + ")");
    }
    public void scrolling (WebElement elemento){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento); //hace scroll hasta encontrar el elemento
    }
    public void scrolling (By locator){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", locator); //hace scroll hasta encontrar el elemento
    }

    public void seleccionarComboBoxPorTextoVisible(WebElement elemento, String valor){
        select = new Select(elemento);
        select.selectByVisibleText(valor);

    }

    public WebElement esperarPorElementoVisible (WebElement elemento){
        wait = new WebDriverWait(driver, 20);

        return wait.until(ExpectedConditions.visibilityOf(elemento));
    }



}
