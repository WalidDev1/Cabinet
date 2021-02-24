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
public class Dent implements Serializable{
    // id est la position de la dent sur le schema
    int id = 0; 
    String dent ;

    public Dent() {
    }

    public Dent(String dent) {
        this.id ++;
        this.dent = dent;
    }

     public Dent(int id ,String dent) {
        this.id = id ;
        this.dent = dent;
    }
     
    public String getDent() {
        return dent;
    }

    public void setDent(String dent) {
        this.dent = dent;
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
