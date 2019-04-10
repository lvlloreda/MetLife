# language: es
# encoding: iso-8859-1
Característica: Quiero expedir una nueva póliza en Gsp

  Escenario: Expedición de pólizas en Gsp
    Dado que quiero expedir una nueva póliza en Gsp
    Cuando inicie sesión en Gsp
      | usuario | contraseña |
      | 4000002 | metlife1   |
    Entonces valido la sesion en Gsp
    Y cree un nuevo cliente
      | primerNombre | segundoNombre | tercerNombre | primerApellido | segundoApellido | fechaNacimiento | nacionalidad | genero   | clienteFumador | estadoCivil | ocupacion                            | tipoIdentificacion | numeroIdentificacion | ingresosMensuales | correoElectronico | direccion     | paisResidencia | departamento | ciudad      | tipoTelefono1 | telefono1 | tipoTelefono2 | telefono2  |
      | Marcela      |               |              | Luna           |                 | 25/02/1981      | COLOMBIA     | Femenino | No             | Soltero     | Agente inmobiliario (Administrativo) | Cedula             |           6000010016 |           5000000 | lgarcia@gmail.com | Cra 5 N°28-35 | COLOMBIA       | CUNDINAMARCA | BOGOTA D.C. | Casa          |   2489043 | Celular       | 3208563456 |
    Entonces valido la creación del nuevo cliente
    Y realice el análisis de necesidades del cliente
      | salarioDeseado | ingresoMensual | semanasCotizadas | edadPension |
      |        3000000 |       25000000 |              580 |          65 |
    Y Cree una nueva cotización
      | numeroIdentificacion | primaPlan1 | primaPlan2 | primaPlan3 |
      |           6000010015 |   80000000 |  100000000 |  220000000 |
    Y Cree una nueva solicitud
      | paisNacimiento | deptoNacimiento | ciudadNacimiento | ciudadanoEU | poderTranferenciaEU | comunicacionMetLife | infoAdicional1 | infoAdicional2 | infoAdicional3 |
      | COLOMBIA       | CUNDINAMARCA    | BOGOTA D.C.      | NO          | NO                  | SI                  | NO             | NO             | NO             |
    Y Gestione la información básica del tomador de la póliza
      | aseguradoIgualTomar | parentesco | tipoTomador | primerNombreT | segundoNombreT | tercerNombreT | primerApellioT | segundoApellidoT | generoT | fechaNacimientoT | tipoIdentificacionT | numeroIdentificacionT | paisNacimiento | deptoNacimiento | ciudadNacimiento | nacionalidadT | estadoCivilT | direccionResidenciaT | paisResidenciaT | deptoResidenciaT | ciudadResidenciaT | telefonoResidenciaT | celularT   | correoElectronicoT | comunicacionMetL |
      | NO                  | Cónyuge    | Natural     | Juan          | Jose           |               | Luna           | Mora             | M       | 01/08/1980       | Cedula              |            1000045678 | COLOMBIA       | CUNDINAMARCA    | BOGOTA D.C.      | COLOMBIA      | Unión Libre  | Cr 1 N 24 -56        | COLOMBIA        | CUNDINAMARCA     | BOGOTA D.C.       |             4567932 | 3210786543 | juan@gmail.com     | SI               |
    Y Gestione la información financiera del tomador de la póliza
      | tipoActividad | nombreEmpresa | actividadEconomicaEmpT | nitEmpresaT | direccionTrabajoT | paisTrabajoT | deptoTrabajoT | ciudadTrabajoT | telefonoEmpreT | ocupacionT | actividadEconPrinT | ActiEconSecundariaT | recursosPubliT | poderPublicoT | reconocimientoPublicT | vinculo | ingresosMensualesT | otrosIngresosT | totalActivos | paisOrigenIngresosT | egresosMensualesT | totalPasivosT | origenFondosT             | transaMonedaExtr | indemSeguros |
      | Asalariado    | Sas           | Banco Central          |      923414 | Calle 28 N 19 -23 | COLOMBIA     | CUNDINAMARCA  | BOGOTA D.C.    |        4321890 | Economista | Asalariados        | NO                  | NO             | NO            | NO                    | NO      |            7000000 |              0 |    150000000 | COLOMBIA            |           4000000 |      60000000 | De la actividad principal | NO               | NO           |
    Y Agregue los beneficiarios
    Y Gestione el estilo de vida y salud del cliente
    Y Agregue la información financiera del cliente
    Y Gestione la declaración del cliente
    Y Gestione el pago de la solicitud
    Y Presente la solicitud
    Entonces Valido la creación de la solicitud
