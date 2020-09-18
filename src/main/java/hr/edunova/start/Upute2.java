/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.start;

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
   
    ************4. Grupa ***************
    
    u grupi su upute za many to many  i many to one 
    
    
    ************5. Nadredjen/ onaj koji ide sam na sebe u grupi smjer
    
    Za kreitanje novog ERA dijagrama :
    ctrl + razmaknica za oznacit, pa desni klik new Era dijagram
    
    https://www.google.com/search?sxsrf=ALeKk01GCZ9N9w8siZRsgSrHbnGG9W9Y0A%3A1598464625657&ei=caJGX6bYJ6jIrgT6iqHIDw&q=hibernate+mapping&oq=hibernate+mapping&gs_lcp=CgZwc3ktYWIQAzIJCCMQsAMQJxATMgkIABCwAxAHEB4yCQgAELADEAcQHjIJCAAQsAMQBxAeMgkIABCwAxAHEB4yCQgAELADEAcQHjIHCAAQsAMQQzIFCAAQsAMyBQgAELADMgUIABCwA1AAWABgyvABaAFwAHgAgAEAiAEAkgEAmAEAqgEHZ3dzLXdpesABAQ&sclient=psy-ab&ved=0ahUKEwjm1MrhuLnrAhUopIsKHXpFCPkQ4dUDCA0&uact=5

    OVAJ LINK SADRZI UPUTE ZA HIBERNATE 
    */
    
    
}
