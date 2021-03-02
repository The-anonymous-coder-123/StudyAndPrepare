import java.util.*;
public class ChEight  {
  public static void main(String[] args)  {
    <type> <name> = new <type>(parameters);
    <primType> <name> = <value>;
  }
}

//Class Syntax
class <name> {
  <variable declaration>;
  <variable declaration>;
  <variable declaration>;
  ...
  //Mutator Syntax
  public <name>(parameters) {
    <parameterValueDeclaration>;
    <parameterValueDeclaration>;
    <parameterValueDeclaration>;
    ...
  }
  //Accesor Syntax
  public <type> get<variable>() {
    return this.<varName>;
  }
  
  //toString Syntax. you MUST name it toString, or Java will not recognize it, as said in the book.
  public String toString()  {
    return <string>;
    //an example, using the book.
  //  return "(" + x + ", " + y + ")";
    //this is important, as java will default to the class name, followed by an @, and then a series of numbers and letters related to the data address.
  }
}

  }
}