package Capa.Negocio;

import javax.swing.JOptionPane;

import Capa.Integracion.DAOEquipaje;
import Capa.Presentacion.Controlador;

public class SAEquipaje {
	private Controlador miControlador;
	public static boolean consultaPersona = false;
	public static boolean modificaPersona = false;

	public void setCoordinador(Controlador miCoordinador) {
		this.miControlador = miCoordinador;

	}

	public void validarRegistro(DTOEquipaje miPersona) {
		DAOEquipaje miPersonaDao;
		if (miPersona.getCodigo() > 10) {
			miPersonaDao = new DAOEquipaje();
			miPersonaDao.registrarEquipaje(miPersona);
		} else {
			JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);

		}

	}

}
