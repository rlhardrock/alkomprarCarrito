package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    
    By txtBusqueda = By.id("js-site-search-input");
    
    By btnBusqueda = By.id("js-search-button");

    public void hacerClicEnBotonBusqueda() {
        WebElement button = getDriver().findElement(btnBusqueda);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled')", button);
        button.click();
    }

    public By getTxtBusqueda() {
        return txtBusqueda;
    }


}


