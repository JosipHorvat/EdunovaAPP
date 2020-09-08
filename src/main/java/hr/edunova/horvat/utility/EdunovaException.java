/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.utility;

/**
 *
 * @author Josip
 */
public class EdunovaException extends Exception{
    
    private String poruka;

    public EdunovaException(String poruka) {
        // ako ces raditi sa exceptio morat ces primiti String poruku jer je u konstruktoru;
        this.poruka = poruka;
        // sam exception ima poruku ali radimo ovo radi primjera
        
    }
    
    
    
    

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
    
}
