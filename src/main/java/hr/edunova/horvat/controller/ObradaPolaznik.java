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
    
    public List<Polaznik> getPodaci(String uvjet){
        return  session.createQuery("from Polaznik p "
              + " where concat(p.ime, ' ', p.prezime, ' ', p.oib) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaBrojUgovora();
        kontrolaOibBazaKreiraj();
        // sada sa super uzmem sto mi treba iz parent klase osoba
        // prvo se sve kontrolira u nad klasi 
        
        // sada koristim sto imam u polaznik:
       
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
         super.kontrolaCreate();
        kontrolaBrojUgovora();
        kontrolaOibBazaPromijeni();
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
    
     private void kontrolaOibBazaKreiraj() throws EdunovaException{
       List<Polaznik> lista = session.createQuery(""
               + " from Polaznik p "
               + " where p.oib=:oib "
               )
               .setParameter("oib", entitet.getOib())
               .list();
       if(lista.size()>0){
           throw  new EdunovaException("Oib je dodjeljen " + lista.get(0).getImeIPrezime() + ", odaberite drugi OIB");
       }
     }
     
      private void kontrolaOibBazaPromijeni() throws EdunovaException{
          
            List<Polaznik> lista = session.createQuery(""
               + " from Polaznik p "
               + " where p.oib=:oib and p.id!=:id"
               )
               .setParameter("oib", entitet.getOib())
               .setParameter("id", entitet.getId())
               .list();
       if(lista.size()>0){
           throw  new EdunovaException("Oib je dodjeljen " + lista.get(0).getImeIPrezime() + ", odaberite drugi OIB");
       }
      }
}
