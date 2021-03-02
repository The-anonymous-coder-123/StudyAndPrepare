//Print Statements, escape characters, and Java keywords
public class ChOne {
  public static void main(String[] args){
    System.out.println("This is a println message."); //prints its contents on one line, and nothing else
    System.out.print("this is a print message"); //allows for multi-statement text. will not set to a new line after the statement is run.
    System.out.println(); //this can be used to space lines out. it only prints a new line
  }
}

/*Escape sequences include:
          \t   -a shortcut for a standard tab (8 spaces)
          \n   -new lines. useful for multi-line print statements
          \"   -quotation mark. this is because print statements include these, and will confuse the compiler.
          \\   -backslash. this is to counteract the previous escape sequences
        */
//Java Keywords
abstract    continue    for           new           switch
assert      default     goto          package       synchronized
boolean     do          if            private       this
break       double      implements    protected     throw
byte        else        import        public        throws
case        enum        instanceof    return        transient
catch       extends     int           short         try
char        final       interface     static        void
class       finally     long          strictfp      volatile
const       float       native        super         while