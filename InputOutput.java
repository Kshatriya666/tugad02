import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String name;
  int SKS;
  double IPK;

  System.out.print("Insert your name : ");
  name = scanner.nextLine();
  System.out.println("Hi, "+name);

  System.out.print("Insert how many SKS you already pass on : ");
  SKS = scanner.nextInt();

  System.out.print("Insert your latest IPK score : ");
  IPK = scanner.nextDouble();

  double result = IPK * SKS;
  System.out.print("Total Score = "+result);
 }
}
