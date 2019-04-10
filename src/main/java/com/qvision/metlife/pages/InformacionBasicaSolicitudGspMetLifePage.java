package com.qvision.metlife.pages;

import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InformacionBasicaSolicitudGspMetLifePage extends PageObject {
	Esperas esperas = new Esperas();

	@FindBy(id = "countryBirth")
	WebElementFacade sltPaisNacimiento;

	@FindBy(id = "txtAppState")
	WebElementFacade sltDeptoNacimiento;

	@FindBy(id = "txtAppCity")
	WebElementFacade sltCiudadNacimiento;

	@FindBy(id = "yesThreeUS")
	WebElement rdbCiudadanoAmericanoSi;

	@FindBy(id = "noThreeUS")
	WebElement rdbCiudadanoAmericanoNo;

	@FindBy(id = "fundYes")
	WebElement rdbPoderTransferenciaSi;

	@FindBy(id = "fundNo")
	WebElement rdbPoderTransferenciaNO;

	@FindBy(id = "yesOne")
	WebElement rdbComunicacionSi;

	@FindBy(id = "noOne")
	WebElement rdbComunicacionNo;

	@FindBy(id = "yesTwo")
	WebElement rdbTramiteSeguroSi;

	@FindBy(id = "noTwo")
	WebElement rdbTramiteSeguroNo;

	@FindBy(id = "yesThree")
	WebElement rdbRechazoSeguroSi;

	@FindBy(id = "noThree")
	WebElement rdbRechazoSeguroNo;

	@FindBy(id = "yesFour")
	WebElement rdbIndemnizacionSi;

	@FindBy(id = "noFour")
	WebElement rdbIndemnizacionNo;

	@FindBy(id = "btnInsueredContinue")
	WebElement btnContinuarAsegurado;

	public void informacionBasicaSolicitud(String paisNacimiento, String deptoNacimiento, String ciudadNacimiento,
			String ciudadanoEU, String poderTranferenciaEU, String comunicacionMetLife, String infoAdicional1,
			String infoAdicional2, String infoAdicional3) {
		sltPaisNacimiento.selectByVisibleText(paisNacimiento);
		esperas.esperaSimple(1000);
		sltDeptoNacimiento.selectByVisibleText(deptoNacimiento);
		esperas.esperaSimple(1000);
		sltCiudadNacimiento.selectByVisibleText(ciudadNacimiento);

		if (ciudadanoEU.equals("SI")) {
			rdbCiudadanoAmericanoSi.click();
		} else {
			rdbCiudadanoAmericanoNo.click();
		}

		if (poderTranferenciaEU.equals("SI")) {
			rdbPoderTransferenciaSi.click();
		} else {
			rdbPoderTransferenciaNO.click();
		}

		if (comunicacionMetLife.equals("SI")) {
			rdbComunicacionSi.click();
		} else {
			rdbComunicacionNo.click();
		}

		if (infoAdicional1.equals("SI")) {
			rdbTramiteSeguroSi.click();
		} else {
			rdbTramiteSeguroNo.click();
		}

		if (infoAdicional2.equals("SI")) {
			rdbRechazoSeguroSi.click();
		} else {
			rdbRechazoSeguroNo.click();
		}

		if (infoAdicional3.equals("SI")) {
			rdbIndemnizacionSi.click();
		} else {
			rdbIndemnizacionNo.click();
		}

		btnContinuarAsegurado.click();
		esperas.esperaExpEleVisible("sameAsInsuredYes", 8000);

	}

}
