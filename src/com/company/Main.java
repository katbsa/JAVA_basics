package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.println("This program takes 3 numbers and sorts them from least to greatest.");

        System.out.print( "Enter 3 numbers separated by space: ");
        int first_number = myInput.nextInt();
        int second_number = myInput.nextInt();
        int third_number = myInput.nextInt();

        System.out.println("Numbers before rearranging: " + first_number + ", " + second_number + ", " + third_number);

        if(first_number > second_number){
            int temporary_variable = first_number;
            first_number = second_number;
            second_number = temporary_variable;
        }

        if(first_number > third_number){
            int temporary_variable = first_number;
            first_number = third_number;
            third_number = temporary_variable;
        }

        if(second_number > third_number) {
            int temporary_variable = second_number;
            second_number = third_number;
            third_number = temporary_variable;

        }

        System.out.println("Rearranged numbers: "+ first_number + ", " + second_number + ", "+ third_number);

    }
}
