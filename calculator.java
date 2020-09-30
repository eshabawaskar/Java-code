import java.util.Scanner;
class calculator
{
  public static void main(final String[] args) {
    final Scanner s = new Scanner(System.in);
    int choice;
    float a,b,result=0;
    System.out.print("Enter two numbers: ");
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("Opperation:\n\t1.Addition(+)\n\t2.Subtraction(-)\n\t3.Multiplication(*)\n\t4.Division(/)\n\t5.Remainder(%)");
    choice=s.nextInt();
    again:
    switch(choice)
    {
      case 1:
        result=a+b;
        break;

      case 2:
        result=a-b;
        break;

      case 3:
        result=a*b;
        break;

      case 4:
        result=a/b;
        break;

      case 5:
        result=a%b;
        break;

      default:
      System.out.println("!!!Enter valid option!!!");
      break;
    }
    System.out.print("Result: "+result);
  }
}
