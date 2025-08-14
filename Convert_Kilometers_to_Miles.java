package Java_Gla;
import java.util.Scanner;
public class Convert_Kilometers_to_Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Distance in Kilometer:");
        float km=sc.nextFloat();
        System.out.printf("Distance in Miles:%.2f",km * 0.621371);
    }
}
