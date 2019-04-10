package com.qvision.metlife.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Esperas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreacionClienteGspMetLifePage extends PageObject {
	Esperas espera = new Esperas();

	@FindBy(id = "createNewClient")
	WebElement btnNuevoCliente;

	@FindBy(id = "txtCustMgmtFirstName")
	WebElement txtPrimerNombre;

	@FindBy(id = "txtCustMgmtSecondName")
	WebElement txtSegundoNombre;

	@FindBy(id = "txtCustMgmtSecondMiddleName")
	WebElement txtTercerNombre;

	@FindBy(id = "txtCustMgmtLastName")
	WebElement txtPrimerApellido;

	@FindBy(id = "txtCustMgmtSecondSurname")
	WebElement txtSegundoApellido;

	@FindBy(id = "txtCustMgmtDateOfBirth")
	WebElement txtFechaDeNacimiento;

	@FindBy(id = "countryBirth")
	WebElementFacade sltNacionalidad;

	@FindBy(id = "male")
	WebElement rdbMasculino;

	@FindBy(id = "female")
	WebElement rdbFamenino;

	@FindBy(id = "smokingStatus")
	WebElement btnFumador;

	@FindBy(id = "selectMaritalStatus")
	WebElementFacade stlEstadoCivil;

	@FindBy(id = "selectOccupation0")
	WebElement txtOcupacion;

	@FindBy(id = "addAnotherAddressLink")
	WebElement lnkagregarDireccion;

	@FindBy(id = "txtAddressLineOne0")
	WebElement txtDireccion;

	@FindBy(id = "selectResidentCountry0")
	WebElementFacade sltPaisResidencia;

	@FindBy(id = "selectState0")
	WebElementFacade sltDepartamento;

	@FindBy(id = "selectCity0")
	WebElementFacade sltCiudad;

	@FindBy(id = "btnSaveAddress0")
	WebElement btnGuardarDireccion;

	@FindBy(id = "documentType")
	WebElementFacade sltTipoDeIdentificacion;

	@FindBy(id = "documentNumber")
	WebElement txtNumeroDeIdentificacion;

	@FindBy(id = "txtCustMgmtMonthlySalary")
	WebElement txtIngresosMensuales;

	@FindBy(id = "txtEmailAddr")
	WebElement txtEmail;

	@FindBy(id = "selectPhnType0")
	WebElementFacade sltTipoDeTelefono1;

	@FindBy(id = "txtPhnNumber0")
	WebElement txtNumeroDeTelefono1;

	@FindBy(id = "addAnotherPhoneNumberLink")
	WebElement lnkAgregarOtroTelefono;

	@FindBy(id = "selectPhoneType1")
	WebElementFacade sltTipoDeTelefono2;

	@FindBy(id = "txtPhoneNumber1")
	WebElement txtNumeroDeTelefono2;

	@FindBy(id = "btnSavePhoneNumber1")
	WebElement btnGuadarTelefono2;

	@FindBy(id = "btnCreateClientConfirm")
	WebElement btnGuardarCliente;

	public void nuevoCliente(String primerNombre, String segundoNombre, String tercerNombre, String primerApellido,
			String segundoApellido, String fechaNacimiento, String nacionalidad, String genero, String clienteFumador,
			String estadoCivil, String ocupacion, String tipoIdentificacion, String numeroIdentificacion,
			String ingresosMensuales, String correoElectronico, String direccion, String paisResidencia,
			String departamento, String ciudad, String tipoTelefono1, String telefono1, String tipoTelefono2,
			String telefono2) {
		btnNuevoCliente.click();
		espera.esperaExpEleVisible("txtCustMgmtFirstName", 10000);
		txtPrimerNombre.sendKeys(primerNombre);
		txtSegundoNombre.sendKeys(segundoNombre);
		txtTercerNombre.sendKeys(tercerNombre);
		txtPrimerApellido.sendKeys(primerApellido);
		txtSegundoApellido.sendKeys(segundoApellido);
		txtFechaDeNacimiento.sendKeys(fechaNacimiento);
		/*
		 * Se requiere utilizar JavascriptExecutor para introducir la fecha de
		 * nacimiento ya que es un campo que no está habilitado para escribir.
		 */
		((JavascriptExecutor) getDriver())
				.executeScript("document.getElementById('txtCustMgmtDateOfBirth').value='" + fechaNacimiento + "'");
		sltNacionalidad.selectByVisibleText(nacionalidad);
		if (genero.equals("Masculino")) {
			rdbMasculino.click();
		} else {
			rdbFamenino.click();
		}

		if (clienteFumador.equals("Si")) {
			btnFumador.click();
		}
		stlEstadoCivil.selectByVisibleText(estadoCivil);
		txtOcupacion.sendKeys(ocupacion);
		espera.esperaSimple(2000);
		sltTipoDeIdentificacion.selectByVisibleText(tipoIdentificacion);
		espera.esperaSimple(2000);
		txtNumeroDeIdentificacion.sendKeys(numeroIdentificacion);
		txtIngresosMensuales.sendKeys(ingresosMensuales);
		espera.esperaExpEleHabilitado("addAnotherAddressLink", 3000);
		lnkagregarDireccion.click();
		espera.esperaExpEleVisible("txtAddressLineOne0", 2000);
		txtDireccion.sendKeys(direccion);
		sltPaisResidencia.selectByVisibleText(paisResidencia);
		espera.esperaSimple(1000);
		sltDepartamento.selectByVisibleText(departamento);
		sltCiudad.selectByVisibleText(ciudad);
		btnGuardarDireccion.click();
		espera.esperaExpEleVisible("txtEmailAddr", 2000);
		txtEmail.sendKeys(correoElectronico);
		sltTipoDeTelefono1.selectByVisibleText(tipoTelefono1);
		txtNumeroDeTelefono1.sendKeys(telefono1);
		lnkAgregarOtroTelefono.click();
		sltTipoDeTelefono2.selectByVisibleText(tipoTelefono2);
		txtNumeroDeTelefono2.sendKeys(telefono2);
		btnGuadarTelefono2.click();
		espera.esperaExpEleHabilitado("btnCreateClientConfirm", 3000);

	}

	public void validacionCreacionCliente() {
		btnGuardarCliente.click();
		espera.esperaExpEleVisible("btnContinueToNeeds", 8000);

	}

}
