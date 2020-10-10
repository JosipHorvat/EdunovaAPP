/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.start;

/**
 *
 * @author Josip
 */
public class DatumUPUTE {
    /*
    KALENDAR 
    lgooddatePicker
    https://mvnrepository.com/artifact/com.github.lgooddatepicker/LGoodDatePicker
    
    1. Desni klik na palette manager 
    2. Add from JAR
    3. C - users josip - m2 - repository - com - github - Lgood...
    4. dodaj ga u swing controls 
    
       DatePickerSettings datePickerSettings = new DatePickerSettings(new Locale("hr", "HR"));
        datePickerSettings.setFormatForDatesCommonEra("dd.MM.yyyy");
        dpDatumProizvodnje.setSettings(datePickerSettings);
    
    dpDatumProizvodnje.setDate(entitet.getDatumProizvodnje().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate());
    
     try{
        entitet.setDatumProizvodnje(Date.from(dpDatumProizvodnje.getDate().atStartOfDay()
        .atZone(ZoneId.systemDefault())
        .toInstant()));
        }catch(Exception e){
            entitet.setDatumProizvodnje(null);
        }
    
    ocistiPolja() ==  dpDatumProizvodnje.clear();
    
    */
}
