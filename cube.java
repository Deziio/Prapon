import java.util.Scanner;
public class cube{
  public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);

    int cases = sc.nextInt();
    for(int i=1;i<=cases;i++){
      int A = sc.nextInt();
      for(int a=1;a<=A;a++){
        System.out.print("*");
      }
    }  
  }
}