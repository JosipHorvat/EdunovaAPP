/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvatzavrsnirad;

import hr.edunova.horvat.controller.ObradaPolaznik;
import hr.edunova.horvat.controller.ObradaPredavac;
import hr.edunova.horvat.controller.ObradaSmjer;
import hr.edunova.horvat.model.Polaznik;
import hr.edunova.horvat.model.Predavac;
import hr.edunova.horvat.model.Smjer;
import hr.edunova.horvat.utility.EdunovaException;
import hr.edunova.horvat.utility.HibernateUtil;
import hr.edunova.horvat.utility.PocetniInsert;
import hr.edunova.horvat.view.Autorizacija;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Start {
    public static void main(String[] args) {
//      PocetniInsert.izvedi();
//        HibernateUtil.getSessionFactory().openSession();

   new Autorizacija().setVisible(true);


//========= Unos i kontrola polaznik ====================
//   Polaznik p = new Polaznik();
//   ObradaPolaznik obradaPolaznik = new ObradaPolaznik();
//   obradaPolaznik.setEntitet(p);
//   
//        try {
//            obradaPolaznik.create();
//             } catch (EdunovaException ex) {
//            System.out.println(ex.getPoruka());    
//             }
//        
//        Predavac predavac = new Predavac();
//        ObradaPredavac op = new ObradaPredavac();
//        op.setEntitet(predavac);
//        
//        try {
//            op.create();
//            } catch (EdunovaException ex) {
//            System.out.println(ex.getPoruka());
//        }
            
//    Polaznik polaznik = new Polaznik();
//    ObradaPolaznik obradaPolaznik = new ObradaPolaznik();
//    
//        for (Polaznik polaznik1 : obradaPolaznik.getPodaci()) {
//            System.out.println(polaznik.getIme()+ " " + polaznik.getPrezime());
//        }
    
//     Smjer s = new Smjer();
//     ObradaSmjer obradaSmjer = new ObradaSmjer(s);
//     
//   List<Smjer> podaci =  obradaSmjer.getPodaci();
//   
//        for (Smjer smjer : podaci) {
//            System.out.println(smjer.getId() + " " + smjer.getNaziv() );
//            
//        }
//
     
//     s.setNaziv("sssssssssssssssssssssssssssssssssssssssssssssssssssssss");
//     
//        try {
//            obradaSmjer.create();
//        } catch (EdunovaException ex) {
//            System.out.println(ex.getPoruka());
//        }
//        
        
       
    }
}
