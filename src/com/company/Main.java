package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Modulus_Clock();




    }

    public static void Modulus_Clock(){

        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("Enter Value for Hours");
        int hours = Keyboard.nextInt();
        System.out.println("Enter Value for Minutes");
        int minutes = Keyboard.nextInt();
        hours = 60 <= minutes ? ++hours : hours;


        System.out.println(hours%12);







    }











    public static void Modulus_stuff() {
        System.out.printf("%d",10); //Meant for integers
        System.out.printf("%f",10.1); //meant for floating Numbers such as decimals
        System.out.printf("%c",'a'); // Meant for single letters
        System.out.printf("%C",'a'); //Capitalization
        System.out.printf("%s","hello"); //Meant for Strings
        System.out.printf("%S","hello"); //Capitalization
        System.out.printf("%b",5>4); //Boolean
        System.out.printf("%B",5>4); //Capitalization
        System.out.printf("%b",null); //false
        System.out.printf("%e",10.123); //Scientific Notation
        System.out.printf("%E",10.123); //capital Scientific Notation
        System.out.printf("%g",100000.0); //Either print decimal or Scientific
        System.out.printf("%o",10); //OctalBase
        System.out.printf("%x",10); //hexadecimal
        System.out.printf("%h","hello"); //Hash code
        System.out.printf("%a",10.12); //Hexadecimal with decimal point
        Calendar cal = Calendar.getInstance();
        System.out.printf("%tB",cal); //Finding the

    }
}
