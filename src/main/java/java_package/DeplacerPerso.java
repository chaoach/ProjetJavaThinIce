/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DeplacerPerso {
    
        Print2DArray printMap = new Print2DArray(); 
	
	char valueDeplacement; //variable qui stockera le touche pressée
        
        
        
        static int score = 0;
        //static int debutScore = 0;
        
        static int oldX;
        static int oldY;
        
        static int X;
        static int Y;

    
    public void premierPlacement(){

        printMap.newNiveau();
                
        X = printMap.getxStart(); //reccupere les coordonnées du départ du niveau
        Y = printMap.getyStart();
       
                // Premier print pour affiche le niveau + Trouver la position du départ du niveau               
        printMap.placer(X, Y, 'J');
       
	printMap.afficherMatrice(score,potion); //affiche la matrice avec le score
        
    }
    
    public void whileNiveau(){
        
        while(printMap.niveauEsTilTermine() == false) { 
                    
            oldX = X; //on mets les coordonnées dans les anciennes coordonnées
            oldY = Y;
            
            Scanner touche = new Scanner(System.in); 
            valueDeplacement = touche.next().charAt(0); //scanner touche deplacement
            
            if(valueDeplacement != 'e' && valueDeplacement != '4' && valueDeplacement != '6' && valueDeplacement != '8' && valueDeplacement != 'z' && valueDeplacement != 's' && valueDeplacement != 'q' && valueDeplacement != 'd') { //test si la touche est valide pour le deplacement
		System.out.println("Mauvaise Touche");
            }
            else {
                if(valueDeplacement == 'z' || valueDeplacement == '8') { //deplacer vers le haut
                    X --;
                    deplacer();
                }
				
                if(valueDeplacement == 's' || valueDeplacement == '2') { //deplacer vers le bas
                    X ++;
                    deplacer();
                }
				
                if(valueDeplacement == 'd' || valueDeplacement == '6') { //deplacer vers la droite
                    Y ++;
                    deplacer();
                }
				
                if(valueDeplacement == 'q' || valueDeplacement == '4') { //deplacer vers la gauche
                    Y --;
                    deplacer();
                }
                
                if(valueDeplacement == 'e' ) { //recommencer niveau
                    printMap.setMap();
                    premierPlacement(); 
                } else {
                
                printMap.afficherMatrice(score,potion); } //affichage du niveau
                
            }
        }
        System.out.println("Bravo ! Niveau Terminé !");
        
        if(printMap.isAnyMoreLevel() == false){ //test si il reste des niveaux, si non, le jeu est fini
            printMap.setGameFinished();
        }
    }
     
    int glace = 4;
    static int potion = 0;

    
    public void deplacer(){ //methode qui deplace le personnage
        
        glace ++; //attribut de la glace
        
        if(printMap.isGlaceEpaisse(X, Y) == true) { //set attribut glace si le punguin marche sur de la glace epaisse
            glace = 1;
        }
        
        if(printMap.isPosValide(X, Y) == false){ //test si la position du punguin est valide
           
            System.out.println("Mauvaise case");
            X = oldX; // si non, le punguin retourne à sa case initiale
            Y = oldY;
            
        } else {
            score ++; //si oui, le score incrémente de 1
            
            if(printMap.getCase(X, Y)=='f'){ //test si la case est la case de la fin
                printMap.niveauTermine();
            }
           
            if(printMap.getCase(X, Y)=='U'){ //test si le punguin rentre dans un tunnel
                
               printMap.tunnelTP(); //appel de la fonction trouve les coorrdonnées de la sortie du tunnel
        
                X = printMap.getxTP(); //set les coordonnées du punguin sur la case de la sortie du tunnel
                Y = printMap.getyTP();
                
                printMap.placer(oldX, oldY, 'x');     //place de l'eau sur l'ancienne position du punguin
                printMap.placer(X, Y, 'J'); //place le punguin aux coordonnées 

                
            } else if (printMap.isPosValide(X, Y)== true ){ //test de la position pour le deplacement classique 
            
            
            printMap.placer(oldX, oldY, 'x'); //place de l'eau sur la derniere case où se trouvait le puinguin
            
            if(glace == 2) { //si le punguin a marché sur de la glace précédemment
            
                printMap.placer(oldX, oldY, 'o'); //mettre de la glace fine sur la derniere case
            
            }
            if(printMap.isTondeuse(X,Y) == true){ //test si le punguin percute une tondeuse
               
                tondeuse(); 
                
            }
            if(printMap.isPotion(X,Y)){ //test si le punguin prends une potion
                
                potion = 5; //set le nombnre de pas que le punguin peut faire en étant léger
                 
            }
            
            if(potion > 0 && potion < 5){
                printMap.placer(oldX, oldY, 'o'); //le punguin ne casse pas la glace si il marche
                potion --;
            } else { 
                potion --;
            }
            printMap.placer(X,Y,'J'); //placement du punguin
            
            }
            
        }
      
    }
    

    
    
    int tondeuseX;
    int tondeuseY;
    boolean mur;
    
    public void tondeuse(){
            
            mur = false;
            
            tondeuseX = X; 
            tondeuseY = Y;
            
            if (oldX < X){ //si le punguin a percuté la tondeuse depuis le haut
                //aller vers le bas X++
                while (mur == false ){
                    if(printMap.getCase(tondeuseX,tondeuseY) == 'm'){ //if la tondeusee roncontre un mur, arreter la boucle while
                        mur = true;
                    } else {
                    printMap.placer(tondeuseX, tondeuseY, 'x'); //sinon placer de l'eau derriere la tondeuse et faire avancer la tondeuse + 1point
                    tondeuseX ++;
                    score ++; }
                }
                tondeuseX = tondeuseX-2;                // quand la tondeuse rentre dans un mur, elle doit reculer pour s'arreter devant le mur
            }
            if (oldX > X){
                //aller vers le haut X--
                while (mur == false ){
                    if(printMap.getCase(tondeuseX,tondeuseY) == 'm'){
                        mur = true;
                    } else {
                    printMap.placer(tondeuseX, tondeuseY, 'x');
                    tondeuseX --;
                    score ++; }
                }
                tondeuseX = +2;                
            }
            if (oldY < Y){
                //aller vers la droite Y++
                while (mur == false ){
                    if(printMap.getCase(tondeuseX,tondeuseY) == 'm'){
                        mur = true;
                    } else {
                    printMap.placer(tondeuseX, tondeuseY, 'x');
                    tondeuseY ++;
                    score ++; }
                }
                tondeuseY = tondeuseY - 2;
            }
            if (oldY < Y){
                //aller vers la gauche Y--
                while (mur == false ){
                    if(printMap.getCase(tondeuseX,tondeuseY) == 'm'){
                        mur = true;
                    } else {
                    printMap.placer(tondeuseX, tondeuseY, 'x');
                    tondeuseY --;
                    score ++; }
                }
                tondeuseY = +2;                
            }
            
            printMap.placer(tondeuseX,tondeuseY,'T');
            
        }
    

}