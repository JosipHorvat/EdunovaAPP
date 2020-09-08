/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.controller;

import hr.edunova.horvat.model.Smjer;
import hr.edunova.horvat.utility.EdunovaException;

/**
 *
 * @author Josip
 */
// Ovdje je onaj T koji moze biti bilo koji objekt a u ovome slucaju je Smjer
// Sada se  moraju implementirati sve abstraktne metode
public class ObradaSmjer extends Obrada<Smjer>{
    
// nemam entitet Smjer kojeg bi implementirao stoga ide ovaj konstruktor   
// koji ce primiti taj Smjer 
    public ObradaSmjer(Smjer smjer) {
       //  i on ce poslati nadklasi taj smjer
       super(smjer);
       // bit ce greska dok je nadklasa prazna
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        if(entitet.getNaziv() == null){
            throw new EdunovaException("Naziv nije postavljen");
        }
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}
