/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Operater;
import hr.edunova.horvat.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaOperater extends ObradaOsoba<Operater>{
    
//   public Operater autoriziraj(String email, char[] lozinka){
//       
//   }
    
    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
        // hiberante poziv za select * from operater 
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
    kontrolaIme();
    
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }
    
 
    @Override
    protected void kontrolaDelete() throws EdunovaException {

    }
    
}
