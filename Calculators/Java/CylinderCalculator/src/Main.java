import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Cylinder Calculator — Made by Om Rawaley ———\n");

        System.out.print("π: ");

        float pi = s.nextFloat();

        System.out.print("r: ");

        float radius = s.nextFloat();

        System.out.print("h: ");

        float height = s.nextFloat();

        float faceArea = pi * radius * radius;

        float volume = faceArea * height;

        float topSurfaceArea = faceArea * 2;

        float sideSurfaceArea = 2 * pi * radius * height;

        float totalSurfaceArea = topSurfaceArea + sideSurfaceArea;

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area: " + totalSurfaceArea);
    }
}