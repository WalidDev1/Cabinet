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
public class SituationF {
    
    int id ;
    // 1 == espece , 2 == cheques
    int mode;
    Consultation consultation ;
    float prix;
    float reste ;

    public SituationF(int id, int mode, Consultation consultation, float prix, float reste) {
        this.id = id;
        this.mode = mode;
        this.consultation = consultation;
        this.prix = prix;
        this.reste = reste;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getReste() {
        return reste;
    }

    public void setReste(float reste) {
        this.reste = reste;
    }
    
}
