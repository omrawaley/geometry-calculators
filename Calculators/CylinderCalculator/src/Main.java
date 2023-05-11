import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Cylinder Calculator — Made by Om Rawaley ———");

        System.out.println("r: ");

        float radius = s.nextFloat();

        System.out.println("h: ");

        float height = s.nextFloat();

        float faceArea = radius * radius * 3.14f;

        float volume = faceArea * height;

        float topSurfaceArea = faceArea * 2;

        float sideSurfaceArea = 2 * 3.14f * radius * height;

        float totalSurfaceArea = topSurfaceArea + sideSurfaceArea;

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area: " + totalSurfaceArea);
    }
}