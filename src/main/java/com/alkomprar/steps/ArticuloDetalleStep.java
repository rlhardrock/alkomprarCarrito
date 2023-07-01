package com.alkomprar.steps;

import com.alkomprar.pages.ArticuloDetallePage;
import net.thucydides.core.annotations.Step;

public class ArticuloDetalleStep {

    ArticuloDetallePage detalle = new ArticuloDetallePage();

    @Step
    public void agregarCarrito(){
        detalle.getDriver().findElement(detalle.getBtnAgregar()).click();
    }
}
