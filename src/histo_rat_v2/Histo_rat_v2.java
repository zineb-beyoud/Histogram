/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histo_rat_v2;

import esix.util.event.EcouteurModele;
import javax.swing.JPanel;

/**
 *
 * @author acer
 */
public class Histo_rat_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Histogramme h= new Histogramme();
        Value v1 = new Value("Protides ",5000);
        Value v2 = new Value("Lipides ",3070);
        Value v3 = new Value("Glucides ",789);
        Value v4 = new Value("Sel ",300);
        
        h.addValue(v2);
        h.addValue(v3);
        h.addValue(v4);
        
        VueHistogramme vue = new VueHistogramme(h);
        h.ajoutEcouteurModel(new EcouteurModele()
        {
            @Override
            public void modelMisAJour(Object source)
            {
                System.out.println(h.getEtatCouleur());
                
            }
        });
    }
    
}
