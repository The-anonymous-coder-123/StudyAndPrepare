//Primitive Data Types, operators, casting, and Variables
import java.util.*;
public class ChTwo  {
  //Class constant delcaration
  public static final <type> <name> = <expression>;
  public static void main(String[] args)  {
    //primitive data type variable Declarations
    int <name>= <whole number value from (-2^31)+1, to (2^31-1)>;
    double <name>= <any number conatining a decimal. can also be used for scientific notation>;
    char <name>= '<character>'; // a character is any one letter, number or symbol.
    boolean <name>= true|false; //good for testing for certain elements, or settings in gamse (e.g subtitles are true or false)
    //data types can also be decalred, but not evaluated
    <int|double|char|boolean> <name>;
    //Operators
      /*Arithmetic
          + addition
          - subtraction
          * multiplication
          / division
          % remainder (ex: 3%2=1) known as the Mod operator, in refrence to the symbol used; the modulous symbol (AKA percent sign)
        Incrementals
          ++ adds one
          -- subtracts one
        Assignments
          = standard equals sign
         += Adds to current value
         -= Subtracts from current value
         *= Multiplies the current value
         /= Divides the current value
         %= remainders the current value
      */
      //Casting
        //an Example
        double myCastingExample=42.4242;
        int myCastingExampleInt= (int)myCastingExample;
      //for loop Syntax
      for(int <variable>=<val>; <variable><= n; <variable>++){
        <statement>;
        <statement>;
        ...
        <statement>;
      }
      //Nested for loop Syntax
      for(int <variable>=<val>; <variable><= n; <variable>++){
        <statement>;
        ...
        for(int <variable>=<val>; <variable><= n; <variable>++){
          <statement>;
          <statement>;
          ...
          <statement>;
        }
      }
      //to help manage complexity, use the outer for loop variable in the inner loop.
      

      
  }
}