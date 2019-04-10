package com.qvision.metlife.steps;

import com.qvision.metlife.pages.CreacionClienteGspMetLifePage;

import net.thucydides.core.annotations.Step;

public class CreacionClienteGspMetLifeSteps {
	CreacionClienteGspMetLifePage nuevoCliente;

	@Step
	public void nuevoCliente(String primerNombre, String segundoNombre, String tercerNombre, String primerApellido,
			String segundoApellido, String fechaNacimiento, String nacionalidad, String genero, String clienteFumador,
			String estadoCivil, String ocupacion, String tipoIdentificacion, String numeroIdentificacion,
			String ingresosMensuales, String correoElectronico, String direccion, String paisResidencia,
			String departamento, String ciudad, String tipoTelefono1, String telefono1, String tipoTelefono2,
			String telefono2) {
		nuevoCliente.nuevoCliente(primerNombre, segundoNombre, tercerNombre, primerApellido, segundoApellido,
				fechaNacimiento, nacionalidad, genero, clienteFumador, estadoCivil, ocupacion, tipoIdentificacion,
				numeroIdentificacion, ingresosMensuales, correoElectronico, direccion, paisResidencia, departamento,
				ciudad, tipoTelefono1, telefono1, tipoTelefono2, telefono2);

	}
	
	@Step
	public void validacionCreacionCliente() {
		nuevoCliente.validacionCreacionCliente();
	}

}
