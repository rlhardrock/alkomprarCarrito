package com.alkomprar.steps;

import com.alkomprar.pages.CarritoPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CarritoStep {

    CarritoPage comparar = new CarritoPage();

    @Step
    public void validarTituloPagina() {
        String tituloEsperado = "Carrito de compras";
        String tituloActual = comparar.getDriver().findElement(comparar.getTxtCarritoCompras()).getText();
        Assert.assertEquals(tituloEsperado, tituloActual);
    }

}
