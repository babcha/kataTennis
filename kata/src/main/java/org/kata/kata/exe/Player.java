package org.kata.kata.exe;

import java.util.Arrays;
import java.util.List;

public class Player {

    public static final List<String> resultatEnCours = Arrays.asList("love", "fifteen", "thirty", "forty");

    private int resultat;
    private String nom;
    
    public Player(){
    	
    }
    public Player(String nom, int resultat) {
        this.nom = nom;
        this.resultat = resultat;
    }
    
    public int getResultat() {
        return resultat;
    }
    
    public String getNom() {
        return nom;
    }

    public void nouveauScore() {
        this.resultat = this.resultat + 1;
    }

    public String getResultatFinal(){
        try{
        	return resultatEnCours.get(resultat);
        }catch(Exception e){
        	return "resultat incorrect";
        }
    }

}