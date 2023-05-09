package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class SeleniumWrapper {

    protected final WebDriver driver;
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
    public void clickear(WebElement elemento){
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
    public void cambiarDePestania() {

        // Hacer clic en un enlace que abre una nueva pestaña
        driver.findElement(By.linkText("Abrir nueva pestaña")).click();

// Esperar a que se abra la nueva pestaña y cambiar el enfoque
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            String originalWindowHandle = driver.getCurrentUrl();
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void switchToTabByTitleContains(String searchStr) {
 for (String ventana : driver.getWindowHandles()) {
 driver.switchTo().window(ventana);
 if (driver.getTitle().contains(searchStr)) {
return;
 }
 }
 }
    public List <WebElement> buscarElementosWeb(By localizador){
        return driver.findElements(localizador);
    }

    public void scrolling(WebElement elemento){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }
    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public String getUrlTitle(){
        return driver.getTitle();
    }

}
