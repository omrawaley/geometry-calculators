print("——— Cylinder Calculator — Made by Om Rawaley ———")

print("π: ")

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
