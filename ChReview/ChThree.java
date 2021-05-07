import java.util.*;
public class ChThree  {
  public static void main(String[] args)  {
    //scanner declaration syntax
    Scanner <name>= new Scanner(System.in);
    //useful scanner methods:
    .nextInt()  -   records the typed int after enter key is pressed
    .nextLine() -   records all typed keys until enter is pressed.
    //using "console" or "scan" as a scanner name is a good habit to have. it helps with organization of the program.
    //java doesnt like memory leaks, so always put <scannername>.close() on its own seperate line once your done 
    //using the scanner. this closes the scanner.
    //method call Syntax
    <name>(<parameters>);
  }
  //Method Declaration Syntax
  public static <returnType> <name>(<parameter>,<<type> <name>>,...) {
    <statement>;
    <statement>;
    ...

  }
}
//parameters are variable that you pass through methods, so you can perform complex calculation aoutside of the main string.
//return types:
void  int  boolean  String  char

//indexes:
  //a string is a collection of characters, and thus, must contain a way to find certain points in the string.
  //ex
  // a good habit is to put an index above the string.
  //Index           012345678901234567890123456789012
  String myString= "This String is 32 characters long"
  //indexes count by the farthest right number minus one. so a 12 character long index will be 012345678901.
  //using the .length() method, you can get the index, by subtracting one.
//The Math Class.
//allows for shorter, more complex equations.
//useful math constants
E     natural logarithm base. goes on forever (2.71828...)
PI    circumfrence/diameter of circles. goes on forever  (3.14159...)
//useful STATIC methods in the Math Class:
//    methodName      description         example
      abs      absolute value         Math.abs(-123) returns 123
      ceil     round up               Math.ceil(3.14) returns 4.0  //note that decimals are irrelevant in both ceil and floor.
      cos      cosine(radians)        Math.cos(Math.PI) returns -1.0
      exp      exponent base e        Math.exp(1) returns 2.7182818284590455
      floor    rounds down            Math.floor(3.54) returns 3.0
      log      logarithm base e       Math.log(Math.E) returns 1.0
      log10    logarithm base 10      Math.log10(1000) returns 3.0 //this is useful for finding specific numbers in a larger number, by Math.log10, then dividing the original value by the answer of the log10.
      max      maximum of 2 values    Math.max(24,28) returns 28
      min      minimum of 2 values    Math.min(24,28) returns 24
      pow      exponentiation         Math.pow(3,3) returns 9.0
      random   random val             Math.random() returns a double val between 0 and 1  //the Random class is much more useful (see ChFive.java)   
      round    rounds to nearest int  Math.round(3.14159) returns 3   //this is the rounding we are familiar with.
      sin      sine(radians)          Math.sin(0) returns 0.0
      sqrt     square root            Math.sqrt(100) returns 10   //think of this as using a calculator, as imperfect squares will result in long doubles
      //no idea what these two do, or what the difference is. if you know, please explain next to it.
      toDegrees     converts radians to degrees
      toRadians     converts degrees to radians
      