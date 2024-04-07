import GHC.IO.Handle (hSetBuffering)
import System.IO

{-
Copyright 2024 Om Rawaley (@omrawaley)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-}

calculateVolume :: Float -> Float -> Float -> Float
calculateVolume pi r h = pi * r ^ 2 * h

calculateSurfaceArea :: Float -> Float -> Float -> Float
calculateSurfaceArea pi r h = 2 * (pi * r ^ 2) + 2 * (pi * r * h)

main :: IO ()
main = do
  hSetBuffering stdout NoBuffering

  putStrLn "\n——— Cylinder Calculator — Made by Om Rawaley ———\n"

  putStr "π: "

  piInput <- getLine

  putStr "r: "

  radiusInput <- getLine

  putStr "h: "

  heightInput <- getLine

  let pi = (read piInput :: Float)
  let radius = (read radiusInput :: Float)
  let height = (read heightInput :: Float)

  let volume = calculateVolume pi radius height
  let surfaceArea = calculateSurfaceArea pi radius height

  putStr "\n"

  putStr "Volume: "
  print volume

  putStr "Surface Area: "
  print surfaceArea

  putStr "\n"
