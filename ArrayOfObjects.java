package Package2;
import java.util.Scanner;
import java.util.*;
public class ArrayOfObjects
{
   public static void main(String[] args)
   {
      // Create an array to hold rectangle's data.
      Rectangle[] rectangles = new Rectangle[5];
      double length; //to hold length of rectangle
      double width;  //to hold width of rectangle

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);
      System.out.println("input number object :");
      int o = console.nextInt();
      Rectangle[] rec = new Rectangle[o];
      for (int i = 0; i < rec.length; i++)
      {
System.out.print("Enter length of Rectangle " + (i + 1) + ": ");
         length = console.nextDouble();
System.out.print("Enter the width of Rectangle " + (i + 1)+ ": ");
         width = console.nextDouble();
         rec[i] = new Rectangle(length, width);
         System.out.println();
      }
      for (int i = 0; i < rec.length; i++)
      {
System.out.println("Area of Rectangle " + (i + 1) + ": "
                            + rec[i].getArea());
      }
   }
}
