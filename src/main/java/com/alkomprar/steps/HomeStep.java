package com.alkomprar.steps;

import com.alkomprar.pages.HomePage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class HomeStep {

    HomePage home = new HomePage();
    Excel excel = new Excel();

    @Step()
    public void abrirNavegador(){
        home.openUrl("https://www.alkomprar.com/");
    }

    @Step
    public void enviarBusqueda() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","articulo");
        home.getDriver().findElement(home.getTxtBusqueda()).sendKeys(informacionPersonal.get(0).get("producto"));
    }

    @Step
    public void clicBusqueda(){
        home.hacerClicEnBotonBusqueda();
    }

}
