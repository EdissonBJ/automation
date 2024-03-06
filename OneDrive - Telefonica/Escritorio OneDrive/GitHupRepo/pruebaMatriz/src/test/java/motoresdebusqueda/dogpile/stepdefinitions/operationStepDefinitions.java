package com.example.pruebamatriztest.stepdefinitions;

import com.example.pruebamatriztest.questions.Coordenada;
import com.example.pruebamatriztest.questions.MyPage;
import com.example.pruebamatriztest.tasks.IngresarCredenciales;
import com.example.pruebamatriztest.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class operationStepDefinitions {

    private Actor usuario = Actor.named("Usuario");

    @Managed(driver = "edge")
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new Stage(new OnlineCast()));
        // Configuración del escenario utilizando el patrón Screenplay de Serenity BDD
        usuario.can(BrowseTheWeb.with(driver));
        HomePage homePage = new HomePage();
    }

    @Dado("Estoy en la pagina de la matriz")
    @Step("{0} Estoy en la pagina de la matriz")
    public void estoyEnLaPaginaDeLaMatriz() {
        usuario.attemptsTo(Open.browserOn(new HomePage()));
        getDriver().manage().window().maximize();

    }

    @Cuando("ingreso las credenciales")
    @Step("{1} ingreso las credenciales")
    public void ingresoLasCredenciales() {
        usuario.wasAbleTo(
                IngresarCredenciales.conDatos("778538", "10df2f32286b7120Mi00LTgzNTg3Nw==30e0c83e6c29f1c3"));

    }

    @Entonces("estoy en la pagina")
    @Step("{2} estoy en la pagina")
    public void estoyEnLaPagina() {
        new MyPage().verificarPagina("https://tasks.evalartapp.com/automatization/");

    }

    @Cuando("se muestra la coordenada")
    public void SeMuestraLaCoordenada() {

        String expectedWelcomeText = "Complete el siguiente formulario";
        usuario.should(
                seeThat("coordenada", Coordenada.value(), equalTo(expectedWelcomeText))
        );
    }

}