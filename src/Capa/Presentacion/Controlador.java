package Capa.Presentacion;

import Capa.Integracion.FactorySA;

public abstract class Controlador extends FactoryControlador {

	Principal vista = new Principal();
	private FactorySA FSA;

	frmMostrarEquipaje vista2 = new frmMostrarEquipaje();


	public Controlador(Principal v) {
		this.vista = v;

	}

	public Controlador() {
		FSA = FactorySA.getInstance();
		// this.con = new Conexion();
	}


}