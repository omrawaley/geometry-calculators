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

calculateHypotenuse :: Float -> Float -> Float
calculateHypotenuse a b = sqrt (a ^ 2 + b ^ 2)

main :: IO ()
main = do
  hSetBuffering stdout NoBuffering

  putStrLn "\n——— Triangle Hypotenuse Calculator / Finder — Made by Om Rawaley ———\n"

  putStr "a: "

  aInput <- getLine

  putStr "b: "

  bInput <- getLine

  let a = (read aInput :: Float)
  let b = (read bInput :: Float)

  let c = calculateHypotenuse a b

  putStr "\n"

  putStr "Hypotenuse: "
  print c

  putStr "\n"
