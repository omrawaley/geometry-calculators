/*
Copyright 2023 Om Rawaley (@omrawaley)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("\n——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———\n");

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