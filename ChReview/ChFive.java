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
    .nextDouble()   Random double between 0.0(inclusive) and 1.0(exclusive)
  }
}