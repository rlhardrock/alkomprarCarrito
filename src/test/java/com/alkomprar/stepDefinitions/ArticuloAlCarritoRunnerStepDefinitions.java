package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeStep;
import com.alkomprar.steps.ResultadoBusquedaStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ArticuloAlCarritoRunnerStepDefinitions {

    @Steps
    HomeStep comenzar;

    @Steps
    ResultadoBusquedaStep busqueda;

    @Dado("abro la pagina web Alkomprar")
    public void abrirWebAlkomprar() {
        comenzar.abrirNavegador();
    }

    @Cuando("busco el producto lo selecciono y envio al carrito de compras")
    public void visualizarProcesoCompra() throws IOException {
        comenzar.enviarBusqueda();
        comenzar.clicBusqueda();
        busqueda.seleccionarProducto();

    }

    @Entonces("visualizo el carro de compras con el producto adicionado")
    public void visualizarCarrito() {

    }

}