/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Patient {

    public Patient(int id ,String nom, String prenom, Date date_debut_consultation) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_debut_consultation = date_debut_consultation;
        this.id = id;
    }
     int id;
     String nom ;
     String prenom;
     Date date_debut_consultation;

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
}
