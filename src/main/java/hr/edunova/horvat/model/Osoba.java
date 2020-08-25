/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Josip
 */
@Entity
@Table(name= "osoba")
public class Osoba {
   //  ovo je jednako na sifra not null primary key auto increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String ime;
    private boolean student;
    private BigDecimal skolarina;
    private Date datumRodenja;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public BigDecimal getSkolarina() {
        return skolarina;
    }

    public void setSkolarina(BigDecimal skolarina) {
        this.skolarina = skolarina;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }
    
}
