import java.awt.*;
public class ChGraphic  {
  public static void main(String[] args)  {
      //DrawingPanel Object Declaration
      DrawingPanel <name> = new DrawingPanel(<widthInPixels>, <heightInPixels>);
      //Pixel: 0.26mm component with Red, Green, and Blue LEDs. the basic unit of resolution.
      //basic DrawingPanel methods
      getGraphics()                       returns a Graphics object that can be used to draw onto the panel
      setBackground(color)                sets the background color of the panel to any given color(the default is white)
      //main DrawingPanel methods
      //note that all shape methods have x, and y values, to determine their position on the panel, while width and height determine the actual size
      drawLine(x1,y1,x2,y2)               draws a line between 2 points. can be used in conjunction with Point objects
      drawOval(x,y,width,height)          draws the outline of the largest oval that fits within the specified rectangle
      drawRect(x,y,width,height)          draws the outline of a specified rectangle
      drawString(message,x,y)             draws the given text with its SW most corner at (x,y)
      fillOval(x,y,width,height)          fills the largest oval that fits within the specified rectangle using the current color
      fillRect(x,y,width,height)          fills the specified rectangle with the current color
      setColor(color)                     sets this graphics context's current color to the specified color (all subsequent graphics operations using this graphics context use this specified color)
      setFont(font)                       set this graphics context's current font to the specified font (all subsequent strings drawn using this graphics context use this specified font)
      //the Font class
      //Object declaration
      new Font(<name>,<style>,<size>);
      //constants
      Font.BOLD                   Bold text
      Font.ITALIC                 Italic text
      Font.BOLD + Font.ITALIC     Bold/Italic Text
      Font.PLAIN                  Plain Text
      //Font Names
      "Monospaced"        a typewriter font, such as Courier New
      "SansSerif"         a font without curves (serifs) as letter edges, such as Arial
      "Serif"             a font with curved edges, such as Times New Roman
      //DrawingPanel is also capable of displaying any type of image onto the panel, in formats such as JPEG, PNG, or GIF.
      //Image Object Declaration
      Image <name> =  <panel>.loadImage("<fileName>");
      //image draw statement
      <objectName>.drawImage(<name>,<x>,<y>,<panel>);
      //REMEMBER
      //act as if the drawing is in quadrant IV, with the origin in the NW most corner, or top left.
      //only the x and y parameters affect the position. they are also always in the top-leftmost corner of the shape.
  }
}