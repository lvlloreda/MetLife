package com.qvision.metlife.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PlanesCotizacionGspMetLigePage extends PageObject {

	Esperas espera = new Esperas();

	List<WebElement> btnAgregarCotizacion;
	JavascriptExecutor executor;

	// Plan Vida Entera 50 Años
	@FindBy(id = "faceAmountInput_VT5")
	WebElement txtValorAsegVidaE50;

	@FindBy(id = "planSubmitVT5")
	WebElement btnValidarVidaE50;

	// Plan Tempoarl 70 Años
	@FindBy(id = "faceAmountInput_TE7")
	WebElement txtValorAsegTem70;

	@FindBy(id = "planSubmitTE7")
	WebElement btnValidarTem70;

	// Plan Ap Mujer
	@FindBy(id = "faceAmountInput_APJ")
	WebElement txtValorAsegApj;

	@FindBy(id = "planSubmitAPJ")
	WebElement btnValidarApj;

	public void agregarPlanVidaEntera50() {
		// El siguiente botón existe en varias listas con el mismo ID
		// Fue necesario localizarlo como una lista y solo permitió interacción con
		// JavascriptExecutor
		btnAgregarCotizacion = getDriver().findElements(By.id("btnAddToQuote"));
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", btnAgregarCotizacion.get(0));

	}

	public void agregarPlanTemporal70() {
		btnAgregarCotizacion = getDriver().findElements(By.id("btnAddToQuote"));
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", btnAgregarCotizacion.get(6));
	}

	public void agregarPlanApMujer() {
		btnAgregarCotizacion = getDriver().findElements(By.id("btnAddToQuote"));
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", btnAgregarCotizacion.get(16));
	}

	public void gestionarPlanVidaEntera50(String prima) {
		txtValorAsegVidaE50.sendKeys(prima, Keys.TAB);
		espera.esperaSimple(1000);
		btnValidarVidaE50.click();

	}

	public void gestionarPlanTemporal70(String prima) {
		txtValorAsegTem70.sendKeys(prima);
		espera.esperaSimple(1000);
		btnValidarTem70.click();

	}

	public void gestionarPlanApMujer(String prima) {
		txtValorAsegApj.sendKeys(prima);
		espera.esperaSimple(1000);
		btnValidarApj.click();

	}

}
