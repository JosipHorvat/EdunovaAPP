/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.view;

import hr.edunova.horvat.model.Predavac;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Josip
 */
public class PredavacCellRenderer extends JLabel implements ListCellRenderer<Predavac>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Predavac> list,
            Predavac value, int index, boolean isSelected, boolean cellHasFocus) {
        
        setText(value.getIme() + " "+ value.getPrezime());
        // predavac je nazvan value 
        
        if(isSelected){
            setBackground(Color.WHITE);
            setForeground(Color.BLUE);
        }else{
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        
        
        return this;
    }
    
    
    
}
