/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_package;

/**
 *
 * @author PC
 */
public class Levels {
    
        public char[][] getMap(int n){ //switch pour renvoyer les diffrents niveaux
        switch(n){
            case 1:
                return map1;
            case 2:
                return map2;
            case 3:
                return map3;
            case 4:
                return map4;
            default:
                break;
        }
        return null;
    }
    
    private static char [][]map1 = { 
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'm', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'm', 'o', 'd', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'm', 'o', 'o', 'o', 'f', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'm', 'm', 'o', 'm', 'o', 'o', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},         
        };

    private static char [][]map2 = {
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'm', 'm', 'm', 'o', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'm', 'd', 'o', 'G', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'm', 'o', 'o', 'o', 'G', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'm', 'o', 'm', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'm', 'v'},
         { 'v', 'm', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'm', 'v'},
         { 'v', 'v', 'm', 'G', 'G', 'G', 'o', 'o', 'm', 'v', 'm', 'o', 'o', 'o', 'G', 'o', 'o', 'm', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'G', 'o', 'o', 'm', 'm', 'm', 'o', 'm', 'm', 'o', 'm', 'o', 'm', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'G', 'o', 'o', 'G', 'o', 'o', 'o', 'm', 'o', 'o', 'm', 'o', 'm', 'v'},
         { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'm', 'f', 'm', 'v'},
         { 'v', 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
         { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},         
    };
    private static char [][]map3 = {
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'm', 'm', 'm', 'm', 'm', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'm', 'G', 'o', 'o', 'm', 'v'},
        { 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v', 'm', 'o', 'm', 'f', 'm', 'v'},
        { 'v', 'm', 'd', 'm', 'o', 'P', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'm', 'o', 'm', 'm', 'm', 'v'},
        { 'v', 'm', 'o', 'm', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v', 'v', 'm', 'o', 'm', 'v', 'm', 'v'},
        { 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'm', 'm', 'm', 'm', 'o', 'm', 'v', 'm', 'v'},
        { 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'm', 'o', 'o', 'o', 'G', 'm', 'v', 'm', 'v'},
        { 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'm', 'm', 'o', 'm', 'o', 'G', 'm', 'm', 'm', 'v'},
        { 'v', 'm', 'o', 'o', 'o', 'T', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'o', 'G', 'm', 'm', 'm', 'v'},
        { 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'G', 'G', 'm', 'v', 'v', 'v'},
        { 'v', 'm', 'o', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v'},
        { 'v', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},         
    };
    
        private static char [][]map4 = {
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'm', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'm', 'f', 'o', 'm', 'm', 'm', 'm', 'm', 'm', 'o', 'm', 'o', 'm', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'm', 'm', 'o', 'u', 'o', 'o', 'o', 'm', 'o', 'o', 'm', 'o', 'm', 'm', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'o', 'o', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'd', 'o', 'o', 'o', 'o', 'm', 'o', 'm', 'm', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'o', 'm', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'm', 'o', 'm', 'o', 'm', 'o', 'o', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'T', 'o', 'o', 'm', 'o', 'o', 'o', 'o', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'o', 'o', 'o', 'o', 'o', 'U', 'm', 'm', 'o', 'o', 'o', 'd', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'm', 'v', 'v', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},
        { 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v', 'v'},         
    };

}
