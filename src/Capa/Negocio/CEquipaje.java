package Capa.Negocio;

import java.util.List;

public class CEquipaje {
	int id_equipaje;
	String almacen;
	String origen;
	String destino;

	public void CEquipaje() {

	}

	public CEquipaje() {

		this.id_equipaje = id_equipaje;
		this.almacen = almacen;
		this.origen = origen;
		this.destino = destino;

	}

	public int getId_equipaje() {
		return id_equipaje;
	}

	public void setId_equipaje(int id_equipaje) {
		this.id_equipaje = id_equipaje;
	}

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<CEquipaje> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
