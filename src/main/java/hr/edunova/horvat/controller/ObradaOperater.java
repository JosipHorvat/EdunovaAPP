/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Operater;
import hr.edunova.horvat.utility.EdunovaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Josip
 */
public class ObradaOperater extends ObradaOsoba<Operater>{
    
   public Operater autoriziraj(String email, char[] lozinka){
       
       Operater operater = (Operater) session.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if(operater==null){
            return null;
        }

        return BCrypt.checkpw(new String(lozinka), operater.getLozinka()) 
                ? operater : null;
   }
    
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
