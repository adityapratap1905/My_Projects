package Java_Gla;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Power {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Base:");
            float base=sc.nextFloat();
            System.out.print("Power:");
            float power=sc.nextFloat();
            float res= (float) pow(base,power);
            System.out.printf("Answer:%.2f",res);
        }
    }

