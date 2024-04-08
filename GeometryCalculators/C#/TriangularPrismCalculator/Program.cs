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

using System;

class Program
{
	static void Main(string[] args)
	{
		Console.WriteLine("\n——— Triangular Prism Calculator — Made by Om Rawaley ———\n");

		Console.Write("a: ");

		decimal a = Convert.ToDecimal(Console.ReadLine());

		Console.Write("b: ");

		decimal b = Convert.ToDecimal(Console.ReadLine());

		Console.Write("c: ");

		decimal c = Convert.ToDecimal(Console.ReadLine());

		Console.Write("h: ");

		decimal h = Convert.ToDecimal(Console.ReadLine());

		Console.Write("l: ");

		decimal l = Convert.ToDecimal(Console.ReadLine());

		decimal faceArea = b * h / 2;

		decimal volume = faceArea * l;

		decimal surfaceArea = a * l + b * l + c * l + faceArea * 2;

		Console.WriteLine("\nVolume: " + volume);
		Console.WriteLine("SurfaceArea: " + surfaceArea + "\n");
	}
}