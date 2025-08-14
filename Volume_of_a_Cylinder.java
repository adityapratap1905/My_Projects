package Java_Gla;
import java.util.Scanner;
public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Radius of Cylinder:");
        float radius=sc.nextFloat();
        System.out.print("Height of the Cylinder:");
        float height=sc.nextFloat();
        System.out.printf("Volume of a Cylinder:%.2f",(22/7)*radius*radius*height);
    }
}
