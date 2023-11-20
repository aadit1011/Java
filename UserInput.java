import java.util.Scanner;

class UserInput
{   
    
     public static void main(String [] args)
     {         int add,sub,mul;
               Scanner scanner=new Scanner(System.in);
               System.out.println("Enter a and b=");
               System.out.println("Enter a=");
               int aInput= scanner.nextInt();
               System.out.println("Enter b=");
               int bInput= scanner.nextInt();
               while (true) {
                    
               System.out.println("Enter choice\n 0 for exit\n 1 for addition\n 2 for substraction\n3 for multiplication=");
               int  num;
               num=scanner.nextInt();
               switch (num) {
                    case 3:
                              UserInput obj1=new UserInput();
                              mul=obj1.multiply(aInput,bInput); 
                              System.out.println("The result is "+ mul);
                              break;
                    case 1:
                              UserInput obj2=new UserInput();
                              add=obj2.addition(aInput,bInput); 
                              System.out.println("The result is "+ add);
                              break;
                    case 2:   
                              UserInput obj3=new UserInput();
                              sub=obj3.subtraction(aInput,bInput); 
                              System.out.println("The result is "+ sub);
                              break;
                    case 0:
                              System.out.println("Exiting the programm");
                              System.exit(0);
                              scanner.close(); 
                    default:
                         System.out.println("Error input.");
                         break;
               }
          }
             
     }
      int multiply(int aInput ,int bInput)
          {
               int mul;
               mul=aInput*bInput;
               return mul;
          }
     int addition(int aInput,int bInput)
          {
               int add=aInput+bInput;
               return add;
          }
     int subtraction(int aInput, int bInput)
     {
          int subs=aInput-bInput;
          return subs;
     }
}