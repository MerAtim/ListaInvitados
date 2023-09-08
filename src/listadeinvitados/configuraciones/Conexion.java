package listadeinvitados.configuraciones;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost:1234/";
    private static final String DB="listadeinvitados";
    private static final String USUARIO="root";
    private static String PASSWORD="";
    private static Connection con;

    private Conexion() {
    }
    
    public static Connection getConexion(){
        if(con==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                con=DriverManager.getConnection(URL+DB+"?useLegacyDatetimecode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);
            }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la BD"+ex.getMessage());
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers"+ex.getMessage());
            }
        }
        return con;
    }
    
    public void desconectar(){
        try{
           con.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}