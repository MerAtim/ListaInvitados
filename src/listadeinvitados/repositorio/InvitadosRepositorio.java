package listadeinvitados.repositorio;

import listadeinvitados.configuraciones.Conexion;
import listadeinvitados.entidades.Invitado;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class InvitadosRepositorio {

    private Connection con;

    public InvitadosRepositorio() {
        con = Conexion.getConexion();
    }

    public void agregarInvitado(Invitado invitado) {
        try {
            String sql = "INSERT INTO invitados (nombre, apellido, telefono, mail, confirmado) VALUES(?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, invitado.getNombre());
            ps.setString(2, invitado.getApellido());
            ps.setInt(3, invitado.getTelefono());
            ps.setString(4, invitado.getMail());
            ps.setBoolean(5, invitado.getConfirmado());
            ps.executeUpdate();
        } catch (SQLException ex) {

        }
    }

    public List<Invitado> obtenerInvitados() {
        List<Invitado> invitados = new ArrayList<>();
        String sql = "select * from invitados";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            for (; resultado.next();) {
                invitados.add(new Invitado(resultado.getString(1),
                        resultado.getString(2),
                        resultado.getInt(3),
                        resultado.getString(4),
                        resultado.getBoolean(5)
                ));
            }
            return invitados;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return new ArrayList<>();
        }

    }
}
