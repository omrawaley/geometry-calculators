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
	float pi;
	float r;
	float h;

	std::cout << "\n——— Cylinder Calculator — Made by Om Rawaley ———\n\n";

	std::cout << "π: ";

	std::cin >> pi;

	std::cout << "r: ";

	std::cin >> r;

	std::cout << "h: ";

	std::cin >> h;

	float faceArea = pi * r * r;

	float volume = faceArea * h;

	float topSurfaceArea = faceArea * 2;

	float sideSurfaceArea = 2 * pi * r * h;

	float totalSurfaceArea = topSurfaceArea + sideSurfaceArea;

	std::cout << "\nVolume: " << volume;
	std::cout << "\nSurfaceArea: " << totalSurfaceArea << "\n\n";

	return 0;
}
