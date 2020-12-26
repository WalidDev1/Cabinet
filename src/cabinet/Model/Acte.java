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
public class Acte {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Acte(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    int id ;
    String nom ;
}
