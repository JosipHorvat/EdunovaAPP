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
public class CustomCellRendererUPUTE {
    
    /*
    LINK SA UPUTAMA: 
    https://www.codejava.net/java-se/swing/jlist-custom-renderer-example#:~:text=%20JList%20custom%20renderer%20example%20%201%20Introduction.,and%20display%20the%20countries%20in%20a...%20More%20

    1. Nova klasa predavacCellRenderer
    2. Ovo je zamjena za toString override u zeljenoj metodi
    
  public class PredavacCellRenderer extends JLabel implements ListCellRenderer<Predavac>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Predavac> list,
            Predavac value, int index, boolean isSelected, boolean cellHasFocus) {
        
        setText(value.getIme() + " "+ value.getPrezime());
        // predavac je nazvan value 
        return this;
    }
    
    3. NAKON TOGA U PREDAVACIMA NAKON initComponents() kazem:
        lstPodaci.setCellRenderer(new PredavacCellRenderer());
    
    4. Problem nastaje jer gubis cursor na listi i moras da postavis sam sto je odabrano a sto ne u listi 
    onda ides nakon setText(value...): 
    if(isSelected){
            setBackground(Color.WHITE);
            setForeground(Color.BLUE);
        }else{
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }

    */
}
