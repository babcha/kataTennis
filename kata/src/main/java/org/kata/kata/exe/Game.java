package org.kata.kata.exe;

public class Game {
	 
    private Player player1;
    private Player player2;
 
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public Game() {
      
    }
    
    public String getResultat() {
    	
        if (player1.getResultat() >= 3 && player2.getResultat() >= 3) {
            if (Math.abs(player2.getResultat() - player1.getResultat()) >= 2) {
                return getJoueurGagnat().getNom() + " won";
            } else if (player1.getResultat() == player2.getResultat()) {
                return "deuce";
            } else {
                return "advantage " + getJoueurGagnat().getNom();
            }
        } else {
            return player1.getResultatFinal() +" pour le premier joueur "+ " ET " + player2.getResultatFinal()+" pour le deuxiéme joueur ";
        }
    }
 
    public Player getJoueurGagnat() {
        return (player1.getResultat() > player2.getResultat()) ? player1 : player2;
    }
 
  
}
