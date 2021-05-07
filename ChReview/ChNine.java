public class ChNine {
  public static void main(String[] args)  {


//class
class <ClassName> {
//adding "private" to the variable requires an acessor method to function properly
int <name>; //this is not encapsulated
private int <name>; //this is encapsulated 
//Acessor syntax is in ChEight.java
}

//subclass Constructor
class <SubClassName> extends <ClassName> {

}
//only one class can be a superclass.
//all variables in the superclass are inherited into the subclass, but are not modifiable until you call them down from the superclass.
super(variable) //super keyword calls down the variable from the class above in the hierarchy.

//Interfaces
//[in-ter-face-ez]: a way to share data in different classes with java without sharing actual code.
//constructor
public interface <InterfaceName> {
  //write method headers, but instead of the "{}" brackets, you treat it as a statement:
  public <type> <name>(<variable>,<variable>,... ,<variable>);
  //"public" keyword is optional
}
//essentialy, you are assuring the compiler that these methods will be present in any method that implements this interface
//you can also put multiple interfaces on one class
//use in methods
class <ClassName> implements <InterfaceName>  {
  //be sure to write the code for each method. the interface is allowing you to give the same options for
  //multiple different classes. so you can hae two methods with the same name, but are present in two different classes. 
}

//this is useful for having multiple is-a relationships, as you can do things like this:
public class <name> extends <SuperclassName> implements <interfaceName>,<interfaceName>, ...,<interfaceName>{
}
//Interfaces
   //interfaces are used similar to classes, but there is no implemented statements, only headers.
   //interface Constructor
   public interface <interfaceName> {
     <methodHeaderWithParameters>; //see ChThree.java for syntax of method headers.
   }
   //the keyword to use the interface is "implements".
   //interface implementation syntax
   class <ClassName> implements <interfaceName> {

   
   }
   //in essence, any method headers that you declare in the 
   //interface is you "promising" the compiler that there will be a method in the class used.
   //the methods you declare in the interface are what are called ABSTRACT methods.
  }
}