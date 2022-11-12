/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado.DAO;

import Empleado.ENTITY.Empleado;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wolve
 */
public class EmpleadoDAO {

    private String mensaje;

    public String agregarEmpleado(Connection con, Empleado emp) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO EMPLEADO (id_Empleado,nombres,apellidos,cedula,estado_Civil, genero, edad) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            pst = con.prepareStatement(sql);
            
            pst.setInt(1, emp.getIdEmpleado());
            pst.setString(2, emp.getNombres());
            pst.setString(3, emp.getApellidos());
            pst.setString(4, emp.getCedula());
            pst.setString(5, emp.getEstadoCivil() +"");
            pst.setString(6, emp.getGenero() + "");
            pst.setInt(7, emp.getEdad());
            
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "Guardado sin exito\n" + e.getMessage();
            
        }
        return mensaje;
    }

    public String modificarEmpleado(Connection con, Empleado emp) {
        
        PreparedStatement pst = null;
        String sql = "UPDATE EMPLEADO SET NOMBRES = ?, APELLIDOS = ?, CEDULA= ?, ESTADO_CIVIL =?, GENERO = ?, EDAD =?"
                + "WHERE ID_EMPLEADO = ?";

        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombres());
            pst.setString(2, emp.getApellidos());
            pst.setString(3, emp.getCedula());
            pst.setString(4, emp.getEstadoCivil() +"");
            pst.setString(5, emp.getGenero() + "");
            pst.setInt(6, emp.getEdad());
            pst.setInt(7,  emp.getIdEmpleado());
            
            
            mensaje = "Actualizado correctamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo Modificar\n" + e.getMessage();
            
        }
        return mensaje;
    }

    public String eliminarEmpleado(Connection con, int id) {
        
        PreparedStatement pst = null;
        String sql = "DELETE FROM EMPLEADO WHERE ID_EMPLEADO = ?";

        try {

            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
           
            
            
            mensaje = "Eliminado satisfactoriamente";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo eliminar \n" + e.getMessage();
            
        }
        
        return mensaje;
    }

    public void listarEmpleado(Connection con, JTable tabla) {
        
        DefaultTableModel model;
        String [] columnas = {"ID EMPLEADO", "NOMBRES", "APELLIDOS", "CEDULA", "ESTADO CIVIL", "GENERO", "EDAD" };
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM EMPLEADO ORDER BY ID_EMPLEADO";
        
        String [] filas = new String [7];
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            st= con.createStatement();
            rs= st.executeQuery(sql);
            
            while (rs.next()){
                
                for (int i = 0; i < 7; i++) {
                    
                    filas[i]= rs.getNString(i+1);
                    
                }
                
                model.addRow(filas);
                
            }
            
            tabla.setModel(model);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }
    
    public int getMaxID(Connection con){
        int id =0;
        
        PreparedStatement pst = null;
        ResultSet rs= null;
        String sql ="SELECT MAX (ID_EMPLEADO)+1 FROM EMPLEADO";
        try {
            pst= con.prepareStatement(sql);
            rs= pst.executeQuery();
            if (rs.next()){
                id=rs.getInt(1);
            }
            
            rs.close();
            pst.close();
        } catch (SQLException e) {
            
            System.out.println("Error al mostrar ID"+e.getMessage());
        }
        return id;
    }
}
