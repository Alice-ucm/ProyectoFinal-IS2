package Capa.Integracion;

import Capa.Negocio.DTOAlmacen;
import Capa.Negocio.SAAlmacen;
import Capa.Negocio.SATransporte;

public class FactorySAImpl extends FactorySA {

	@Override
	public SAAlmacen creaSAEquipaje() {

		return new SAAlmacen();
	}

	@Override
	public SATransporte creaSATransporte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DTOAlmacen crearDAOEquipaje() {
		// TODO Auto-generated method stub
		return null;
	}
}
