package Capa.Negocio;

import java.util.ArrayList;
import java.util.List;

/**
 * Alice - Almacen
 */

public class DTOEquipaje {

	int codigo;
	String almacen;
	String origen;
	String destino;

	private List<DTOAlmacen> equipaje;

	public DTOEquipaje() {
		setEquipaje(new ArrayList<>());

	}



	public List<DTOAlmacen> getEquipajes() {
		return equipaje;
	}

	public void setEquipaje(List<DTOAlmacen> equipaje) {
		this.equipaje = equipaje;
	}

	public final int getCodigo() {
		return codigo;
	}


	public final void setCodigo(int id_equipaje) {
		this.codigo = id_equipaje;
	}


	public final String getAlmacen() {
		return almacen;
	}


	public final void setAlmacen(String almacen) {
		this.almacen = almacen;
	}


	public final String getOrigen() {
		return origen;
	}


	public final void setOrigen(String origen) {
		this.origen = origen;
	}


	public final String getDestino() {
		return destino;
	}

	public final void setDestino(String destino) {
		this.destino = destino;
	}

}
