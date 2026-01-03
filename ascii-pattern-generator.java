//William Hercules 
//COMP110-Fall2025
//Project 2

import java.util.Scanner;
import java.util.Random;

   public class Project2{
      public static void main(String[] args){
      
          //Storage
          Scanner input = new Scanner(System.in);
          Random rand = new Random();
          
          int option = -1;
            while (true) {  
          
          //Selection Screen 
          System.out.println("Select an option:");
          System.out.println("1) Print a rectangle");
          System.out.println("2) Print a downwards right triangle");
          System.out.println("3) Print an upwards right triangle");
          System.out.println("4) Print a random rectangle");
          System.out.println("5) Exit");
          System.out.print("Enter a number:");
          
          if (input.hasNextInt()) {
            option = input.nextInt();
            } else {
               option = 0;
            }
            input.nextLine();    
           //Calculations //Output
           switch (option) {
           case 1: 
           for (int r = 0; r < 5; r++){ // rectangle 
           for (int c = 0; c < 7; c++){
           System.out.print("* ");
           }
           System.out.println();
           }
           break;
           
           case 2:
           
           for (int row = 1; row <= 6; row++) { // downwards right triangle 
           for (int col = 1; col <= row; col++) {
           System.out.print("* ");
           }
           System.out.println();
           }
           
          break;
                     
           case 3:
           
           for (int row = 6; row >= 1; row--) { // upwards right triangle 
            for (int col = 1; col <= row; col++) {
                  System.out.print("* ");
                  }
                  System.out.println();
                  }
                  break;
                  
            case 4: // random rectangle 
            
             int width = rand.nextInt(9) +2;
             int height = rand.nextInt(6) + 1;
             for (int r=0; r < height; r++) {
             for (int c = 0; c < width; c++) {
             System.out.print("* ");
             } 
             System.out.println();
             }
             break;
             
             case 5: System.out.println("Goodbye."); // exit
             input.close();
             return;
             
             
             default: 
             System.out.println("Invalid option, try again.");
             
             }
             
             //extra credit 
             System.out.println();
             
             
             //okisthehardest
             
       
             
           
            
           
                     
           
           
           
            
            
            
         
            
          
}
}
}