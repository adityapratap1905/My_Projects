package Java_Gla;
import java.util.Scanner;
public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Length of Rectangle:");
        float len= sc.nextFloat();
        System.out.print("Width of Rectangle:");
        float width=sc.nextFloat();
        System.out.printf("Perimeter of Rectangle:%.2f",2*(len+width));
    }
}
