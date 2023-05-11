import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Triangular Prism Calculator — Made by Om Rawaley ———");

        System.out.println("a: ");

        float a = s.nextFloat();

        System.out.println("b: ");

        float b = s.nextFloat();

        System.out.println("c: ");

        float c = s.nextFloat();

        System.out.println("h: ");

        float h = s.nextFloat();

        System.out.println("l: ");

        float l = s.nextFloat();

        float volume = b * h * l / 2;

        float surfaceArea = a * l + b * l + c * l + b * h;

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area " + surfaceArea);
    }
}