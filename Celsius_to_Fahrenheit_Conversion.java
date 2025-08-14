package Java_Gla;
import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Temperature in Celsius:");
        float temp=sc.nextFloat();
        System.out.printf("Temperature in Fahrenheit:%.2f",(temp * 9/5) + 32.);

    }
}
