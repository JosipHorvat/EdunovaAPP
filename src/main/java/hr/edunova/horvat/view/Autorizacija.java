/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.view;

import hr.edunova.horvat.controller.ObradaOperater;
import hr.edunova.horvat.model.Operater;
import java.awt.event.KeyEvent;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author Josip
 */
public class Autorizacija extends javax.swing.JFrame {

    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
        
        txtEmail.requestFocus();
        txtEmail.setText("josiph988@gmail.com");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPrijava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Email");

        pswLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswLozinkaKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel2.setText("Lozinka");

        btnPrijava.setText("Prijava");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });
        btnPrijava.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnPrijavaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)
                    .addComponent(pswLozinka)
                    .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrijava)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtEmail.getText().trim().isEmpty()){
         pswLozinka.requestFocus();
            // ako je stisnut enter prebacivam se na lozinku
        }
        
    }//GEN-LAST:event_txtEmailKeyReleased

    private void pswLozinkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswLozinkaKeyReleased
      if (evt.getKeyCode() == KeyEvent.VK_ENTER && pswLozinka.getPassword().length>0){  
        prijaviSe();
        // ako je pustena tipka prebacivam se na ,etodu prijavi se 
      }
    }//GEN-LAST:event_pswLozinkaKeyReleased

    private void btnPrijavaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPrijavaKeyReleased
      prijaviSe();
      // takodjer ako je pustena tipka na buttonu idem u metodu prijai se 
    }//GEN-LAST:event_btnPrijavaKeyReleased

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        prijaviSe();
    }//GEN-LAST:event_btnPrijavaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrijava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    // metoda koja provjerava sve prije prijave 
    private void prijaviSe() {
        // ako je mail prazan vrati mi fokus na mail i izbaci poruku
        if(txtEmail.getText().trim().isEmpty()){
            txtEmail.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Email obavezno");
            return;
        }
       try{ 
       InternetAddress address = new InternetAddress(txtEmail.getText());
       address.validate();
    }catch(AddressException e){
            txtEmail.requestFocus();
             JOptionPane.showMessageDialog(rootPane, "Lozinka obavezno");
            return;
            }
        if(pswLozinka.getPassword().length==0){
            pswLozinka.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Lozinka obavezno");
            return;
        }
        //siguran si da su vrijednosti unesene i možeš na kontroler
   
        ObradaOperater oo = new ObradaOperater();
        Operater operater = oo.autoriziraj(txtEmail.getText(), pswLozinka.getPassword());
        if(operater==null){
           JOptionPane.showMessageDialog(rootPane, "Ne ispravna kombinacija email i lozinka");
            return; 
        }
        Aplikacija.operater= operater;
        
         new Izbornik().setVisible(true);
         dispose();
    }
    
}
