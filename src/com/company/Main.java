package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {


Excetionfunciton();

    }

static void Excetionfunciton(){
    Scanner theObj = new Scanner(System.in);
    int number1;
    int number2;
//Do while should run excluding all non numbers giving people the opportunity to keep trying until a positive real number is given


    do{
        System.out.println("Please enter first number. It must be a positive number.");
        number1 = theObj.nextInt();

    } while(number1 < 0);
    do {

        System.out.println("Please enter second number. It must be a positive number.");

        number2 = theObj.nextInt();
        try{
            int proof = number1/number2;
        }
        catch(ArithmeticException e){
            System.out.println("The denominator can not be divided by " + number2);

        }
    }while(number2 <=0);
// Check for the numbers input. 0 will sill be able to be added in the function so the arithmetic exception can be triggered.


    try{
        System.out.println(number1/number2 +" with a remainder of "+ number1%number2);
    }
       /* catch(ArithmeticException e){
            System.out.println("The denominator can not be divided by " + number2);
            System.out.println("Try a new number");

        }*/
    catch(Exception e){
        System.out.println("Something has gone wrong");
    }
    finally {
        System.out.println("Thank you for the math fun!");
    }

}


}
