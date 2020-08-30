/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvatzavrsnirad;

/**
 *
 * @author Josip
 */
public class Upute2 {
    /*
    ORM mapiranje 
    Kako mapirati tablice na bazi 
    
    1 Obrisao osoba.
    Takodjer obrisati i u hibernate.cfg.xml
    
    Idemo na osonvu baze podataka jp22
    
    
    ********** 1 Inheritance iliti nasljedjivanje *************
    
    Sve tablice imaju isto svojstvo 
    te pravimo nad clasu 
    Radim novu klasu Etintet u model paketu
    
    ID + getters setter + primary key auto increment.
    
    **********2 Smjer *****************
    
    upute su u klasi Smjer 
    Nakon sto se kreira Smjer, mora se mapirati u hibernate cfg. 
    Pripaziti na create-drop u hiberante cfg. 
    
    ************* 3 Osoba, Polaznik, Predavac **************
    
    Zadatak napraviti maping koji ce biti identican na slici ERA
    
    osoba je abstract jer je necu koristiti, kao i klasa entitet
    stoga na Osoba ne ide @Entity
    Osoba je MappedSuperclass 
    Polaznik  i Predavac nasljedjuju Osoba
    
    nakon toga otici u hiberante config te dodati polaznik i predavac
   
    ************ Grupa ***************
    
    u grupi su upute za many to many  i many to one 
    */
    
}
