/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Josip
 */
@Entity
public class Grupa extends Entitet{
    
    private String naziv;
    private Date datumpocetka;
    // Iz vise smjerova ide na jednu grupu 
    // many to 1
    // Grupa pripada jednom i samo jednom smjeru
    // kada se cita anotacija: iz onog tamo skupa smjerova - many to 1
  
    @ManyToOne
    private Smjer smjer;
    
    // isto vrijedi i za predavaca
    @ManyToOne
    private Predavac predavac;
    
    // Grupa ima vise polaznika
  
    @ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "clan", joinColumns = {
@JoinColumn(name = "grupa_id")}, inverseJoinColumns = {
@JoinColumn(name = "polaznik_id")})
    //@ManyToMany
    private List<Polaznik> polaznici = new ArrayList<>();
    
    // ne zaboraviti geters i seters te hiberante cfg;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
}
