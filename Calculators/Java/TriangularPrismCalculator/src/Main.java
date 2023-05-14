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

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);

        System.out.println("——— Triangular Prism Calculator — Made by Om Rawaley ———\n");

        System.out.print("a: ");

        float a = s.nextFloat();

        System.out.print("b: ");

        float b = s.nextFloat();

        System.out.print("c: ");

        float c = s.nextFloat();

        System.out.print("h: ");

        float h = s.nextFloat();

        System.out.print("l: ");

        float l = s.nextFloat();

        float volume = b * h * l / 2;

        float surfaceArea = a * l + b * l + c * l + b * h;

        System.out.println("\nVolume: " + volume);
        System.out.println("Surface Area " + surfaceArea);
    }
}