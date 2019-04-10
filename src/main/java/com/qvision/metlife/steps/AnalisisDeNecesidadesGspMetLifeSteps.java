package com.qvision.metlife.steps;

import com.qvision.metlife.pages.AnalisisDeNecesidadesGspMetLifePage;

import net.thucydides.core.annotations.Step;

public class AnalisisDeNecesidadesGspMetLifeSteps {
	AnalisisDeNecesidadesGspMetLifePage analisisNecesidades;

	@Step
	public void analisDeNecesidades(String salarioDeseado, String ingresoMensual, String semanasCotizadas,
			String edadPension) {
		analisisNecesidades.analisisDeNecesidades(salarioDeseado, ingresoMensual, semanasCotizadas, edadPension);

	}

}
