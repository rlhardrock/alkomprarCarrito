package com.alkomprar.steps;

import com.alkomprar.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage home = new HomePage();

    @Step()
    public void abrirNavegador(){
        home.openUrl("https://www.alkomprar.com/");
    }

    @Step
    public void enviarBusqueda(){
        home.getDriver().findElement(home.getTxtBusqueda()).sendKeys("llanta");
    }

    @Step
    public void clicBusqueda(){
        home.hacerClicEnBotonBusqueda();
    }
}
