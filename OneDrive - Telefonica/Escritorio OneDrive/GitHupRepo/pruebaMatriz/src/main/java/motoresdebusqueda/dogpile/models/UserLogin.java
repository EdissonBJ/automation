package com.example.pruebamatriztest.models;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserLogin {
        public static By USERNAME_FIELD = By.name("username");
        public static By PASSWORD_FIELD = By.name("password");
        public static By LOGIN_BUTTON = By.xpath("/html/body/div/div[2]/form/button");
        public static By COORDENADA_DISPONIBLE = By.linkText(
           "https://tasks.evalartapp.com/automatization/");

    // ubicar texto en la pagina
        public static Target welcomeText = Target
            .the( "welcome text")
            .located(By.xpath("/html/body/div[2]/div/h2"));

    }
