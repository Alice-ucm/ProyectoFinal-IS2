package Capa.Presentacion;

import Capa.Integracion.FactorySA;
import Capa.Negocio.SAAlmacen;
import Capa.Negocio.SATransporte;

public abstract class FactoryControlador {
	private static SATransporte trans;
	private static SAAlmacen equip;
	private static FactorySA FSA;
	private static Controlador instance;

	public static FactoryControlador getInstance() {
		FSA = FactorySA.getInstance();

		if (trans == null) {
			trans = new SATransporte();
		}
		if (equip == null) {
			equip = new SAAlmacen();
		}
		return instance;
	}
}
