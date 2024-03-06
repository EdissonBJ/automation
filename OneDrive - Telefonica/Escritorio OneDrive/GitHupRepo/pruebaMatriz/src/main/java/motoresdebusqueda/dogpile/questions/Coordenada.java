package com.example.pruebamatriztest.questions;

import com.example.pruebamatriztest.models.UserLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Coordenada implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return UserLogin.welcomeText.resolveFor(actor).getText();
    }

    public static Question<String> value (){
        return new Coordenada();
    }
}
