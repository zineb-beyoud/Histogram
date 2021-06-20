/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histo_rat_v2;

import esix.util.event.EcouteurModele;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author acer
 */
public class VueHistogramme extends JPanel implements EcouteurModele {
     private Histogramme h;
     private Value vl;
     private String str;
     public static final int DIM=100;
     private static final  Color [] COLORS  ={Color.GRAY,Color.MAGENTA,Color.RED,Color.YELLOW,Color.BLUE};
     private  String [] Nom={"Protides","Sel ","Glucides","Lipides"};
     private  int [] Pour={34,5,12,52};

     public VueHistogramme(Histogramme h1){
        this.h=h1;
       // h.ajoutEcouteurModel(this);
        this.setPreferredSize(new Dimension(4*DIM,DIM));
     }
    
    @Override
    public void modelMisAJour(Object source) {
        h.getEtatCouleur();
        this.repaint();
    }
    
     /**
     *
     * @param g
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D  g2D=(Graphics2D) g;
       // for(int i=0;i<4;i++){
        g.setColor(Color.BLACK);
       // g.drawRect(DIM*i,0,DIM,DIM);//pour le contour(x,y,hauteyur,largeur)
        g.drawRect(0,DIM*34/100,DIM,DIM);
        g.drawRect(DIM,DIM*52/100,DIM,DIM);
        g.drawRect(DIM*2,DIM*12/100,DIM,DIM);
        g.drawRect(DIM*3,DIM*5/100,DIM,DIM);
      //}
                
       //for(int i=0;i<4;i++){
           
         g.setColor(Color.BLUE);
           g.fillRect(0,DIM*34/100,DIM,DIM);
           g.setColor(Color.RED);
           g.fillRect(DIM,DIM*52/100,DIM,DIM*4);
           g.setColor(Color.GREEN);
           g.fillRect(DIM*2,DIM*12/100,DIM,DIM);
           g.setColor(Color.CYAN);
           g.fillRect(DIM*3,DIM*5/100,DIM,DIM);
          // }
     for(int i =0;i<4;i++){
          g.setColor(Color.BLACK);
         g.drawString(" "+Nom[i]+" "+Pour[i]+"% ",i*DIM ,DIM/2);
     }
           
    
}
}
