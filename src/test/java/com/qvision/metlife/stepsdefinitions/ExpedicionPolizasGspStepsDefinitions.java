package com.qvision.metlife.stepsdefinitions;

import cucumber.api.java.es.Dado;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.qvision.metlife.steps.AnalisisDeNecesidadesGspMetLifeSteps;
import com.qvision.metlife.steps.CotizacionGspMetLifeSteps;
import com.qvision.metlife.steps.CreacionClienteGspMetLifeSteps;
import com.qvision.metlife.steps.InformacionBasicaSolicitudGspMetLifeSteps;
import com.qvision.metlife.steps.LoginGspMetLifeSteps;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class ExpedicionPolizasGspStepsDefinitions extends PageObject {

	@Steps
	LoginGspMetLifeSteps loginGsp;

	@Steps
	CreacionClienteGspMetLifeSteps nuevoCliente;

	@Steps
	AnalisisDeNecesidadesGspMetLifeSteps analisisDeNecesidades;

	@Steps
	CotizacionGspMetLifeSteps cotizacion;

	@Steps
	InformacionBasicaSolicitudGspMetLifeSteps infoBasica;

	@Dado("^que quiero expedir una nueva póliza en Gsp$")
	public void queQuieroExpedirUnaNuevaPolizaEnGsp() {
		loginGsp.abrirNavegador();
	}

	@Cuando("^inicie sesión en Gsp$")
	public void inicieSesionEnGsp(DataTable arg1) {
		List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
		loginGsp.iniciarSesionGsp(listData.get(0).get("usuario"), listData.get(0).get("contraseña"));

	}

	@Entonces("^valido la sesion en Gsp$")
	public void validoLaSesionEnGsp() {
		loginGsp.validarSesionGsp();
		Assert.assertEquals("Menú Principal", getDriver().findElement(By.id("dashboardTab")).getText());

	}

	@Cuando("^cree un nuevo cliente$")
	public void creeUnNuevoCliente(DataTable arg1) {

		List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
		nuevoCliente.nuevoCliente(listData.get(0).get("primerNombre"), listData.get(0).get("segundoNombre"),
				listData.get(0).get("tercerNombre"), listData.get(0).get("primerApellido"),
				listData.get(0).get("segundoApellido"), listData.get(0).get("fechaNacimiento"),
				listData.get(0).get("nacionalidad"), listData.get(0).get("genero"),
				listData.get(0).get("clienteFumador"), listData.get(0).get("estadoCivil"),
				listData.get(0).get("ocupacion"), listData.get(0).get("tipoIdentificacion"),
				listData.get(0).get("numeroIdentificacion"), listData.get(0).get("ingresosMensuales"),
				listData.get(0).get("correoElectronico"), listData.get(0).get("direccion"),
				listData.get(0).get("paisResidencia"), listData.get(0).get("departamento"),
				listData.get(0).get("ciudad"), listData.get(0).get("tipoTelefono1"), listData.get(0).get("telefono1"),
				listData.get(0).get("tipoTelefono2"), listData.get(0).get("telefono2"));
	}

	@Entonces("^valido la creación del nuevo cliente$")
	public void validoLaCreacionDelNuevoCliente() {

		nuevoCliente.validacionCreacionCliente();
		Assert.assertEquals("El cliente ha sido salvado exitosamente",
				getDriver().findElement(By.xpath("//*[@id='createNewClientOverlay']/div/div/div[2]/p/span")).getText());

	}

	@Cuando("^realice el análisis de necesidades del cliente$")
	public void realiceElAnalisisDeNecesidadesDelCliente(DataTable arg1) {
		
		 List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
		 analisisDeNecesidades.analisDeNecesidades(listData.get(0).get(
		 "salarioDeseado"), listData.get(0).get("ingresoMensual"),
		 listData.get(0).get("semanasCotizadas"), listData.get(0).get("edadPension"));
		

	}

	@Cuando("^Cree una nueva cotización$")
	public void creeUnaNuevaCotización(DataTable arg1) {
		List<Map<String, String>> lisData = arg1.asMaps(String.class, String.class);
		cotizacion.cotizacionGsp(lisData.get(0).get("numeroIdentificacion"), lisData.get(0).get("primaPlan1"),
				lisData.get(0).get("primaPlan2"), lisData.get(0).get("primaPlan3"));

	}

	@Cuando("^Cree una nueva solicitud$")
	public void creeUnaNuevaSolicitud(DataTable arg1) {
		List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
		infoBasica.informacionBasicaSolicitud(listData.get(0).get("paisNacimiento"),
				listData.get(0).get("deptoNacimiento"), listData.get(0).get("ciudadNacimiento"),
				listData.get(0).get("ciudadanoEU"), listData.get(0).get("poderTranferenciaEU"),
				listData.get(0).get("comunicacionMetLife"), listData.get(0).get("infoAdicional1"),
				listData.get(0).get("infoAdicional2"), listData.get(0).get("infoAdicional3"));

	}

	@Cuando("^Gestione la información básica del tomador de la póliza$")
	public void gestioneLaInformacionBasicaDelTomadorDeLaPoliza() {

	}

	@Cuando("^Gestione la información financiera del tomador de la póliza$")
	public void gestioneLaInformacionFinancieraDelTomadorDeLaPoliza() {

	}

	@Cuando("^Agregue los beneficiarios$")
	public void agregueLosBeneficiarios() {

	}

	@Cuando("^Gestione el estilo de vida y salud del cliente$")
	public void gestioneElEstiloDeVidaYSaludDelCliente() {

	}

	@Cuando("^Agregue la información financiera del cliente$")
	public void agregueLaInformacionFinancieraDelCliente() {

	}

	@Cuando("^Gestione la declaración del cliente$")
	public void gestioneLaDeclaracionDelCliente() {

	}

	@Cuando("^Gestione el pago de la solicitud$")
	public void gestioneElPagoDeLaCotizacion() {

	}

	@Cuando("^Presente la solicitud$")
	public void presenteLaSolicitud() {

	}

	@Cuando("^Valido la creación de la solicitud$")
	public void validoLaCreacionDeLaSolicitud() {

	}

}
