package com.qvision.metlife.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

@DefaultUrl("https://qa.salespilot.metlife.com.co/")
public class LoginGspMetLifePage extends PageObject {
	Esperas esperaExpl;

	@FindBy(name = "USER")
	WebElement txtusuario;

	@FindBy(name = "PASSWORD")
	WebElement txtcontrasena;

	@FindBy(id = "btnSubmit")
	WebElement btnIngresar;

	public void iniciarSesionGsp(String usuario, String contrase�a) {
		txtusuario.sendKeys(usuario);
		txtcontrasena.sendKeys(contrase�a);
	}

	public void validarSesionGsp() {
		btnIngresar.click();
		esperaExpl.esperaExpEleVisible("dashboardTab", 8000);
	}

}
