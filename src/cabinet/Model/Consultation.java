/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Consultation {
    
    int id ;
    Acte acte ;
    Date date ;
    String note ;
    Vector<Dent> dents;
    Float prix;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Acte getActe() {
        return acte;
    }

    public void setActe(Acte acte) {
        this.acte = acte;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Vector<Dent> getDents() {
        return dents;
    }

    public void setDents(Vector<Dent> dents) {
        this.dents = dents;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Consultation(int id, Acte acte, Date date, String note, Vector<Dent> dents, Float prix) {
        this.id = id;
        this.acte = acte;
        this.date = date;
        this.note = note;
        this.dents = dents;
        this.prix = prix;
    }

}
