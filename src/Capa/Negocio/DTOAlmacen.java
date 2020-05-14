package Capa.Negocio;

import java.util.ArrayList;
import java.util.List;

import Capa.Integracion.FactorySA;

public class DTOAlmacen {

	private int id;
	private int vuelo;
	private int codigo;
	private String origen;
	private String destino;
	private String estado;
	private String reporte;
	private int capacidad;

	private List<DTOAlmacen> Equipaje;

	public DTOAlmacen() {
		setEquipaje(new ArrayList<>());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVuelo() {
		return vuelo;
	}

	public void setVuelo(int vuelo) {
		this.vuelo = vuelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getReporte() {
		return reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<DTOAlmacen> getEquipaje() {
		return Equipaje;
	}

	public void setEquipaje(List<DTOAlmacen> equipaje) {
		Equipaje = equipaje;
	}

	public FactorySA getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
