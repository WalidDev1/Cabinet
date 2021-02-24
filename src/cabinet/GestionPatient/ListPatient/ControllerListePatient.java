/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.GestionPatient.ListPatient;

import cabinet.GestionPatient.MenuGestionPatient;
import cabinet.Model.Patient;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DataUser.DataManager;
/**
 *
 * @author admin
 */
public class ControllerListePatient implements ListePatientI{
    

        
    @Override
    public void LoadData(JTable table , DefaultTableModel model) {
        new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        // Ajjout des donnees depuis la liste
        for (Patient patient : DataManager.listePatient) {
           model.addRow(new Object[]{patient.getId(),patient.getNom(),patient.getPrenom(),patient.getDate_debut_consultation()}); 
        }
        
        table.setModel(model);
        
    }

    @Override
    public Boolean Modifier(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean Supprimer(int id) {
        return new DataManager().SupprimerPatient(id);
    }

    @Override
    public void Consulter(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
