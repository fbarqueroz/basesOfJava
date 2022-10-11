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

        /*

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

        */

        //
        // ---------- Operators and Expressions ----------
        //

        // ********** Arithmetic operators **********

        /*
         // Define the values
        Scanner inputNumber = new Scanner (System.in);
        float num1, num2, sum, minus, multiply, divide, residue;

        // Request the numbers
        System.out.println("Digite 2 números: ");
        num1 = inputNumber.nextFloat();
        num2 = inputNumber.nextFloat();

        // Operations
        sum = num1 + num2;
        minus = num1 - num2;
        multiply = num1 * num2;
        divide = num1 / num2;
        residue = num1 % num2; // Divine both numbers and show the residue of this divide

        // Print the results
        System.out.println("La suma de los numeros es de: " + sum);
        System.out.println("La resta de los numeros es de: " + minus);
        System.out.println("La multiplicacion de los numeros es de: " + multiply);
        System.out.println("La division de los numeros es de: " + divide);
        System.out.println("El residuo de la division de los numeros es de: " + residue);
        */

        // ********** Arithmetic operators combined with assignment ********************

        /*
        Types of combinated operators:
            * +=
            * -=
            * /=
            * *=
            * %=
         */

        /*
        int number = 10;
        number += 5; // --> number = number + 5
        System.out.println(number);
        */

        //  ********** Increment and decrement **********

        /*
        int x = 5, y;

        // x++; ---> Increment
        // x--; ---> Decrement

        // y = x++; 🚫
        // y = ++x; ✅

        System.out.println(x);
        System.out.println(y);
        */

        //  ********** Math Class **********

        /*
        // square root
        double root = Math.sqrt(9); // Must be DOUBLE when u try to make a square root operation
        System.out.println(root);

        // To the power of 
        double base = 5, exp = 2;
        double res = Math.pow(base, exp);
        System.out.println(res);

        // Rounding
        double num = 4.56;
        long result = Math.round(num); // long --> Int number
        System.out.println(result);

        float numFloat = 4.56f;
        int resultFloat = Math.round(numFloat); // long --> Int number
        System.out.println(resultFloat);

        // Random number
        double numRandom = Math.random();
        System.out.println(numRandom);
        */

        // ********** Operators Examples **********

        /*

        // ---> Make a program that calculates and prints the sum of three grades

        Scanner entrada = new Scanner(System.in);
        float grade1, grade2, grade3, sum;

        // Request the 3 grades
        System.out.println("Ingrese las 3 notas: ");
        grade1 = entrada.nextFloat();
        grade2 = entrada.nextFloat();
        grade3 = entrada.nextFloat();

        sum = grade1 + grade2 + grade3;
        System.out.println("\nLa suma de las notas es de: " + sum);

        */

        //
        // ---------- Conditionals ----------
        //
    }
}
