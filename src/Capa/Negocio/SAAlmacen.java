package Capa.Negocio;

import java.util.List;

import Capa.Integracion.FactorySA;

public class SAAlmacen {

	private DTOAlmacen Equipaje;

	public SAAlmacen() {
		crearPedido();
	}

	public void crearPedido() {
		Equipaje = FactorySA.getInstance().crearDAOEquipaje();

	}

	public void addEquipaje(int id, int vuelo) {
		DTOAlmacen FactorySA = null;
		Equipaje = FactorySA.getInstance().crearDAOEquipaje();
		if (Equipaje != null) {
			List<DTOAlmacen> lista = Equipaje.getEquipaje();
			lista.add(Equipaje);
			FactorySA.getInstance().crearDAOEquipaje();

		} else {
			throw new IllegalArgumentException("El producto no esta en BBDD de Almacen");
		}

	}

	public List<DTOAlmacen> ListarPedido() {

		List<DTOAlmacen> lista = Equipaje.getEquipaje();

		return lista;
	}

}
