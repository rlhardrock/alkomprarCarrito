package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    By txtCarritoCompras = By.xpath("//h1[contains(text(),'Carrito de compras')]");

    public By getTxtCarritoCompras() {
        return txtCarritoCompras;
    }
}
