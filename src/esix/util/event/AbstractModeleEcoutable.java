/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esix.util.event;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author acer
 */
public abstract class AbstractModeleEcoutable implements ModelEcoutable {
    
    private ArrayList<EcouteurModele> ecouteurs;
    public  AbstractModeleEcoutable (){
        ecouteurs=new ArrayList<>();//elle appelle un super de la classe object s'il on ajoute pas une ligne dont super est mntionné
    }
    @Override
    public void ajoutEcouteurModel(EcouteurModele e){
        ecouteurs.add(e);
        e.modelMisAJour(this);}
    
    @Override
     public void removeEcouteurModel(EcouteurModele e)
    {
    ecouteurs.remove(e);
    e.modelMisAJour(this);
    }
     
    protected void firechangement(){
        
        for(EcouteurModele e: ecouteurs)
        {
        e.modelMisAJour(this);
        }
        
    }
    
    
    
}
