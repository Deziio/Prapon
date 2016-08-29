import java.util.Scanner;
public class IT3K{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    int count = 1;
    while (count<=cases){
      int host = sc.nextInt();
      if (host % 3 == 0){
    System.out.println("Case #" + count + ": " +"KMUTT");
   }
   else if (host % 3 == 1){
    System.out.println("Case #" + count + ": " +"KMUTNB");
   }
   else if (host % 3 == 2){
    System.out.println("Case #" + count + ": " +"KMITL");
     }
   count++;
    }
  }
}
