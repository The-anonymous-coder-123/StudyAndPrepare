import java.util.*;
public class ChFive {
  public static void mian(String[] args)  {
    //While Loop Syntax
    while(<test>) {

    }
    //if the test is equal to true, the while loop repeats. this is useful for programs which dont have a defined limit
    //Random Object Syntax
    Random <name> = new Random();
    //useful methods
    .nextInt()      Random int between -2^31 and (2^31-1) //see bottom for an explanation of 2^31
    .nextInt(max)   Random int between 0 and (max-1) //note that it stops before you reach the number
    .nextDouble()   Random double between 0.0(inclusive) and 1.0(exclusive) // essentially Math.random

    //Fencepost and Sentinal Algorithms
    //useful for, well, fencepost-related things. and sentinal-related things.
    //Fencepost Syntax.
    <fencePost>;
    for(int <name> = <value> ;i<=<totalFenceLength>; <name>++)  {
      <fencePiece>;
      <fencePost>;
      //ifs are also useful in certain situations, usually when large numbers are present.
    }
    //Sentinal Syntax. this searches for a value and signals when it encounters it. useful for searching.
    while([variableName]!=<sentinalValue>) {
      <statement>; //in most if not all cases, a statement that changes the state of the predetermined variable should be included.
      <statement>;
      ...
      <statement>;
    }
  }
}