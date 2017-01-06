import java.util.Scanner;
public class Recursion{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number : ");
    int x=sc.nextInt();
    System.out.println("Factorial : "+fact(x));
  }
  
  public static int fact(int n){
    if(n==1) return 1;
    else return n*fact(n-1);
  }
}