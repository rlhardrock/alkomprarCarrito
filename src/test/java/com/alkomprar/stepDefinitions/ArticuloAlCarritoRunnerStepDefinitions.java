package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class ArticuloAlCarritoRunnerStepDefinitions {

    @Steps
    HomeStep comenzar;

    @Dado("abro la pagina web Alkomprar")
    public void abrirWebAlkomprar() {
        //comenzar.abrirNavegador();
    }

    @Cuando("busco el producto lo selecciono y envio al carrito de compras")
    public void visualizarProcesoCompra() {
        //comenzar.enviarBusqueda();
        //comenzar.clicBusqueda();

    }

    @Entonces("visualizo el carro de compras con el producto adicionado")
    public void visualizarCarrito() {

    }

}