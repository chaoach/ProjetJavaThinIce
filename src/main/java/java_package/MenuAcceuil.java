
package java_package;



import java.util.Scanner;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;*/
/**
 *
 * @author inesmassoud
 */
public class MenuAcceuil { 
    
    public String MenuAcceuil() {
  
        //Menu d'acceuil
        System.out.println("\033[1;34m Bienvenue à Club Penguin Thin Ice \n");
        
        System.out.println("\033[32m But du jeu : Emmener le penguin jusqu'à l'arrivée ! ( 'f' ) \n ");
        
        //Règles du jeu
        System.out.println("                        \033[31m Règles du jeu : \n");
        
        System.out.println("- Lorsque le penguin se déplace sur la glace fine ( 'o' ), celle-ci fond pour laisser place à de l'eau ( 'x' ). Il ne peut pas repasser dessus. ");
        System.out.println("- Le plateau est entouré de murs ( 'm' ) et de différents obstacles ");
        System.out.println("- Sur certain niveau il existe de la banquise épaisse ( 'G' ). Le penguin peut passer dessus 2 fois avant qu'elle ne se transforme en eau ");
        System.out.println("- Des potions ( 'P' ) et des tunnels ( 'U' )peuvent être mis à disposition pour faciliter l'avancée du penguin. N'hésitez pas à les utiliser ;) ");
        System.out.println("- ATTENTION ! Des ennemis peuvent se trouver sur votre chemin ! Evitez les autant que vous pouvez !  \n");
 
        //Touches utilisées pour jouer
        System.out.println("Pour jouer, servez-vous des touches alphabétique (Z Q S D) ou de votre pad numérique (2 4 6 8) ");
        
        
        //Demande du nom du joeur 
        Scanner in = new Scanner(System.in);
        System.out.println("Quel est votre pseudo ? ");
        String name = in.next();
        System.out.println("C'est à votre tour de jouer " + name + ". Amusez-vous bien :) ");
        
        //Partie
        System.out.println("Que voulez vous faire ? Nouvelle partie ou continuer une partie sauvegardée ? ( N / S) ");
        String partie =null;
        int stop = 0 ;
        while (stop == 0){
           partie = in.next();
           if (partie.equals("N") || partie.equals("S") ) { 
               
               stop = 1;
           } 
           else {
               System.out.println("Mauvais choix. Saisir N (nouvelle partie) ou S (partie sauvegardée)");
           }
        }
        System.out.println("C'est à votre tour de jouer " + name + ". Amusez-vous bien :) ");
        
        return name;
    
    }
    
    //nom,score,niveau
    
    /*
    
    public String[] readFile(int indicateur, int valeur, String name){

        String line = "";
        String retour = null;
        String[] values = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            
            while((line = br.readLine())!= null){
                values = line.split(",");
                
            }
        
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e ){
            e.printStackTrace();
        }
        return values;
    }
    
    
        String path = System.getProperty("user.dir");
        String filePath = path + "\\data.txt";

    public void writeFile(String name, int score, int level) throws IOException {
        

        
        File file = new File(filePath);
        FileWriter fw = new FileWriter(file, true); //append to file
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println("" +name +"," +score +"," +level);
        
        pw.close();
       
        
   } */

    
}