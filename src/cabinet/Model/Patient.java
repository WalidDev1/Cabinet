/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import DataUser.DataManager;
import cabinet.GestionPatient.AjoutPatient.AjoutPatientI;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Patient implements AjoutPatientI , IPatient , Serializable {


     int id;
     String nom ;
     String prenom;
     Date date_debut_consultation;
     // 1 == Mr , 2 == Mm
     int sexe ;
     String note;
     int age;
     Fiche fiche ;

    public Patient() {
    }

    public Fiche getFiche() {
        return fiche;
    }

    public void setFiche(Fiche fiche) {
        this.fiche = fiche;
    }

    public Patient(int id, String nom, String prenom, Date date_debut_consultation, int sexe, String note, int age, Fiche fiche) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_debut_consultation = date_debut_consultation;
        this.sexe = sexe;
        this.note = note;
        this.age = age;
        this.fiche = fiche;
    }
         
    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_debut_consultation() {
        return date_debut_consultation;
    }

    public void setDate_debut_consultation(Date date_debut_consultation) {
        this.date_debut_consultation = date_debut_consultation;
    }
    
    @Override
    public Boolean Enregistrer() {
         try {
             System.out.println("here 1");
             // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             new DataManager().AddPatient(this);
             return true ;
         } catch (Exception ex) {
         }
         return false;
    }

    @Override
    public void SaveFiche() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
        new DataManager().SaveChangesPatient(this);
    }
    
}
