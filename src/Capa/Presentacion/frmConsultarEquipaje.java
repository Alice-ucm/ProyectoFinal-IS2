package Capa.Presentacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import Capa.Negocio.Conexion;

public class frmConsultarEquipaje extends JFrame {

	public frmConsultarEquipaje() {
		setTitle("Consultar Equipaje");
		initComponents();
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jtProductos = new javax.swing.JTable();
		txtCampo = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		btnBuscar = new javax.swing.JButton();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		jtProductos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Codigo", "Nombre", "Precio", "Cantidad" }) {

			private static final long serialVersionUID = 1L;
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.Double.class,
					java.lang.Integer.class };
			boolean[] canEdit = new boolean[] { false, false, false, false };

			@Override
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jtProductos);

		jLabel1.setText("Codigo:");

		btnBuscar.setText("Buscar");
		btnBuscar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBuscarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480,
								Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(66, 66, 66).addComponent(btnBuscar)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(45, 45, 45)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1).addComponent(btnBuscar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}

	private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {

		String campo = txtCampo.getText();
		String where = "";
		if (!"".equals(campo)) {
			where = "WHERE codigo = '" + campo + "'";
		}

		try {
			DefaultTableModel modelo = new DefaultTableModel();
			jtProductos.setModel(modelo);

			PreparedStatement ps = null;
			ResultSet rs = null;
			Conexion conn = new Conexion();
			Connection con = conn.getConexion();

			String sql = "SELECT codigo, nombre, precio, cantidad FROM productos " + where;
			System.out.println(sql);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			ResultSetMetaData rsMd = rs.getMetaData();
			int cantidadColumnas = rsMd.getColumnCount();

			modelo.addColumn("Codigo");
			modelo.addColumn("Producto");
			modelo.addColumn("Precio");
			modelo.addColumn("Cantidad");
			int[] anchos = { 50, 200, 50, 50 };
			for (int i = 0; i < jtProductos.getColumnCount(); i++) {
				jtProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
			}

			while (rs.next()) {
				Object[] filas = new Object[cantidadColumnas];
				for (int i = 0; i < cantidadColumnas; i++) {
					filas[i] = rs.getObject(i + 1);
				}
				modelo.addRow(filas);
			}

		} catch (Exception ex) {
			System.err.println(ex.toString());
		}

	}

	// Variables
	private javax.swing.JButton btnBuscar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jtProductos;
	private javax.swing.JTextField txtCampo;

}
