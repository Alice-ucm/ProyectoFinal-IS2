package Capa.Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class Controlador implements ActionListener {


	Principal vista = new Principal();

	frmMostrarEquipaje vista2 = new frmMostrarEquipaje();


	public Controlador(Principal v) {
		this.vista = v;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}