package Capa.Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Capa.Negocio.DTOEquipaje;

public class frmEnviarEquipaje extends JFrame implements ActionListener {

	private Controlador miCoordinador;
	private JButton btnEnviar;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextCodigo;
	private JTextField TextOrigen;
	private JTextField TextDestino;
	private JTextField TextAlmacen;


	public frmEnviarEquipaje() {
		setTitle("Enviar Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextCodigo = new JTextField();
		TextCodigo.setToolTipText("");
		TextCodigo.setBounds(127, 43, 134, 20);
		contentPane.add(TextCodigo);
		TextCodigo.setColumns(10);

		JLabel lblNewLabel = new JLabel("Codigo :");
		lblNewLabel.setBounds(71, 46, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Origen :");
		lblNewLabel_2.setBounds(71, 131, 46, 14);
		contentPane.add(lblNewLabel_2);

		TextOrigen = new JTextField();
		TextOrigen.setBounds(127, 128, 134, 20);
		contentPane.add(TextOrigen);
		TextOrigen.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Destino:");
		lblNewLabel_3.setBounds(71, 175, 46, 14);
		contentPane.add(lblNewLabel_3);

		TextDestino = new JTextField();
		TextDestino.setBounds(127, 172, 134, 20);
		contentPane.add(TextDestino);
		TextDestino.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Almacen");
		lblNewLabel_4.setBounds(71, 87, 46, 14);
		contentPane.add(lblNewLabel_4);

		TextAlmacen = new JTextField();
		TextAlmacen.setBounds(127, 87, 134, 20);
		contentPane.add(TextAlmacen);
		TextAlmacen.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");


		btnEnviar.addActionListener(this);
		add(btnEnviar);
		limpiar();

		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		btnEnviar.setBounds(127, 225, 120, 23);
		contentPane.add(btnEnviar);
	}

	private void limpiar() {
		TextCodigo.setText("");
		TextOrigen.setText("");
		TextDestino.setText("");
		TextAlmacen.setText("");

	}

	public void setCoordinador(Controlador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			try {
				DTOEquipaje Dequipaje = new DTOEquipaje();
				Dequipaje.setCodigo(Integer.parseInt(TextCodigo.getText()));

				Dequipaje.setOrigen(TextOrigen.getText());
				Dequipaje.setDestino(TextDestino.getText());
				Dequipaje.setAlmacen(TextAlmacen.getText());

				miCoordinador.registrarEquipaje(Dequipaje);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error en el Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}
