package Java_Gla;
import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Radius:");
        float radius=sc.nextFloat();
        System.out.printf("Area of Circle:%.2f",(22/7)*radius*radius);
    }
}
