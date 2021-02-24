/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataUser;

import cabinet.GestionPatient.Fiche.FicheJ;
import cabinet.Model.Acte;
import cabinet.Model.Certificat;
import cabinet.Model.Consultation;
import cabinet.Model.Dent;
import cabinet.Model.Docteur;
import cabinet.Model.Fiche;
import cabinet.Model.Ordonnance;
import cabinet.Model.Patient;
import cabinet.Model.SituationF;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author admin
 */
public class DataManager {
    
    public static Vector<Patient> listePatient = new Vector<Patient>();
    public static Docteur docteur = null;
    public static Vector<Acte> actes = new Vector<Acte>() ;
    public static Vector<Fiche> fiches = new Vector<Fiche>() ;
    public static Vector<Consultation> consultations = new Vector<Consultation>();
    //avec base de donnees
    public static boolean Sycronisation(Docteur docteur){
        // Func dbb
    return false;
    }
    
    public static void Save (){
        try {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/Cabinet.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(listePatient);
         out.writeObject(docteur);
         out.writeObject(actes);
         out.writeObject(fiches);
         out.writeObject(consultations);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/Cabinet.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
  
   public static void Read(){
         try {
         FileInputStream fileIn = new FileInputStream("/tmp/Cabinet.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         listePatient = (Vector<Patient>) in.readObject();
         docteur = (Docteur) in.readObject();
         fiches = (Vector<Fiche>) in.readObject();
         actes = (Vector<Acte>) in.readObject();
         consultations = (Vector<Consultation>) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("class not found");
         c.printStackTrace();
         return;
      }
   }
    
//    public static void SycronisationActe(){
//        actes.removeAllElements();
//        try{ 
//        Connection con = ConnectionDataBase.Connection();
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM Acte");
//            while (rs.next()) {
//             actes.add(new Acte(rs.getInt("id"), rs.getString("Nom")));
//          
//            }  
//        }catch(SQLException | HeadlessException ex){
//           System.out.println("Sql : "+ex);
//        }
//    }
//    
//    public static void SycronisationListePatient() throws SQLException{
//        listePatient.removeAllElements();
//        try{ 
//        Connection con = ConnectionDataBase.Connection();
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM Patient");
//            while (rs.next()) {
//            Fiche fiche = new Fiche();
//            fiche.setId((int) rs.getInt("id_fiche"));
//            listePatient.add(new Patient(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),(Date) rs.getDate("date_debut_consultation"), rs.getInt("sexe"), rs.getString("note"), rs.getInt("age"),fiche));
//          
//            }  
//        }catch(SQLException | HeadlessException ex){
//           System.out.println("Sql : "+ex);
//        }
//    }
//    
//    public static Patient GetDonneePatient(int id){
//        
//        Patient patient_result = new Patient();
//        try{ 
//        
//            for (Patient patient : listePatient) {
//                if(patient.getId() == id){ 
//                    if(patient.getFiche() != null){
//                        Connection con = ConnectionDataBase.Connection();
//                        Statement stmt = con.createStatement();
//                        // get all consultation about the patient
//                        ResultSet rsC = stmt.executeQuery("SELECT c.* , a.* , d.* from Consultation c , Acte a , DentP d WHERE c.Id_Fiche = "+patient.getFiche().getId()+" and a.id = c.id_acte and d.id = c.id_dent ");
//                        
//                        Vector<Consultation> listCo = new Vector<Consultation>();
//                        
//                        while (rsC.next()) {
//                            Consultation co;
//                            listCo.add(co = new Consultation(rsC.getInt("c.id"), new Acte(rsC.getInt("a.id"), rsC.getString("a.Nom")),(Date) rsC.getDate("c.date"),rsC.getString("c.note"),new Dent(rsC.getInt("d.id"),rsC.getString("d.dent")) , rsC.getFloat("c.prix")));
//                             Connection con1 = ConnectionDataBase.Connection();
//                        Statement stmt1 = con1.createStatement();
//                            // get all Situation
//                            ResultSet rsSi = stmt1.executeQuery("SELECT * FROM Situation where Situation.id_consultation = "+rsC.getInt("id"));
//                            
//                            Vector<SituationF> si = new Vector<SituationF>();
//                            while(rsSi.next()){
//                               si.add(new SituationF(rsSi.getInt("id"), rsSi.getInt("mode"), co, rsSi.getFloat("prixDeposer")));
//                            }
//                            patient.getFiche().setSituation(si);
//                        } 
//                        
//                        patient.getFiche().setConsultations(listCo);
//                        
//                        // get all certif
//                        Connection con2 = ConnectionDataBase.Connection();
//                        Statement stmt2 = con2.createStatement();
//                        ResultSet rsCe = stmt2.executeQuery("SELECT * from Certificat where Certificat.id_Fiche = "+patient.getFiche().getId());
//                        Vector<Certificat> ce = new Vector<Certificat>();
//                        while (rsCe.next()) {
//                            ce.add(new Certificat(rsCe.getInt("id"),(Date) rsCe.getDate("Date_debut"),(Date) rsCe.getDate("Date_fin"),rsCe.getString("note"),rsCe.getString("motif")));
//                        } 
//                        patient.getFiche().setCertificats(ce);
//                        // get all ordonance 
//                        Connection con3 = ConnectionDataBase.Connection();
//                        Statement stmt3 = con3.createStatement();
//                        ResultSet rso = stmt3.executeQuery("SELECT * from Ordonnance where Ordonnance.id_Fiche = "+patient.getFiche().getId());
//                        Vector<Ordonnance> o = new Vector<Ordonnance>();
//                        while (rsCe.next()) {
//                            // get medicament about this patient
//                            Connection con4 = ConnectionDataBase.Connection();
//                        Statement stmt4 = con4.createStatement();
//                            ResultSet rsoMdoc = stmt4.executeQuery("SELECT * FROM Medicament where Medicament.id_ordonance = "+rso.getInt("id")+"");
//                            Vector<String> medoc = new Vector<String>();
//                            while (rsoMdoc.next()) {
//                                medoc.add(rsoMdoc.getString("Nom"));
//                            }
//                            o.add(new Ordonnance(rso.getInt("id"),(Date) rso.getDate("date"),medoc));
//                        }   
//                        patient.getFiche().setOrdonnances(o);
//                    }
//                    patient_result = patient ;
//                    break ;
//                }
//            }
//        }catch(SQLException | HeadlessException ex){
//            System.out.println("Sql : "+ex);
//        }
//       
//    return patient_result;
//    }
//    
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
    
    
    public static boolean AddPatient(Patient patien) {
       int count = 0 ;
        try{ 
            patien.setId(++count);
            if(!listePatient.isEmpty())  
            count = listePatient.lastElement().getId();
            listePatient.add(patien);
            Save();
            return true ;
        }catch( HeadlessException ex){
           System.out.println("Erreur : "+ex.getMessage());
        }
       return false;
    }
    
    public Patient GetPatientById(int id){
        Patient patientResult = null ;
     for (Patient p : listePatient){
         if (p.getId() == id){
            patientResult = p ;
            break;
         }
     }
     return patientResult;
    }
    
    public void SaveChangesPatient(Patient patient){
        for(Patient p : listePatient){
           if(p.getId() == patient.getId()){
           p.setAge(patient.getAge());
           p.setFiche(patient.getFiche());
           p.setNom(patient.getNom());
           p.setNote(patient.getNote());
           p.setPrenom(patient.getPrenom());
           }
        }
        Save();
    }
   
    
    public void SysncConsultationForPatient(int id , Consultation consultation){
        GetPatientById(id).getFiche().getConsultations().forEach((c)->{
        if(c.getId() == consultation.getId()){
            c = consultation ;
        }
        });
        Save();
    }
    
    public Boolean SupprimerPatient(int id) {
        for (Patient p : listePatient){
            if(p.getId() == id){
                listePatient.remove(p);
                Save();
                return true ;
            }
        }
    return false ;
    }
    
    public Acte FindActeById(int id){
        Acte acteRes = null ;
        for(Acte acte : actes){
            if(acte.getId() == id){
                acteRes = acte ;
            }
        }
        return acteRes ;
    }
}
