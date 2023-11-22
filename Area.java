import java.util.Scanner;
class Area
{
     
     public static void main(String [] args)
     {
          float rad,length,breadth;
          while(true)
          {
          System.out.println("Enter\n 0 for exit \n1 for Area of circle\n2 for Area of square\n3 for Area of rectangle");
          Scanner scanner=new Scanner(System.in);
          Area choice=new Area();
          int num=scanner.nextInt();
          switch (num) {
               case 0:
                         System.out.println("Exiting the program");
                         System.exit(0);
                         scanner.close();
                         break;
               case 1:
                         System.out.println("Enter radius-");
                         rad=scanner.nextFloat();
                         float circle=choice.circle(rad);
                         System.out.println("The area of the circle is="+circle);
                         break;
               case 2:
                         System.out.println("Enter length of square-");
                         length=scanner.nextFloat();
                         float square=choice.square(length);
                         System.out.println("The area of the square is="+square);
                         break;
               case 3:
                         System.out.println("Enter length and breadth-");
                         length=scanner.nextFloat();
                         breadth=scanner.nextFloat();
                         float rectangle=choice.rectangle(length, breadth);
                         System.out.println("The Area of the rectangle is="+rectangle);
                         break;
               default:
                    System.out.println("Wrong choice");
                    break;
          }
          }
     }
     float circle( float rad)
          {
               float circ;
               circ=(22/7)*rad*rad;
               return circ;
          }
     float rectangle(float length,float breadth)
          {
               float rec=length*breadth;
               return rec;
          }
     float square(float length)
          {
          float squa=length*length;
          return squa;
          }
}