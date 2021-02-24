/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class SituationF implements Serializable{
    
    int id ;
    // 1 == espece , 2 == cheques
    int mode;
    Consultation consultation ;
    float prixDeposer;

    public SituationF(int id, int mode, Consultation consultation, float prixDeposer) {
        this.id = id;
        this.mode = mode;
        this.consultation = consultation;
        this.prixDeposer = prixDeposer;
    }

    public SituationF() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public float getPrixDeposer() {
        return prixDeposer;
    }

    public void setPrixDeposer(float prixDeposer) {
        this.prixDeposer = prixDeposer;
    }
   
}
