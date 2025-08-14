package Basics_of_java;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.printf("Average of 3 numbers:%.2f", (a + b + c) / 3);
    }
}
