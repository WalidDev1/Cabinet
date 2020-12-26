/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOM;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ConnectionDataBase {
    
    public static Connection Connection() {
        Connection con = null ;
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cabinet","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Alerte", JOptionPane.INFORMATION_MESSAGE);
        }
        return con ;
    }
}
