package com.qvision.metlife.steps;

import com.qvision.metlife.pages.LoginGspMetLifePage;

import net.thucydides.core.annotations.Step;

public class LoginGspMetLifeSteps {
	LoginGspMetLifePage loginGsp;
	
	@Step
	public void abrirNavegador() {
		loginGsp.open();
	}
	
	@Step
	public void iniciarSesionGsp(String usuario, String contrase�a) {
		loginGsp.iniciarSesionGsp(usuario, contrase�a);
	}
	
	@Step
	public void validarSesionGsp() {
		loginGsp.validarSesionGsp();		
	}

}
