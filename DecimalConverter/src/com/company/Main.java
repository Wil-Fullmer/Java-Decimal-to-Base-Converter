package com.company;

//Imports
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Creates Scanner Object to read User Input
        Scanner input = new Scanner( System.in );

        //Asks user to input an integer and stores the integer in the string variable integerString
        System.out.println("Enter Integer: ");
        String integerString =input.nextLine();


        // Uses the toBinary and toHex built-in function to convert the integer value to hex or decimal
        System.out.println("Binary Number: "+Integer.toBinaryString(Integer.parseInt(integerString)));
        System.out.println("Hex Number : "+Integer.toHexString(Integer.parseInt(integerString)));
    }

}
