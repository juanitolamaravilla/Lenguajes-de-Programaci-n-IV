/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanlegorreta_avtividad2;

import java.sql.Connection;
import java.sql.DriverManager;

        
/**
 *
 * @author borre
 */
public class Conexion {
    
    public Connection getConnection(){
    Connection con = null;
    String base = "cajerobd";
    String url = "jdbc:mysql://localhost:3306/"+ base;
    String user = "root";
    String password = "usuarioroot";
    
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection(url, user, password);
    System.out.println(" Conexión establecida con éxito. ");
    
    } catch(Exception e ){
        System.err.print(e); 
    }
return con;
    }
    
}
