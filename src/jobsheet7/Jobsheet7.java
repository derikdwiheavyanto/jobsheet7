/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Jobsheet7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas ="nama lengkap / kelas /no";
        System.out.println("Identitas : " +identitas);
         Scanner scanner =new Scanner(System.in);
         System.out.print("Nilai a ?");
         int a = scanner.nextInt();
         
         System.out.println("\nIF.. `1");
         if(a < 5) System.out.println("nilai a kurang dari 5");
         
         
         System.out.println("\nIf.. 2");
         if(a == 5) System.out.println("nilai a sama dengan 5");
         
         System.out.println("nIF.. 3");
         if (a > 5){
             
         System.out.println("isi variabel a: "+a);
             System.out.println("nilai a lebih besar dari 5");
         }
         
         System.out.println("nIF..ELSE..");
         if (a < 5){
             System.out.println("isi variabel a: "+a);
             System.out.println("nilai kurang dari 5");
           
         }else System.out.println("nilai a lebih dari atau sama dengan 5");
         
        System.out.println("\nIF...ELSE IF..ELSE.. 1");
        if (a < 5){
            System.out.println("nilai a kurang dari 5");
             }else if(a == 5){
                 System.out.println("nilai a sama dengan 5");
             }else 
                 System.out.print("nilai  System.out.println(\"\\nIF..ELSE IF..ELSE.. 1\");\n" +
"        if (a < 5){a lebih besar sama dengan 5");
        System.out.println("\nIF..ELSE IF..ELSE.. 2");
        if (a < 5){
        System.out.println("nilai a kurang dari 5");
        } else if (a == 5 ){
            System.out.println("nulai a sama dengan 5");
        }else
            System.out.println("nilai a lebih dari 5");
        System.out.println("\nIF..ELSE IF..ELSE..2");
        if(a<2){
            System.out.println("nilai a kurang dari dari 2");
        }else if (a<4){
            System.out.println("nilai a kurang dari 4");
        }else if(a < 6 ){
            System.out.println("nilai a kurang dari 6");
        }else if (a == 6){
            System.out.println("nilai a sama dengan 6");
        }else {
            System.out.println("nilai alebih dari 6");
        }
        System.out.println("\nNested IF");
        if(a<7){
            System.out.println("nilai a kurang dari 7");
            if(a>2);
            System.out.println("nj=ilai a lebih dari 2");
            if(a<4);
            System.out.println("nilai a kurang dari 4");
        }
    }
}
