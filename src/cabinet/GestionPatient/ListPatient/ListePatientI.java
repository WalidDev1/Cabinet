/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet.GestionPatient.ListPatient;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public interface ListePatientI {
    public void LoadData(JTable table , DefaultTableModel model);
    public Boolean Modifier(int id);
    public Boolean Supprimer(int id);
    public void Consulter(int id);
}
