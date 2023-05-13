print("——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———")

w = float(input("w: "))

h = float(input("h: "))

l = float(input("l: "))

faceArea = w * h

volume = faceArea * l

surfaceArea = 2 * (w * l + h * l + w * h)

print("\nVolume: " + str(volume))
print("Surface Area: " + str(surfaceArea))
