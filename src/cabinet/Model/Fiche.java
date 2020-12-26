/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import java.util.Vector;

/**
 *
 * @author admin
 */
public class Fiche {
    
    int id ;
    Vector<Consultation> consultations ;
    Vector<Ordonnance> ordonnances ;
    Vector<Certificat> certificats ;
    Vector<SituationF> situation;

    public Fiche() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vector<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(Vector<Consultation> consultations) {
        this.consultations = consultations;
    }

    public Vector<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(Vector<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public Vector<Certificat> getCertificats() {
        return certificats;
    }

    public void setCertificats(Vector<Certificat> certificats) {
        this.certificats = certificats;
    }

    public Vector<SituationF> getSituation() {
        return situation;
    }

    public void setSituation(Vector<SituationF> situation) {
        this.situation = situation;
    }

    public Fiche(int id, Vector<Consultation> consultations, Vector<Ordonnance> ordonnances, Vector<Certificat> certificats, Vector<SituationF> situation) {
        this.id = id;
        this.consultations = consultations;
        this.ordonnances = ordonnances;
        this.certificats = certificats;
        this.situation = situation;
    }

    
}
