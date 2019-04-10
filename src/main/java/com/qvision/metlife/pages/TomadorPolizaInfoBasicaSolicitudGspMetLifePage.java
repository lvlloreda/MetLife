package com.qvision.metlife.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TomadorPolizaInfoBasicaSolicitudGspMetLifePage extends PageObject {

	@FindBy(id = "sameAsInsuredYes")
	WebElement aseguradoIgualTomadorSi;
	
	@FindBy(id = "sameAsInsuredNo")
	WebElement aseguradoIgualTomadorNo;

	@FindBy(id = "ownerRelationType")
	WebElementFacade sltParenteco;

	@FindBy(id = "policyHolderType")
	WebElementFacade sltTipoTomador;

	@FindBy(id = "txtOwnerFirstName")
	WebElement txtPrimerNombreT;

	@FindBy(id = "txtOwnerSecondName")
	WebElement txtSegundoNombreT;

	@FindBy(id = "txtOwnerSecondMiddleName")
	WebElement txtTercerNombreT;

	@FindBy(id = "txtOwnerLastName")
	WebElement txtPrimerApellioT;

	@FindBy(id = "txtOwnerSecondSurname")
	WebElement txtSegundoApellidoT;

	@FindBy(id = "male")
	WebElement rdbGeneroM;

	@FindBy(id = "female")
	WebElement rdbGeneroF;

	@FindBy(id = "txtOwnerDateOfBirth")
	WebElement txtFechaNacimientoT;

	@FindBy(id = "ownDocumentType")
	WebElementFacade sltTipoIdentificacionT;

	@FindBy(id = "ownerDocumentNumber")
	WebElement txtIdentificacionT;

	@FindBy(id = "countryBirth")
	WebElementFacade sltPaisNacimientoT;

	@FindBy(id = "txtOwnerState")
	WebElementFacade sltDeptoNacimientoT;

	@FindBy(id = "txtOwnerCity")
	WebElementFacade sltCiudadNacimientoT;

	@FindBy(id = "selectNation0")
	WebElementFacade sltNacionalidadT;

	@FindBy(id = "selectMaritalStatus")
	WebElementFacade sltEstadoCivilT;

	@FindBy(id = "txtAddress")
	WebElement txtDireccionResideT;

	@FindBy(id = "homeCountry")
	WebElementFacade sltPaisResidenciaT;

	@FindBy(id = "txtOwnerHomeState")
	WebElementFacade sltDeptoResidenciaT;

	@FindBy(id = "txtOwnerHomeCity")
	WebElementFacade sltCiudadResidenciaT;

	@FindBy(id = "txtAddress")
	WebElement txtTelefonoResideT;

	@FindBy(id = "txtMobileNumber")
	WebElement txtCelularT;

	@FindBy(id = "txtOwnerEmailAddr")
	WebElement txtCorreoElectronicoT;

	@FindBy(id = "homeAddrYes")
	WebElement rdbComunicacionSi;

	@FindBy(id = "homeAddrNo")
	WebElement rdbComunicacionNo;

	@FindBy(id = "selectActivityType")
	WebElementFacade sltTipoActividadT;

	@FindBy(id = "personCompanyname")
	WebElement txtNombreEmpresaT;

	@FindBy(id = "selectEconomicActivity")
	WebElementFacade sltActiviaEconomicaEmpreT;

	@FindBy(id = "personNITCompany")
	WebElement txtNitEmpresaT;

	@FindBy(id = "personNITCompany")
	WebElement txtDireccionTrabajoT;

	@FindBy(id = "selectCountryPolicyHolder")
	WebElementFacade sltPaisTrabajoT;

	@FindBy(id = "companyMailingState")
	WebElementFacade sltDeptoTrabajoT;

	@FindBy(id = "companyMailingCity")
	WebElementFacade sltCiudadTrabajoT;

	@FindBy(id = "companyPhoneNumberPerson")
	WebElement txtTelefonoEmpresaT;

	@FindBy(id = "selectOccup0")
	WebElement txtOcupacionT;

	@FindBy(id = "personPrincipleEconomy")
	WebElementFacade sltActEconoPrincipalT;

	@FindBy(id = "personPlaceHoderQuestionOneYes")
	WebElement rdbActEcSecundariaSi;

	@FindBy(id = "personPlaceHoderQuestionOneNo")
	WebElement rdbActEcSecundariaNo;

	@FindBy(id = "personPlaceHoderQuestionTwoYes")
	WebElement rdbRecursosPublicosSi;

	@FindBy(id = "personPlaceHoderQuestionTwoYes")
	WebElement rdbRecursosPublicosNo;

	@FindBy(id = "personPlaceHoderQuestionThreeYes")
	WebElement rdbPoderPublicoSi;

	@FindBy(id = "personPlaceHoderQuestionThreeYes")
	WebElement rdbPoderPublicoNo;

	@FindBy(id = "personPlaceHoderQuestionFourYes")
	WebElement rdbReconocPublicoSi;

	@FindBy(id = "personPlaceHoderQuestionFourNo")
	WebElement rdbReconocPublicoNo;

	@FindBy(id = "personPlaceHoderQuestionFiveYes")
	WebElement rdbVinculoSi;

	@FindBy(id = "personPlaceHoderQuestionFiveNo")
	WebElement rdbVinculoNo;

	@FindBy(id = "txtFinancialmonthlyIncome")
	WebElement txtIngresosT;

	@FindBy(id = "txtFinancialotherMonthlyIncome")
	WebElement txtOtrosIngresosT;

	@FindBy(id = "leveltwoListaFundOrigin")
	WebElementFacade sltConceptoOtrosIngresosT;

	@FindBy(id = "txtOwnassets")
	WebElement txtTotalActivosT;

	@FindBy(id = "incomeCountry")
	WebElementFacade sltPaisOrigenIngresosT;

	@FindBy(id = "txtmonthlyexpense")
	WebElement txtEgresosT;

	@FindBy(id = "txtdebts")
	WebElement txtTotalPasivosT;

	@FindBy(id = "ListaFundOrigin")
	WebElementFacade sltOrigenFondosT;

	@FindBy(id = "transactionYes")
	WebElement rdbTranMonedaExtSi;

	@FindBy(id = "transactionNo")
	WebElement rdbTranMonedaExtNo;

	@FindBy(id = "policyYes")
	WebElement rdbIndemnisacionSi;

	@FindBy(id = "policyNo")
	WebElement rdbIndemnisacionNo;

	@FindBy(id = "btnOwnerContinue")
	WebElement btnContinuarTomador;

	public void tomadorPoliza() {

	}

}
