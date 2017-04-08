package org.kata.kata;

import org.kata.kata.exe.Game;
import org.kata.kata.exe.Player;

/**
 * Hello world!
 *
 */
public class App 
{
	static Player p1 = new Player("ghassen",6);
	static Player p2 = new Player("Bassem",4);
	
	static Game game= new Game(p1,p2);
	
    public static void main( String[] args )
    {
    	
        System.out.println( "resultat=\n" +game.getResultat());
    }
}
