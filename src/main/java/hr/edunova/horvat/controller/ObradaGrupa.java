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
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
          if(entitet.getPolaznici().size()>0){
            throw new EdunovaException("Grupa se ne može obrisati jer ima jednog ili više polaznika");
        }
    }
    
     private void kontrolaNaziv() throws EdunovaException{
       kontrolaNull(entitet.getNaziv(), "Naziv nije definiran");

        if(entitet.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv nije postavljen, unijeti naziv");
        }


    }



    private void kontrolaNull(Object o, String poruka) throws EdunovaException{
        if(o==null){
            throw new EdunovaException(poruka);
        }
    }
    
}
