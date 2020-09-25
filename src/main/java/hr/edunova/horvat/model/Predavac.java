/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Josip
 */
/*
@ManyToOne
@JoinColumn(name="user_id")
private User user;
*/
@Entity // ne zaboravi ga dodati u hibernate cfg.
public class Predavac extends Osoba {
      
    private String iban;
    
    // i predavac kao i smjer ce imati listu grupa koje su mapirane sa strane predavac
    // kad odem u grupa imas Predavac predavac. E TO JE TAJ PREDAVAC LOL 
    //ne zaboravi getere i setere za tu listu grupaa
     @OneToMany(mappedBy = "predavac")
    private List<Grupa> grupe = new ArrayList<>();

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }

  
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
}
