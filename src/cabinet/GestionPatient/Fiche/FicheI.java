/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.GestionPatient.Fiche;

import cabinet.Model.Consultation;
import cabinet.Model.Dent;
import cabinet.Model.Patient;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author admin
 */
public interface FicheI {
    
    Patient loadData();
    
    // Function Consultation 
    void ComfirmerC(Consultation c);
    
}
