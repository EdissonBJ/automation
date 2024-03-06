package com.example.pruebamatriztest.tasks;
import com.example.pruebamatriztest.models.UserLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;



import static com.example.pruebamatriztest.models.UserLogin.COORDENADA_DISPONIBLE;

public class ObtenerCoordenadaDePagina implements Question<String> {

    public static Question<String> value(){
        return new ObtenerCoordenadaDePagina();
    }


    @Override
    public String answeredBy(Actor usuario) {
        return BrowseTheWeb.as(usuario).find(COORDENADA_DISPONIBLE).getText();
    }

}

