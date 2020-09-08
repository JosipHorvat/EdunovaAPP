/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvatzavrsnirad;

import hr.edunova.horvat.controller.ObradaSmjer;
import hr.edunova.horvat.model.Smjer;
import hr.edunova.horvat.utility.EdunovaException;
import hr.edunova.horvat.utility.HibernateUtil;
import hr.edunova.horvat.utility.PocetniInsert;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Start {
    public static void main(String[] args) {
       //PocetniInsert.izvedi();
//        HibernateUtil.getSessionFactory().openSession();
     Smjer s = new Smjer();
     ObradaSmjer obradaSmjer = new ObradaSmjer(s);
     
        try {
            obradaSmjer.create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
    }
}
