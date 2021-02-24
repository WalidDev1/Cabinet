/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.Model;

import DataUser.DataManager;
import cabinet.GestionPatient.Fiche.FicheI;
import cabinet.GestionPatient.ListPatient.ListePatient;
import static cabinet.GestionPatient.ListPatient.ListePatient.selectedRow;
import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Fiche implements FicheI , Serializable{
    
    int id ;
    Vector<Consultation> consultations = new Vector<>();
    Vector<Ordonnance> ordonnances = new Vector<>();
    Vector<Certificat> certificats = new Vector<>();
    Vector<SituationF> situation = new Vector<>();
    String note ;

    public Fiche(int id, Vector<Consultation> consultations, Vector<Ordonnance> ordonnances, Vector<Certificat> certificats, Vector<SituationF> situation, String note) {
        this.id = id;
        this.consultations = consultations;
        this.ordonnances = ordonnances;
        this.certificats = certificats;
        this.situation = situation;
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

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
    
    @Override
    public Patient loadData() {
       
        return new DataManager().GetPatientById(new ListePatient().selectedRow);

    }

    @Override
    public void ComfirmerC(Consultation c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        consultations.add(c);
        
    }

    
}
