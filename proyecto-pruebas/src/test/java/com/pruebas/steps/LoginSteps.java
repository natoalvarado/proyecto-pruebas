package com.pruebas.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private String usuario;
    private String clave;
    private String resultado;

    @Given("el usuario ingresa {string} y {string}")
    public void ingresarDatos(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @When("intenta iniciar sesion")
    public void iniciarSesion() {
        if (usuario.equals("usuario") && clave.equals("1234")) {
            resultado = "permitido";
        } else {
            resultado = "rechazado";
        }
    }

    @Then("el acceso debe ser permitido")
    public void accesoPermitido() {
        assertEquals("permitido", resultado);
    }

    @Then("el resultado debe ser {string}")
    public void validarResultado(String esperado) {
        assertEquals(esperado, resultado);
    }
}