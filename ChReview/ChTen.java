import java.util.*;
public class ChTen  {
  public static void main(String[] args)  {
    //ArrayLists are useful for arrays in which you do not know the array size ahead of time.
    //ArrayList Constructor
    ArrayList<type> <name> = new ArrayList<type>();
    /*for some PDT's, you require a wrapper class in your type:
      PDT : Wrapper

       int: Integer
      char: Character
   boolean: Boolean
    double: Double
    
    */
    // methods
    .add(value)                 //adds the value to the end of the Arraylist
    .add(index,value)           //adds the value at the given index, moving all indexes>givenIndex to the right
    .clear()                    //clears the ArrayList of all its values
    .contains(value)            //does a boolean test, checking the entire ArrayList for that value.
    .get(index)                 //returns the data present in that index
    .indexOf(value)             //returns the first encountered index of that value
    .lastIndexOf(value)         //returns the last encounterd index of that value
    .remove(index)              //removes any data present at that index
    .set(index,value)           //replaces the value at that index with the chosen value
    .size()                     //returns the size of the ArrayList
  }
}