package com.example.pruebamatriztest.questions;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class MyPage extends PageObject {

    @Step("Verificar que estoy en la pagina{0}")

    public void verificarPagina(String paginaEsperada) {
        String urlActual = getDriver().getCurrentUrl();
        assertThat(urlActual).contains(paginaEsperada);


    }
}