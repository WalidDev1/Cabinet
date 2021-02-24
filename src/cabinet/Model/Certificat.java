/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Certificat implements Serializable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Certificat(int id, Date date_debut, Date date_fin, String motif, String note) {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.motif = motif;
        this.note = note;
    }
    
    int id ; 
    Date date_debut ;
    Date date_fin ;
    String motif;
    String note;
}
