/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histo_rat_v2;

import esix.util.event.EcouteurModele;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
/**
 *
 * @author acer
 */
class Value extends JFrame {
    public String nom;
    public double quantite;
    private Histogramme histo;
    private static int pos =0;
    
    public Value(String nom,double quantite){
        super("histogramme");
        this.nom=nom;
        this.quantite=quantite;
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(new VueHistogramme(histo),BorderLayout.NORTH); 
        JLabel j1 = new JLabel("");
        cp.add(j1,BorderLayout.CENTER);
        JLabel j2 = new JLabel("");
        cp.add(j2,BorderLayout.SOUTH);
        
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    
    
    
    
    
    
    
    
}
