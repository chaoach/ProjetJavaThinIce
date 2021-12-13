package java_package;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        
        DeplacerPerso play = new DeplacerPerso();
        Print2DArray print = new Print2DArray();
        MenuAcceuil menu = new MenuAcceuil();
        
        //menu.writeFile();
        
        menu.MenuAcceuil(); //affiche le menu
        
        while(print.getGameFinished() == false){ //boucle while du jeu
            play.premierPlacement();
            play.whileNiveau();
        }
        
        System.out.println("Vous avez fini le jeu !");

    }

}
