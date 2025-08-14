package Java_Gla;
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1:");
        float a =sc.nextFloat();
        System.out.print("Number2:");
        float b=sc.nextFloat();
        System.out.printf("Sum of Two numbers:%.2f",a+b);
    }
}
