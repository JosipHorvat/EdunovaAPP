/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.model;

import javax.persistence.Entity;

/**
 *
 * @author Josip
 */
@Entity
public class Polaznik extends Osoba{
  
    private String brojUgovora;

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }
    
}
