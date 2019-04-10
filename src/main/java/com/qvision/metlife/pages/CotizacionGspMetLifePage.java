package com.qvision.metlife.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CotizacionGspMetLifePage extends PageObject {
	Esperas espera = new Esperas();
	PlanesCotizacionGspMetLigePage planesCotizacion = new PlanesCotizacionGspMetLigePage();

	@FindBy(id = "illustrationTab")
	WebElement lnkcotizacion;

	@FindBy(id = "btnNewIllustartion")
	WebElement btnNuevaCotizacion;

	@FindBy(id = "advSearchLink")
	WebElement lnkBusquedaAvanzada;

	@FindBy(id = "DocIdNumber")
	WebElement txtNumDoc;

	@FindBy(id = "SearchButtonAdv")
	WebElement btnBuscar;

	@FindBy(xpath = "//*[@id=\"searchResults\"]/div/div/div/div/div/div/div/div/div/div[1]/div/div[8]/div/button[2]")
	WebElement btnOpciones;

	@FindBy(id = "newIllustrationLink")
	WebElement btnNuevaCotizacion2;

	@FindBy(xpath = "//*[@id=\"productFamily\"]/div[1]/span")
	List<WebElement> lnkPlanes;

	@FindBy(id = "btnStartQuote")
	WebElement btnCotizar;

	@FindBy(id = "btnReviewQuote")
	WebElement btnRevisarCotizacion;

	@FindBy(id = "endIllustration")
	WebElement btnConfirmarVenta;

	@FindBy(id = "btnMarkCompleteYes")
	WebElement btnSiConfirmarVenta;

	public void cotizacion(String numeroIdentificacion, String primaPlan1, String primaPlan2, String primaPlan3) {
		lnkcotizacion.click();
		espera.esperaExpEleVisible("illustrationSearch", 3000);
		btnNuevaCotizacion.click();
		espera.esperaExpEleHabilitado("clientSearchTextBox", 3000);
		lnkBusquedaAvanzada.click();
		txtNumDoc.sendKeys(numeroIdentificacion);
		btnBuscar.click();
		espera.esperaSimple(4000);
		btnOpciones.click();
		btnNuevaCotizacion2.click();
		espera.esperaExpEleVisible("btnStartQuote", 8000);
		lnkPlanes.get(0).click();
		espera.esperaSimple(1000);
		planesCotizacion.agregarPlanVidaEntera50();
		planesCotizacion.agregarPlanTemporal70();
		espera.esperaSimple(1000);
		lnkPlanes.get(2).click();
		espera.esperaSimple(1000);
		planesCotizacion.agregarPlanApMujer();
		btnCotizar.click();
		espera.esperaExpEleVisible("faceAmountInput_VT5", 5000);
		planesCotizacion.gestionarPlanVidaEntera50(primaPlan1);
		espera.esperaExpEleVisible("VT5plan_prem_Monthly", 5000);
		planesCotizacion.gestionarPlanTemporal70(primaPlan2);
		espera.esperaExpEleVisible("TE7plan_prem_Monthly", 5000);
		planesCotizacion.gestionarPlanApMujer(primaPlan3);
		espera.esperaExpEleHabilitado("btnReviewQuote", 5000);
		btnRevisarCotizacion.click();
		espera.esperaExpEleHabilitado("endIllustration", 5000);
		btnConfirmarVenta.click();
		espera.esperaExpEleVisible("btnMarkCompleteYes", 5000);
		btnSiConfirmarVenta.click();
		espera.esperaExpEleVisible("txtAppSecondName", 5000);

	}

}
