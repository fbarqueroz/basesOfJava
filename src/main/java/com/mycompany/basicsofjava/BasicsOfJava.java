//
// @author fabian Barquero
//

// Package
package com.mycompany.basicsofjava;

// Imports
import java.util.Scanner;

public class BasicsOfJava {

    public static void main(String[] args) {
        
        //
        // ---------- How to print something in the console ----------
        //
        
        
        System.out.println("Hello World!"); // ln = line break at the end of the code
        // sout + tab = shotcut of println command line
        
        
        //
        // ---------- Types of primitive data ----------
        //
        
        // Variable = is a reserved memory location to store values
        // Also, the variable can chage the value along the code
        
        // Integer Numbers
        
        byte enteroByte = 12; // 8 bits
        System.out.println("Num entero Byte: " + enteroByte);
        
        short enteroShort = 12456; // 16 bits
        System.out.println("Num entero Short: " + enteroShort);
        
        int enteroInt = 125056; // 32 bits
        System.out.println("Num entero Int: " + enteroInt);
        
        long enteroLong = 124448551;
        System.out.println("Num entero Long: " + enteroLong);
        
        // Decimal Numbers
        
        float decFloat = 1.25f; // 32 bits
        // Is important add the "f" at the end of the number to avoid al error
        System.out.println("Num decimal Float: " + decFloat);
        
        double decDouble = 1.25f; // 32 bits
        // Is important add the "f" at the end of the number to avoid al error
        System.out.println("Num decimal Double: " + decDouble);
        
        // Character Data
        
        char character = '4'; // Just save one character
        System.out.println("Character data: " + character);
        
        // Boolean Data (true or false)
        
        boolean validation = true;
        System.out.println("Boolean Data: " + validation);
        
        
        //
        // ---------- Non primitive data and chains ----------
        //
        
        // Non primitive data
        
        Integer nonNum = null;
        System.out.println("Null Data: " + nonNum);
        
        // Chains
        
        String word = "Hi, what's up"; // Most use double cuote
        System.out.println("Chain of characters: " + word);
        
        //
        // ---------- Const value ----------
        //
        
        final int num = 10; // to define a const, most use final
        System.out.println("Const value: " + num);
        
        //
        // ---------- in and out of data (console) ----------
        //

        Scanner in = new Scanner(System.in);
        int intNumber;
        float floatNumber;
        String chain;
        
        System.out.println("Type an int number: ");
        intNumber = in.nextInt(); // input data
        System.out.println("The int number is: " + intNumber);

        System.out.println("Type a decimal number: ");
        floatNumber = in.nextFloat();
        System.out.println("The decimal number is: " + floatNumber);

        System.out.println("Type an string data: ");
        chain = in.next(); // only save one word
        System.out.println("The string data is: " + chain);
    }
}
