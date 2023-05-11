import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———");

        System.out.println("w: ");

        float w = s.nextFloat();

        System.out.println("h: ");

        float h = s.nextFloat();

        System.out.println("l: ");

        float l = s.nextFloat();

        float volume = w * h * l;

        float surfaceArea = 2 * (w * l + h * l + w * h);

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}