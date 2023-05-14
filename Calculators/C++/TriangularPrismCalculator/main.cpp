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

#include <iostream>

int main()
{
	float a;
	float b;
	float c;
	float h;
	float l;

	std::cout << "\n——— Triangular Prism Calculator — Made by Om Rawaley ———\n\n";

	std::cout << "a: ";

	std::cin >> a;

	std::cout << "b: ";

	std::cin >> b;

	std::cout << "c: ";

	std::cin >> c;

	std::cout << "h: ";

	std::cin >> h;

	std::cout << "l: ";

	std::cin >> l;

	float faceArea = b * h / 2;

	float volume = faceArea * l;

	float surfaceArea = a * l + b * l + c * l + faceArea * 2;

	std::cout << "\nVolume: " << volume;
	std::cout << "\nSurface Area: " << surfaceArea << "\n\n";
}