/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Smjer;
import hr.edunova.horvat.utility.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Josip
 */
// Ovdje je onaj T koji moze biti bilo koji objekt a u ovome slucaju je Smjer
// Sada se  moraju implementirati sve abstraktne metode
public class ObradaSmjer extends Obrada<Smjer> {

// nemam entitet Smjer kojeg bi implementirao stoga ide ovaj konstruktor   
// koji ce primiti taj Smjer 
    public ObradaSmjer(Smjer smjer) {
        //  i on ce poslati nadklasi taj smjer
        super(smjer);
        // bit ce greska dok je nadklasa prazna
    }
    
    @Override
    public List<Smjer> getPodaci() {
    return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {

    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {

    }

    private void kontrolaNaziv() throws EdunovaException {
        konntrolaNull(entitet.getNaziv(), "Naziv nije definiran");
        if (entitet.getNaziv() == null) {
            throw new EdunovaException("Naziv nije definiran, unijeti naziv");
        }
        if (entitet.getNaziv().trim().isEmpty()) {
            throw new EdunovaException("Naziv nije definiran, unijeti naziv");
        }
        boolean broj = false;
        try {
            new BigDecimal(entitet.getNaziv()); 
            broj =true;
        } catch (Exception e) {
        }
        if(broj){
            throw new EdunovaException("Naziv ne moze biti broj, unijeti naziv");
        }
        
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne moze biti duzi od 50 znakova ");
        }
  }

    private void kontrolaCijena() throws EdunovaException{
        konntrolaNull(entitet.getCijena(), "Cijena nije definirana");
       if(entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
           throw new EdunovaException("Cijena ne moze biti manja ili jednaka nuli");
       }
       if(entitet.getCijena().compareTo(new BigDecimal(100000))== 1){
           throw  new EdunovaException("Cijena ne moze biti veca od 100.000,00 kn ");
       }
    }
    
    private void konntrolaNull (Object o, String poruka) throws EdunovaException{
         if (o == null){
        throw new EdunovaException(poruka);
    }
    }

    

}
