package com.qvision.metlife.pages;

import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class AnalisisDeNecesidadesGspMetLifePage extends PageObject {
	Esperas espera = new Esperas();

	@FindBy(id = "btnContinueToNeeds")
	WebElement btnAnalisisNecesidades;

	@FindBy(id = "txtSalaryPensionar")
	WebElement txtSalarioDeseado;

	@FindBy(id = "txtAverageMonthlyIncomeOfLastTenYearsPension")
	WebElement txtIngresoMensual;

	@FindBy(id = "txtListedWeeksPensionar")
	WebElement txtSemanasCotizadas;

	@FindBy(id = "txtAgeAtWhichYouWantPensionar")
	WebElement txtEdadPension;

	@FindBy(id = "retire_calculateButton")
	WebElement btnCalcularRetiro;

	@FindBy(id = "tabSummary")
	WebElement lnkResumenFinal;

	@FindBy(id = "summaryIllustrationButton")
	WebElement btnCotizar;

	public void analisisDeNecesidades(String salarioDeseado, String ingresoMensual, String semanasCotizadas,
			String edadPension) {
		btnAnalisisNecesidades.click();
		espera.esperaExpEleVisible("txtSalaryPensionar", 8000);
		txtSalarioDeseado.sendKeys(salarioDeseado);
		txtIngresoMensual.sendKeys(ingresoMensual);
		txtSemanasCotizadas.sendKeys(semanasCotizadas);
		txtEdadPension.sendKeys(edadPension);
		espera.esperaSimple(3000);
		btnCalcularRetiro.click();
		espera.esperaSimple(3000);
		lnkResumenFinal.click();
		espera.esperaExpEleHabilitado("summaryIllustrationButton", 5000);
		btnCotizar.click();
		espera.esperaExpEleVisible("btnStartQuote", 8000);
	}

}
