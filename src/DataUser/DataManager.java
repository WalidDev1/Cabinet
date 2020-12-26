/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataUser;

import DOM.ConnectionDataBase;
import cabinet.Model.Acte;
import cabinet.Model.Docteur;
import cabinet.Model.Patient;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class DataManager {
    
    public static Vector<Patient> listePatient = new Vector<Patient>();
    public static Docteur docteur = null;
    public static Vector<Acte> actes = new Vector<Acte>() ;
    
    //avec base de donnees
    public static boolean Sycronisation(Docteur docteur){
        // Func dbb
    return false;
    }
    
    public static boolean Sycronisation(Acte acte){
        // Func dbb
    return false;
    }
    
    public static boolean Sycronisation(Vector<Patient> listePatient){
        // Func dbb
    return false;
    }
    
    // localement 
    //Remove patient
    
    //Modify patien
    
    //Remove Fiche
    
    //Modify Fiche
            //--> Modify Consultation
            //--> Modify Certif
            //--> Modify Ordonnance
            //--> Modify Situation
            //--> Remove Consultation
            //--> Remove Certif
            //--> Remove Ordonnance
            //--> Remove Situation
    
    
    public static boolean AddPatient(Patient patien) throws SQLException{
       int count = 0 ;
        try{ 
            patien.setId(++count);
            listePatient.add(patien);
            System.out.print(patien.getAge() + patien.getNom());
            PreparedStatement ps = null ;
            ResultSet rs = null ;
            Connection con = ConnectionDataBase.Connection();
            if(!listePatient.isEmpty())  
                  count = listePatient.lastElement().getId();
            String sqlReq = "INSERT INTO Patient (id, nom, prenom, date_debut_consultation, sexe, note, age) VALUES (?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sqlReq);
            ps.setInt(1,patien.getId());
            ps.setString(2,patien.getNom());
            ps.setString(3,patien.getPrenom());
            ps.setDate(4, new java.sql.Date(patien.getDate_debut_consultation().getTime()));
            ps.setInt(5, patien.getSexe());
            ps.setString(6, patien.getNote());
            ps.setInt(7, patien.getAge());
            ps.executeUpdate();
            return true ;
        }catch(SQLException | HeadlessException ex){
           System.out.println("Sql : "+ex);
        }
       return false;
    }
    
}
