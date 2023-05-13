print("——— Triangular Prism Calculator — Made by Om Rawaley ———")

a = float(input("a: "))

b = float(input("b: "))

c = float(input("c: "))

h = float(input("h: "))

l = float(input("l: "))

volume = b * h * l / 2

surfaceArea = a * l + b * l + c * l + b * h

print("\nVolume: " + str(volume))
print("Surface Area: " + str(surfaceArea))
