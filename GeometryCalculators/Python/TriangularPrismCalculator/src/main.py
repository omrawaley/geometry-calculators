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

print("\n——— Triangular Prism Calculator — Made by Om Rawaley ———\n")

a = float(input("a: "))

b = float(input("b: "))

c = float(input("c: "))

h = float(input("h: "))

l = float(input("l: "))

volume = b * h * l / 2

surfaceArea = a * l + b * l + c * l + b * h

print("\nVolume: " + str(volume))
print("Surface Area: " + str(surfaceArea))
