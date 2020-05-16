package Capa.Integracion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import Capa.Negocio.CEquipaje;
import Capa.Negocio.Conexion;
import Capa.Negocio.DTOEquipaje;

public class DAOEquipaje {

	Conexion conexion = new Conexion();

	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	CEquipaje p = new CEquipaje();

	public List listar() {
		List<CEquipaje> datos = new ArrayList<>();
		try {
			con = conexion.getConexion();
			ps = (PreparedStatement) con.prepareStatement("select * from equipaje");
			rs = ps.executeQuery();
			while (rs.next()) {
				CEquipaje p = new CEquipaje();
				p.setId_equipaje(rs.getInt(1));
				p.setAlmacen(rs.getString(2));
				p.setOrigen(rs.getString(3));
				p.setDestino(rs.getString(4));
				datos.add(p);
			}
		} catch (Exception e) {
		}
		return datos;
	}

	public void registrarEquipaje(DTOEquipaje equipaje) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConexion().createStatement();
			estatuto.executeUpdate("INSERT INTO equipaje VALUES ('" + equipaje.getCodigo() + "', '"
					+ equipaje.getAlmacen() + "', '" + equipaje.getDestino() + "', '" + equipaje.getOrigen() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			// conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

}
