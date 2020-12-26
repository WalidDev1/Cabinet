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
public class Ordonnance {
    
    int id ;
    Date date ;
    Vector<String> medicaments ;

    public Ordonnance(int id, Date date, Vector<String> medicaments) {
        this.id = id;
        this.date = date;
        this.medicaments = medicaments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vector<String> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Vector<String> medicaments) {
        this.medicaments = medicaments;
    }
    
}
