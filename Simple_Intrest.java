package Java_Gla;
import java.util.Scanner;
public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal:");
        float Principal=sc.nextFloat();
        System.out.print("Time:");
        float time=sc.nextFloat();
        System.out.print("Rate:");
        float rate=sc.nextFloat();
        System.out.printf("Simple intrest:%.2f\n",(Principal*rate*time)/100);
        System.out.printf("Amount:%.2f",Principal+(Principal*rate*time)/100);
    }
}
