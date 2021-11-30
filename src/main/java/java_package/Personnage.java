package java_package;

public class Personnage {
	
    private int xPerso;
    private int yPerso;
    private int oldxPerso;
    private int oldyPerso;
	
	//Constructeur	
    public Personnage() {
    	xPerso = 2; // //position initiale du personnage pour le début du niveau
	yPerso = 1;
    }
	
	//Getter
    public int getXPerso() {
    	return this.xPerso;
    }
	
    public int getYPerso() {
    	return this.yPerso;
    }
    
    public int getOldxPerso() {
    	return this.oldxPerso;
    }
    public int getOldyPerso() {
    	return this.oldyPerso;
    }
	
    	//Setter
    public void setXPerso(int newX) {    
    	this.xPerso = newX;
    }
	
    public void setYPerso(int newY) {
    	this.xPerso = newY;
    }
	
    public void deplacerPersonnage(int direction) {
        
        this.oldxPerso = xPerso;
        this.oldyPerso = yPerso;
                
    	switch(direction) {
    		//Haut
    	case 1:
    		this.xPerso --;
       		break;
		//Bas	
	case 2:
		this.xPerso ++;
		break;
		//Droite
	case 3:
		this.yPerso ++;
		break;
            //Gauche
	case 4:
		this.yPerso --;
		break;
	default:
            System.out.println("Ceci n'est pas une direction valide.");		
	}
    }   
}
