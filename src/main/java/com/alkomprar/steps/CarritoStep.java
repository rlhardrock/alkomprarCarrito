package com.alkomprar.steps;

import com.alkomprar.pages.CarritoPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CarritoStep {

    CarritoPage comparar = new CarritoPage();
    Excel excel = new Excel();

    @Step
    public void validarTituloPagina() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","articulo");
        String tituloEsperado = informacionPersonal.get(0).get("tituloPgCarro");
        String tituloActual = comparar.getDriver().findElement(comparar.getTxtCarritoCompras()).getText();
        Assert.assertEquals(tituloEsperado, tituloActual);
    }

}
