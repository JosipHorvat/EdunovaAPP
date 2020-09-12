
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Osoba;
import hr.edunova.horvat.utility.EdunovaException;
import hr.edunova.horvat.utility.Oib;
import java.util.List;

/**
 * @author Josip
 */
// Problem: 
/*
Ne mozes je parametizirat sa osobom pa je parametiziras sa T 
Sto je T?? 
kazes: ObradaOsoba<T extends Osoba> i tek onda kazes extends Obrada<T>
*/
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{

    // NE MORA IMATI NISTA JER JE TO ABSTRAKTNA KLASA I IMA NESTO ISPOD SEBE 
   
    // ali to ne znaci da ne mozemo ubaciti sto zelimo:

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaOib();
        
        
        if(!Oib.isValjan(entitet.getOib())){
            throw new EdunovaException("OIB nije valjan");
        }
    }
    // dodju sve ostale kontrole na razini osoba 

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    }
// protected je da se vidi i u predavacu
   protected void kontrolaOib() throws EdunovaException{
         if(entitet.getOib()== null || entitet.getOib().isEmpty()){
            throw new EdunovaException("OIB obavezno");
        }
    }

    protected void kontrolaIme() throws EdunovaException{
        if(entitet.getIme() == null || entitet.getIme().isEmpty()){
            throw new EdunovaException("Ime obavezno");
        }
    }
   
    
}
