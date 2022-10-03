//
// @author fabian Barquero
//

// Package
package com.mycompany.basicsofjava;

// Imports
import javax.swing.*;
import java.util.Scanner;

public class BasicsOfJava {

    public static void main(String[] args) {
        
        //
        // ---------- How to print something in the console ----------
        //

        /* ------------------------------------------------------------------------------

        System.out.println("Hello World!"); // ln = line break at the end of the code
        // sout + tab = shotcut of println command line

         ------------------------------------------------------------------------------ */

        
        //
        // ---------- Types of primitive data ----------
        //

        /* ------------------------------------------------------------------------------
        
        // Variable = is a reserved memory location to store values
        // Also, the variable can change the value along the code
        
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

        ------------------------------------------------------------------------------ */
        
        
        //
        // ---------- Non primitive data and chaining method ----------
        //

        /* ------------------------------------------------------------------------------
        
        // Non primitive data
        
        Integer nonNum = null;
        System.out.println("Null Data: " + nonNum);
        
        // Chaining method
        
        String word = "Hi, what's up"; // Most use double cuote
        System.out.println("Chain of characters: " + word);
        
        //
        // ---------- Const value ----------
        //
        
        final int num = 10; // to define a const, most use final
        System.out.println("Const value: " + num);

        ------------------------------------------------------------------------------ */
        
        //
        // ---------- in and out of data (console) ----------
        //

        /* ------------------------------------------------------------------------------

        Scanner in = new Scanner(System.in);
        int intNumber;
        float floatNumber;
        String chain;
        char letter;
        
        System.out.println("Type an int number: ");
        intNumber = in.nextInt(); // input data
        System.out.println("The int number is: " + intNumber);

        System.out.println("Type a decimal number: ");
        floatNumber = in.nextFloat();
        System.out.println("The decimal number is: " + floatNumber);

        System.out.println("Type an string data: ");
        // chain = in.next(); ==> only save one string value == example: today (without spaces)
        chain = in.nextLine(); // save a chain of string values == example: today is friday
        System.out.println("The string data is: " + chain);

        System.out.println("Type an string data: ");
        letter = in.next().charAt(0); // char support just one character == example: "l"
        // charAt(0) ==> Only read the fist letter or number of the value
        System.out.println("The char data is: " + chain);

        ------------------------------------------------------------------------------ */

        //
        // ---------- In and out of data with JOptionPane ----------
        //

        String cadena;
        int entero;
        char letra;
        double decimal;

        // ** JOptionPane genera una ventana emergente solicitando los datos **

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        // System.out.println(cadena);

        entero = Integer.ParseInt(JOptionPane.showInputDialog("Digite un entero: "));
        // ------ Se intergra un integer para transformar de string a int ------

        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        // Se agrega un '.charAt(x)' para canvertir de string a char

        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        // Se agrega dentro de 'parseDouble()' para convertir de string a double

        // Muestra una ventana con el resultado
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El número entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);

        //
        // ---------- Operators and Expressions ----------
        //
    }
}
