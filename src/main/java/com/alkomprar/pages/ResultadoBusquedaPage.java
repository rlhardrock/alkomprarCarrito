package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ResultadoBusquedaPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//h3/a[@class='js-algolia-product-click js-algolia-product-title']")
    public List<WebElementFacade> Productos;

    By btnCarrito = By.xpath("//a[contains(text(),'Ir al carrito y pagar')]");

    public By getBtnCarrito() {
        return btnCarrito;
    }
}
