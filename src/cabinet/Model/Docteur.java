/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

/**
 *
 * @author admin
 */
public class Docteur {
    String nom ;
    String prenom;
    String log ;
    String Pass ;

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

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public Docteur(String nom, String prenom, String log, String Pass) {
        this.nom = nom;
        this.prenom = prenom;
        this.log = log;
        this.Pass = Pass;
    }
}
