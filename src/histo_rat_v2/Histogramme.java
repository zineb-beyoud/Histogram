/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histo_rat_v2;

import esix.util.event.AbstractModeleEcoutable;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Histogramme extends AbstractModeleEcoutable {
    
    private int etatCouleur;
    public ArrayList<Value> valeur;
    public static final  int VERT=0;
    public static final  int ORANGE=1;
    public static final  int ROUGE=2;
    public static final  int BLEU=3;
    public static final String[] COULEURS ={"VERT","ROUGE","ORANGE","BLEU"};
    
     public Histogramme()
    {
        valeur=new ArrayList<>();
        etatCouleur=ROUGE;
    }
     
    public int getEtatCouleur() {
        return etatCouleur;
    }
   
    public void suivant(){
        switch(etatCouleur){
            case VERT:
            etatCouleur=ORANGE;
            break;
            case ORANGE :
            etatCouleur=ROUGE;
            break;
             case ROUGE :
            etatCouleur=VERT;
            break; 
            case BLEU :
            etatCouleur=VERT;
            break; 
        }
        firechangement();
    }

    public void addValue(Value v)
    {
        valeur.add(v);
        firechangement();
    }
    
    
    
}
