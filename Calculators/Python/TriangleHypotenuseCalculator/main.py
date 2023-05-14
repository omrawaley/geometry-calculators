import math

print("——— Triangle Hypotenuse Calculator / Finder — Made by Om Rawaley ———\n")

a = float(input("a: "))

b = float(input("b: "))

squareSum = a ** 2 + b ** 2

c = math.sqrt(squareSum)

print("\nHypotenuse: " + str(c))
