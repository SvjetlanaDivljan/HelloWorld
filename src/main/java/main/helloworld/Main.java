package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Hello World!");
     System.out.println("Svjetlana Divljan");
     
     int age =5;
     
//     if(age > 18) {
//         System.out.println("Osoba je punoletna");
//     } else { 
//         System.out.println("Osoba je maloletna");
//     
//     }
//     System.out.println("Unesite broj godina:");
//     Scanner input = new Scanner(System.in);
//     int userAge = input.nextInt();
//     
//      System.out.println("Korisnik je uneo: " + userAge); 
//      
//     System.out.print("Unesite broj godina:");
//     Scanner input2 = new Scanner(System.in);
//     int personAge = input2.nextInt(); 
//     
//     if (personAge <=0 && personAge >150) {
//        System.out.println("Invalid"); 
//     } else if (personAge <=5){
//        System.out.println("Baby");
//     } else if (personAge <=11) {
//        System.out.println("Kid");  
//     } else if (personAge <=17) {
//        System.out.println("Teen"); 
//     } else if (personAge >=18 ) {
//        System.out.println("Adult");  
//        }

//        System.out.println ("For loop");
//      
//        for (int i = 50; i < 60; i++) {
//            System.out.println(i); 
//        }
//        
//        for (int i = 30; i >= 20; i--) 
  
      
        System.out.println ("Koordinate 1:");        
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) { 
                System.out.print("(" + i +"," + j + ") ");  
            }
            System.out.println();
        }   
    }

}  