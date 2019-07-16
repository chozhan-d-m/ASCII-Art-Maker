# ASCII-Art-Maker

            _____   _____  _____  _____              _____   _______
    /\     / ____| / ____||_   _||_   _|      /\    |  __ \ |__   __|
   /  \   | (___  | |       | |    | |       /  \   | |__) |   | |
  / /\ \   \___ \ | |       | |    | |      / /\ \  |  _  /    | |
 / ____ \  ____) || |____  _| |_  _| |_    / ____ \ | | \ \    | |
/_/    \_\|_____/  \_____||_____||_____|  /_/    \_\|_|  \_\   |_|

   __  __            _  __ ______  _____
  |  \/  |    /\    | |/ /|  ____||  __ \
  | \  / |   /  \   | ' / | |__   | |__) |
  | |\/| |  / /\ \  |  <  |  __|  |  _  /
  | |  | | / ____ \ | . \ | |____ | | \ \
  |_|  |_|/_/    \_\|_|\_\|______||_|  \_\

## what?

This simple application creates an ASCII Art for any input string passed as argument.
It can also distinguish and give you the output art in upper as well as the lower cases.

## How?
* For now, you can clone/download the project and reference it in your projects
* Or, after cloning you may also build a jar and externally add it as a dependency
* Until I expose it under maven central repository

### Invoking the method to get ASCII art

```
getAsciiArt("ASCII ART MAKER").foreach(println)
```

_The method getAsciiArt() takes a string as input and gives an array of strings as output (that contains the ASCII Art)_


## To Do
Currently the tool supports only alphabets (A to Z, a to z)
Will update it some time in future to also include the numbers and special characters

So, happy ASCII Art Making!