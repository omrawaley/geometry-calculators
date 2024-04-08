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
calculateVolume b h l = ((b * h) / 2) * l

calculateSurfaceArea :: Float -> Float -> Float -> Float -> Float -> Float
calculateSurfaceArea a b c h l = (a * l) + (b * l) + (c * l) + (b * h)

main :: IO ()
main = do
  hSetBuffering stdout NoBuffering

  putStrLn "\n——— Triangular Prism Calculator — Made by Om Rawaley ———\n"

  putStr "a: "

  aInput <- getLine

  putStr "b: "

  bInput <- getLine

  putStr "c: "

  cInput <- getLine

  putStr "h: "

  heightInput <- getLine

  putStr "l: "

  lengthInput <- getLine

  let a = (read aInput :: Float)
  let b = (read bInput :: Float)
  let c = (read cInput :: Float)
  let height = (read heightInput :: Float)
  let length = (read lengthInput :: Float)

  let volume = calculateVolume b height length
  let surfaceArea = calculateSurfaceArea a b c height length

  putStr "\n"

  putStr "Volume: "
  print volume

  putStr "surface Area: "
  print surfaceArea

  putStr "\n"
