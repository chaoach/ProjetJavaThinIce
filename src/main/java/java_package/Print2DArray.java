package java_package;

//import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Print2DArray { //Vue
		
    private int nbLig = 15; // sensé etre les nbr des collonnes et lignes du niveau
    private int nbCol = 19;
    
    //static int score = 0;
    static int  level = 1;
    
    Levels lev = new Levels();
    
    private boolean end = false; // variable niveau est il fini ?

    private boolean isPosValide;

    private static char [][]map; //matrice de la map
               


    ArrayList<Integer> startPos = new ArrayList<Integer>();
        
    ArrayList<Integer> TPPos = new ArrayList<Integer>();

    /**
     *
     */
    public void setMap(){
        map = lev.getMap(level); //set la map au niveau correspondant
    }
        
    static boolean gameFinished = false;
        
    /**
     *
     * @return
     */
    public boolean getGameFinished(){ //getter fin du jeu
        return gameFinished;
    }
        
    /**
     *
     */
    public void setGameFinished(){ //setter fin du jeu
        gameFinished = true;
    }
        
    /**
     *
     * @return
     */
    public boolean isAnyMoreLevel(){ //test si il reste des niveaux
        if(level<5){
            return true;
        } else {
            return false;
        }
    }
        
    int xStart = 0;
    int yStart = 0;
       
    /**
     *
     */
    public void startLevel(){ //methode qui trouve le debut du niveau
        for (int i = 0; i < map.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < map[i].length; j++) { //this equals to the column in each row.
                if (map[i][j] == 'd'){
                    xStart = i;
                    yStart = j;
                }
            }
        }
    }
        
    /**
     *
     * @return
     */
    public int getxStart(){
        return xStart;
    }
        
    /**
     *
     * @return
     */
    public int getyStart(){
        return yStart;
    }
        
    int xTP = 0;
    int yTP = 0;
        
    /**
     *
     */
    public void tunnelTP(){ //methode qui trouve la sortie du tunnel
        for (int i = 0; i < map.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < map[i].length; j++) { //this equals to the column in each row.
                if (map[i][j] == 'u'){
                    xTP = i;
                    yTP = j;
                }
            }
        }
    }
        
    /**
     *
     * @return
     */
    public int getxTP(){
            return xTP;
        }
        
    /**
     *
     * @return
     */
    public int getyTP(){
            return yTP;
        }        
        
    /**
     *
     * @param score
     * @param potion
     */
    public static void afficherMatrice(int score, int potion) {// affiche la matrics
            
            System.out.println("Niveau : " +level); //affiche le niveau
            System.out.print("Score = " +score); //affiche le score
            
            if (potion > 0 ){
                System.out.println(", Potion = " +potion); //affiche le nombre de pas en étant léger restant
            } else {
                System.out.println();
            }
            
            System.out.println();
			   
            for (int i = 0; i < map.length; i++) { //this equals to the row in our matrix.
                for (int j = 0; j < map[i].length; j++) { //this equals to the column in each row.
                    System.out.print( map[i][j] + " "); //affiche le caractere de la case
		}
		System.out.println(); //change line on console as row comes to end in the matrix.
            }
            
            System.out.println();
	}

    /**
     *
     * @param l
     * @param c
     * @return
     */
    public static char getCase(int l, int c) { //getter case aux coordonnées demandées
            return map[l][c];
	}
        
    /**
     *
     * @param l
     * @param c
     * @param t
     */
    public void placer(int l, int c, char t) { //place le caractere aux coordonnées demandées
            map[l][c] = t;
	}
        
    /**
     *
     * @param l
     * @param c
     * @return
     */
    public boolean isPosValide(int l, int c){ // test de la position
            if(l < 0 || c < 0 || l > map.length || c > map[0].length) {
                    System.out.println("Outside borders"); //si la coordonnée du bloc a placer dépasse les bordures du niveau
                    isPosValide = false;}
            else{
                if(map[l][c] == 'm' || map[l][c] == 'v' || map[l][c] == 'x') { //Si position == glace ou Start ou End
                    System.out.println("Le Pinguin ne peut pas se dépacer ici");
                    isPosValide = false;
                } else {
                    if (map[l][c] == 'o' || map[l][c] == 'd' || map[l][c] == 'f' || map[l][c] == 'G' || map[l][c] == 'P' || map[l][c] == 'U'){ // si le joueur veut aller sur un bloc de mur ou sur un bloc d'éxterieur de mur
                                                
                        isPosValide = true; // print le joueur sur le bloc à la coordonnée demandée
                        
                    }
                }		
            }
            return isPosValide;
            
        }
        
    /**
     *
     * @param l
     * @param c
     * @return
     */
    public boolean isGlaceEpaisse(int l, int c){ //test glace epaisse
            if (map[l][c] == 'G'){
                return true;
            } else { return false;}
        }
        
    /**
     *
     * @param l
     * @param c
     * @return
     */
    public boolean isTondeuse(int l, int c){ //test tondeuse
            if (map[l][c] == 'T'){
                return true;
            } else { return false;}
        }
        
    /**
     *
     * @param l
     * @param c
     * @return
     */
    public boolean isPotion(int l, int c){ //test potion
            if (map[l][c] == 'P'){
                return true;
            } else { return false;}
        }
        
    /**
     *
     */
    public void niveauTermine() { // set la valeur endo to true
            end = true;
            level ++;
	}
        
    /**
     *
     */
    public void newNiveau() { // set la valeur endo to true
            end = false;
            setMap();
            startLevel();
	}
	
    /**
     *
     * @return
     */
    public boolean niveauEsTilTermine(){ // retourne la valeur end
            return end;
	}
        
    /**
     *
     */
    public void setNiveauTermine(){ //setter niveau terminé
            end = false;
        }
        

        
        

	
}