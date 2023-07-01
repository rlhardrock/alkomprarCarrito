package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ResultadoBusquedaPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//h3/a[@class='js-algolia-product-click js-algolia-product-title']")
    public List<WebElementFacade> Productos;

}
