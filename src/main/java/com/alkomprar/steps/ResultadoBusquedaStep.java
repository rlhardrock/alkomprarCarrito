package com.alkomprar.steps;

import com.alkomprar.pages.ResultadoBusquedaPage;
import com.alkomprar.utils.Aleatorizar;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ResultadoBusquedaStep {

    ResultadoBusquedaPage listaProductos = new ResultadoBusquedaPage();
    Aleatorizar azar = new Aleatorizar();

    @Step
    public void seleccionarProducto(){
        List<WebElementFacade> articulos = listaProductos.Productos;
        int cantidadArticulos = articulos.size();

        WebElementFacade articulo = articulos
                .get(
                        azar.generarIndiceAleatorio(cantidadArticulos)
                );
        articulo.click();
    }

}
