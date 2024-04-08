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

print("\n——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———\n")

w = float(input("w: "))

h = float(input("h: "))

l = float(input("l: "))

faceArea = w * h

volume = faceArea * l

surfaceArea = 2 * (w * l + h * l + w * h)

print("\nVolume: " + str(volume))
print("Surface Area: " + str(surfaceArea))
