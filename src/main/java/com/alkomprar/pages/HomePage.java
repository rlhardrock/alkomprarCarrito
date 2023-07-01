package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By txtBusqueda = By.xpath("//input[@id='js-site-search-input']");

    By btnBusqueda = By.xpath("//input[@id='js-site-search-input']");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
