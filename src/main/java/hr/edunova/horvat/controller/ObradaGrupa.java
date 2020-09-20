/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Grupa;
import hr.edunova.horvat.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    public List<Grupa> getPodaci() {
  return session.createQuery("from Grupa").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {

    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {

    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
