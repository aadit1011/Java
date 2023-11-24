import java.util.Scanner;
class Greater
{
     public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          int a,b;
          System.out.println("Enter a=");
          a=scanner.nextInt();
          System.out.println("Enter b=");
          b=scanner.nextInt();
          if(a>b)
          {
               System.out.println(a-b);
          }
          else
          {
               System.out.println(a);
               System.out.println(b);
          }
          scanner.close();

     }
}