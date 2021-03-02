import java.util.*;
public class ChFour {
  public static void main(String[] args)  {
    //  if/else statement syntax
    if(<test>,<test>,...) {
      <statement>;
      <statement>;
      <statement>;
      ...
    } else  {
      <statement>;
      <statement>;
      <statement>;
      ...
    }
    // only one may execute. if the "if" test proves false, then the else is used
    // you can nest if/else statements in multiple ways:
    //the first is conditional execution; if the first test is false, then none of the ifs will execute
    if(<test>)      {
      if(<test) {
          //can continue almost indefinetely
      }
    }
    //the second is one that insures that at least one is run, unless all tests prove false
    if(test)    {
      <statement>;
    } else if(<test>) {

    } //and so on and so forth
    
    //Relational operators
   // operator      meaning                                 notes
        ==          equal EXACTLY to       this is not the same as an = sign. it is looking for exact equality, not relative equality.
        !=          not equal to           using he ! character can also reverse the test. ex: !(num == 1) is the same as num != 1
        >           greater than
        <           less than
        <=          less than or equal to   you may need to use the above two in while loops (covered in Ch.5)
        >=          greater than or equal to
    //combinative operators
        &&          AND
        ||          OR
  
  
  
  } 
}