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

	std::cout << "\n——— Triangle Hypotenuse Calculator / Finder — Made by Om Rawaley ———\n\n";

	std::cout << "a: ";

	std::cin >> a;

	std::cout << "b: ";

	std::cin >> b;

	float squareSum = a * a + b * b;

	float c = sqrt(squareSum);

	std::cout << "\nHypotenuse: " << c << "\n\n";
}