package com.example.pruebamatriztest.tasks;
import com.example.pruebamatriztest.models.UserLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresarCredenciales implements Task {
    private final String usuario;
    private final String clave;

    public IngresarCredenciales(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Performable conDatos(String usuario, String clave) {
        return instrumented(IngresarCredenciales.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(UserLogin.USERNAME_FIELD),
                Enter.theValue(clave).into(UserLogin.PASSWORD_FIELD),
                Click.on(UserLogin.LOGIN_BUTTON)
        );
    }
}