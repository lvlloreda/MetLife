package com.qvision.metlife.steps;

import com.qvision.metlife.pages.InformacionBasicaSolicitudGspMetLifePage;

import net.thucydides.core.annotations.Step;

public class InformacionBasicaSolicitudGspMetLifeSteps {

	InformacionBasicaSolicitudGspMetLifePage infoBasicaPage;

	@Step
	public void informacionBasicaSolicitud(String paisNacimiento, String deptoNacimiento, String ciudadNacimiento,
			String ciudadanoEU, String poderTranferenciaEU, String comunicacionMetLife, String infoAdicional1,
			String infoAdicional2, String infoAdicional3) {
		infoBasicaPage.informacionBasicaSolicitud(paisNacimiento, deptoNacimiento, ciudadNacimiento, ciudadanoEU,
				poderTranferenciaEU, comunicacionMetLife, infoAdicional1, infoAdicional2, infoAdicional3);

	}
}
