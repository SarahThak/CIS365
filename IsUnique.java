/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author Sarah
 */
public class IsUnique {
    

public static void main(String[] args) {  
    
    String[] fruitArray = {"Apple", "Banana", "Banana", "Orange", "Grapes"};
    System.out.println(IsUnique.distinctValues(fruitArray));

       

}

	

    public static boolean distinctValues(String[] fruitArray){
    for (int i = 0; i < fruitArray.length; i++) {
        for (int j = i+1; j < fruitArray.length; j++) {
             if (fruitArray[i].equals(fruitArray[j])) {
                 return false;
             }
        }
    }              
    return true;          
}
    
}
