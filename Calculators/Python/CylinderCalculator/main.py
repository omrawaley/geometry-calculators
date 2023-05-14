"""
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
"""

print("——— Cylinder Calculator — Made by Om Rawaley ———\n")

pi = float(input("π: "))

r = float(input("r: "))

h = float(input("h: "))

faceArea = pi * r ** 2

volume = faceArea * h

topSurfaceArea = faceArea * 2

sideSurfaceArea = 2 * pi * r * h

surfaceArea = topSurfaceArea + sideSurfaceArea

print("\nVolume: " + str(volume))
print("Surface Area: " + str(surfaceArea))
