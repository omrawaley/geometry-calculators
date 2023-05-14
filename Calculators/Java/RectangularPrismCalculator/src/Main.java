import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———\n");

        System.out.print("w: ");

        float w = s.nextFloat();

        System.out.print("h: ");

        float h = s.nextFloat();

        System.out.print("l: ");

        float l = s.nextFloat();

        float faceArea = w * h;

        float volume = faceArea * l;

        float surfaceArea = 2 * (w * l + h * l + w * h);

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}