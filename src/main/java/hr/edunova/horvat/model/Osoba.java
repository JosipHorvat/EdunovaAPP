
package hr.edunova.horvat.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 *
 * @author Josip
 */

// Osoba je isto mapped super klas jer ce je nasljedit polaznik i predavac 
@MappedSuperclass
//@Inheritance(strategy = InheritanceType.JOINED)
public  class Osoba extends Entitet{
    // Osoba je abstract jer je necu koristiti
    // nije potrebna sifra jer je Osoba nasljedila sifru od entitet
    private String ime;
    private String prezime;
    private String email;
    private String oib;

   
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
}
