import math

print("——— Triangle Leg Calculator / Finder — Made by Om Rawaley ———\n")

a = float(input("a: "))

c = float(input("c: "))

squareDifference = c ** 2 - a ** 2

b = math.sqrt(squareDifference)

print("\nLeg: " + str(b))
