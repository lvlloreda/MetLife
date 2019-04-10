package com.qvision.metlife.steps;

import com.qvision.metlife.pages.CotizacionGspMetLifePage;

import net.thucydides.core.annotations.Step;

public class CotizacionGspMetLifeSteps {

	CotizacionGspMetLifePage cotizacion;

	@Step
	public void cotizacionGsp(String numeroIdentificacion, String primaPlan1, String primaPlan2, String primaPlan3) {
		cotizacion.cotizacion(numeroIdentificacion, primaPlan1, primaPlan2, primaPlan3);
	}

}
