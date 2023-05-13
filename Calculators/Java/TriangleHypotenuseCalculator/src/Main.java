import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Triangle Hypotenuse Calculator / Finder — Made by Om Rawaley ———");

        System.out.print("a: ");

        float a = s.nextFloat();

        System.out.print("b: ");

        float b = s.nextFloat();

        float squareSum = a * a + b * b;

        double c = Math.sqrt(squareSum);

        System.out.println("\nHypotenuse: " + c);
    }
}
