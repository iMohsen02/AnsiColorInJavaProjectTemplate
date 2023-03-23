<h1 style="text-align: center;">ANSI Color</h1>

## ANSI escape code
base on wikipedia:
> ANSI escape sequences are a standard for in-band signaling to control cursor location, color, font styling, and other options on video text terminals and terminal emulators. Certain sequences of bytes, most starting with an ASCII escape character and a bracket character, are embedded into text. The terminal interprets these sequences as commands, rather than text to display verbatim.
> 
> ANSI sequences were introduced in the 1970s to replace vendor-specific sequences and became widespread in the computer equipment market by the early 1980s. They are used in development, scientific, commercial text-based applications as well as bulletin board systems to offer standardized functionality.
> 
> Although hardware text terminals have become increasingly rare in the 21st century, the relevance of the ANSI standard persists because a great majority of terminal emulators and command consoles interpret at least a portion of the ANSI standard.
> 
### how to change the terminal color using java project?
Ansi colors help programmers in this problem to easily change the color of the terminal.

![Ansi color table](https://user-images.githubusercontent.com/4885461/161136824-b49f1d8e-218b-4827-870f-af953cc390d0.png "Ansi colors in terminal")

easily use this format in any programming language to change the color of the terminal(point that colors should be printed to affect):
```text
\033[(color number from the above table)m
```
for example in java:
```java
System.out.println("\033[91mThis text will be RED\033[0m");
// change the color to red and then after print the text reset the color format
```
also you can use 8-bit color:
![Ansi color table](https://user-images.githubusercontent.com/995050/47952855-ecb12480-df75-11e8-89d4-ac26c50e80b9.png "Ansi colors in terminal")
<br>
easily use 8-bit color format in any programming language to change the color of the terminal(point that colors should be printed to affect):
```text
\u001b[38;5;(number from the above table)m // select the foreground color
\u001b[48;5;(number from the above table)m // select the background color
```
for example in java:
```java
System.out.println("\u001b[38;5;32m This text will be BLUE\u001b[0m");
// change the color to blue and then after print the text reset the color format
```
and you can use RGB coloring model:

![colorcube](https://user-images.githubusercontent.com/119660029/227197745-c0b4741b-96fb-4f76-b33b-7684aed577af.jpg)
<br>
you can easily generate too many color by using RGB coloring model: <br>
```text
\033[38;2;R;G;Bm // select the foreground color
\033[38;2;R;G;Bm // select the background color
```
for example in java:
```java
System.out.println("\033[38;2;255;215;0m This text will be GOLD\033[0m");
```

# Creative Process & Process Line
Some creative functions that show the process are built based on Ansi colors in the AnsiColor.java to bring beauty to your command line programs.

For example, process line functions have been tested in Main.java, which can be used in three different modes (process using percentage, process using percentage and text, process line using text).

In every type of showing process you are able to set the sleep time per percentage

pat attention that After the process, the printed line will be deleted


https://user-images.githubusercontent.com/85742391/215284639-21b8aeb3-34f6-446f-9fa4-27ddbca7d403.mp4


Enjoy it :)
