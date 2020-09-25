/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Osoba;
import hr.edunova.horvat.model.Polaznik;
import hr.edunova.horvat.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> getPodaci() {
        return session.createQuery("from Polaznik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaBrojUgovora();
        // sada sa super uzmem sto mi treba iz parent klase osoba
        // prvo se sve kontrolira u nad klasi 
        
        // sada koristim sto imam u polaznik:
       
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
         if(entitet.getGrupe().size()>0){
            throw new EdunovaException("Polaznik se ne moze obrisati jer je u jednoj ili vise grupa");
        }
    }

    private void kontrolaBrojUgovora() throws EdunovaException{
         if(entitet.getBrojUgovora()== null || entitet.getBrojUgovora().isEmpty()){
            throw new EdunovaException("Broj ugovora obavezan!");
        }
    }
    
}
