package Capa.Presentacion;

import javax.swing.table.DefaultTableModel;

import Capa.Integracion.FactorySA;
import Capa.Negocio.CEquipaje;
import Capa.Negocio.DTOEquipaje;
import Capa.Negocio.SAEquipaje;
public abstract class Controlador extends FactoryControlador {
	CEquipaje dao = new CEquipaje();
	Principal vista = new Principal();
	private FactorySA FSA;
	DefaultTableModel modelo = new DefaultTableModel();
	frmMostrarEquipaje vista2 = new frmMostrarEquipaje();
	private SAEquipaje miLogica;

	public Controlador(Principal v) {
		this.vista = v;
		FSA = FactorySA.getInstance();

	}

	public void registrarEquipaje(DTOEquipaje miPersona) {
		miLogica.validarRegistro(miPersona);
	}

}

/*
 * public void listar(JTable tabla) { centrarCeldas(tabla); modelo =
 * (DefaultTableModel) tabla.getModel(); tabla.setModel(modelo); List<CEquipaje>
 * lista = dao.listar(); Object[] objeto = new Object[4]; for (int i = 0; i <
 * lista.size(); i++) { objeto[0] = lista.get(i).getId_equipaje(); objeto[1] =
 * lista.get(i).getAlmacen(); objeto[2] = lista.get(i).getDestino(); objeto[3] =
 * lista.get(i).getOrigen(); modelo.addRow(objeto); } tabla.setRowHeight(35);
 * tabla.setRowMargin(10);
 * 
 * }
 * 
 * void centrarCeldas(JTable tabla) { DefaultTableCellRenderer tcr = new
 * DefaultTableCellRenderer();
 * tcr.setHorizontalAlignment(SwingConstants.CENTER); for (int i = 0; i <
 * vista.tabla.getColumnCount(); i++) {
 * tabla.getColumnModel().getColumn(i).setCellRenderer(tcr); } }
 */
