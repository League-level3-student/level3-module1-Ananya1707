package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> colors = new ArrayList<String>();

        // 2. Add five Strings to your list
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        
        // 3. Print all the Strings using a standard for-loop
        System.out.println("Print all the Strings using a standard for-loop");
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        
        // 4. Print all the Strings using a for-each loop
        System.out.println("Print all the Strings using a for-each loop");
        for(String s : colors){
            System.out.println(s);
        }
        
        // 5. Print only the even numbered elements in the list.
        System.out.println("Print only the even numbered elements in the list");
        for(int i = 0; i < colors.size(); i++){
        	if(i%2==0) {
                System.out.println(colors.get(i));
        	}
        }

        // 6. Print all the Strings in reverse order.
        System.out.println("Print all the Strings in reverse order");
       
        

        // 7. Print only the Strings that have the letter 'e' in them.
        
    }
}
