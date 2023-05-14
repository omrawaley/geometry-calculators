import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Triangle Leg Calculator / Finder — Made by Om Rawaley ———\n");

        System.out.print("a: ");

        float a = s.nextFloat();

        System.out.print("c: ");

        float c = s.nextFloat();

        double b = Math.sqrt(c * c - a * a);

        System.out.println("\nLeg: " + b);
    }
}