import java.util.Scanner;
public class JustPrint {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    
    int cases = scan.nextInt();
    int count = 1;
    while (count<=cases){
    String x = scan.next();
    System.out.println("Case #" + count + ": " +x);
    count++;
   }
  }
}
