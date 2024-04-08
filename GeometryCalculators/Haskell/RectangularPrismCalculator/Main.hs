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
calculateVolume w h l = w * h * l

calculateSurfaceArea :: Float -> Float -> Float -> Float
calculateSurfaceArea w h l = 2 * ((w * l) + (w * h) + (l * h))

main :: IO ()
main = do
  hSetBuffering stdout NoBuffering

  putStrLn "\n——— Rectangular Prism / Cube Calculator — Made by Om Rawaley ———\n"

  putStr "w: "

  widthInput <- getLine

  putStr "h: "

  heightInput <- getLine

  putStr "l: "

  lengthInput <- getLine

  let width = (read widthInput :: Float)
  let height = (read heightInput :: Float)
  let length = (read lengthInput :: Float)

  let volume = calculateVolume width height length
  let surfaceArea = calculateSurfaceArea width height length

  putStr "\n"

  putStr "Volume: "
  print volume

  putStr "SurfaceArea: "
  print surfaceArea

  putStr "\n"
