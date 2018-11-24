/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package migato;





import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;





public class Juego extends javax.swing.JFrame  {
    private int turno;
   
 
    

  
  
  public Juego() {
       this.turno=1;
      initComponents();
        
      
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.cyan);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.cyan);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(java.awt.Color.cyan);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 51, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(java.awt.Color.cyan);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.cyan);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        if(turno==1) {
         jButton3.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton3.setText("O");
          turno=1;
           
                  }   
           
           tablas();
           jButton3.setEnabled(false);  
          
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(turno==1) {
         jButton1.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton1.setText("O");
          turno=1;
           
                  
           
                  }   
           
           tablas();
           jButton1.setEnabled(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(turno==1) {
         jButton2.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton2.setText("O");
          turno=1;
           
                  }  
       
           
           tablas();
           jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(turno==1) {
         jButton4.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton4.setText("O");
          turno=1;
           
                  }
           
              
           tablas();
           
           jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(turno==1) {
         jButton5.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton5.setText("O");
          turno=1;
           
                  
           
                  }   
           
           
           tablas();
           
           jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     if(turno==1) {
         jButton6.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton6.setText("O");
          turno=1;
           
                  
                  }   
           
           tablas();
           jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         if(turno==1) {
         jButton9.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton9.setText("O");
          turno=1;
           
                  } 
           
      
           
           tablas();
           jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(turno==1) {
         jButton7.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton7.setText("O");
          turno=1;
           
                  } 
           
           
           tablas();
           jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if(turno==1) {
         jButton8.setText("X");
       turno=2;
        } else  if(turno==2) {
          jButton8.setText("O");
          turno=1;
           
                  }
          
           
           tablas();
           jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
  public void limpiar(){
jButton1.setText("");
jButton1.setEnabled(true);
jButton2.setText("");      
jButton2.setEnabled(true);
jButton3.setText("");
jButton3.setEnabled(true);
jButton4.setText("");
jButton4.setEnabled(true);
jButton5.setText("");
jButton5.setEnabled(true);
jButton6.setText("");
jButton6.setEnabled(true);
jButton7.setText("");
jButton7.setEnabled(true);
jButton8.setText("");
jButton8.setEnabled(true);
jButton9.setText("");   
jButton9.setEnabled(true); 
  turno=1;
  }
    
    
    public void tablas(){
String uno=jButton1.getText();
String dos=jButton2.getText();      
String tres=jButton3.getText();
String cuatro=jButton4.getText();
String cinco=jButton5.getText();
String seis=jButton6.getText();
String siete=jButton7.getText();
String ocho=jButton8.getText();
String nueve=jButton9.getText();

    
  if(uno==("X")&&dos==("X")&&tres==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X"); 
    JOptionPane.showMessageDialog(this, "Juego Nuevo");      
  limpiar();
 
 
  }
  


   if(cuatro==("X")&&cinco==("X")&&seis==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
   limpiar();

   }
   
    if(siete==("X")&&ocho==("X")&&nueve==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");
     JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
     
    }
   
  
    if(tres==("X")&&cuatro==("X")&&nueve==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");   
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
    
    }
    
 
    if(uno==("X")&&cinco==("X")&&siete==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");
       JOptionPane.showMessageDialog(this, "Juego Nuevo"); 
    limpiar();

    } 
  
    if(dos==("X")&&seis==("X")&&ocho==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");  
     JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
    
    }

    if(tres==("X")&&cinco==("X")&&ocho==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
   limpiar();
    
    }            

 
 
    if(dos==("X")&&cinco==("X")&&nueve==("X")){
    JOptionPane.showMessageDialog(this, "Ganador X");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
     
    }
  
//
   if(uno==("O")&&dos==("O")&&tres==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O"); 
     JOptionPane.showMessageDialog(this, "Juego Nuevo");       
   limpiar();
   
   }
 
   if(cuatro==("O")&&cinco==("O")&&seis==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
   limpiar();
   
   }
       if(siete==("O")&&ocho==("O")&&nueve==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");
     JOptionPane.showMessageDialog(this, "Juego Nuevo");
       limpiar();
       
       }
   
   
    if(tres==("O")&&cuatro==("O")&&nueve==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");   
     JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
    
    }
    
 
    if(uno==("O")&&cinco==("O")&&siete==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");
     JOptionPane.showMessageDialog(this, "Juego Nuevo");   
    limpiar();
    
    } 
  
    if(dos==("O")&&seis==("O")&&ocho==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");  
     JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
    
    }

 
    if(tres==("O")&&cinco==("O")&&ocho==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
   limpiar();
   
    }            

 
    if(dos==("O")&&cinco==("O")&&nueve==("O")){
    JOptionPane.showMessageDialog(this, "Ganador O");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
    
    }
 while(uno!=""&&dos!=""&&tres!=""&&cuatro!=""&&cinco!=""&&seis!=""&&siete!=""&&ocho!=""&&nueve!=""){
    JOptionPane.showMessageDialog(null, "Empate");
    JOptionPane.showMessageDialog(this, "Juego Nuevo");
    limpiar();
 break;
     
     
 }   
    
    
    
     
     
 }
        
 }

    
    

    
   
   
    

       

  
    

