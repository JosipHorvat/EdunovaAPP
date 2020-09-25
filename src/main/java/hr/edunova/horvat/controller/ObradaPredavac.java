/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Predavac;
import hr.edunova.horvat.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaPredavac extends ObradaOsoba<Predavac> {

    @Override
    public List<Predavac> getPodaci() {
        return session.createQuery("from Predavac").list();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
         if(entitet.getGrupe().size()>0){
            throw new EdunovaException("Predavac se ne moze obrisati jer vodi jednu ili vise grupa");
        }
    }
    //NIJE BIO NAPRAVIO KONTROLA CREATE I UPDATE JER ONA VEC POSTOJI U OSOBA

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
        kontrolaIme();
        // kontrola ime je metoda iz osobe koja je tamo protected i nasljedjena je ovdje
        kontrolaIban();
        
      
      }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }


    private void kontrolaIban() throws EdunovaException{
if(entitet.getIban()==null || entitet.getIban().isEmpty()){
            throw new EdunovaException("Iban obavezno");
        }      }
    
    
    
}
