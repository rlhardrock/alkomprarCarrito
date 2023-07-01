package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ArticuloDetallePage extends PageObject {

    By btnAgregar = By.xpath("//*[@id=\"addToCartButton\"]");

    public By getBtnAgregar() {
        return btnAgregar;
    }
}
