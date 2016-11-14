import java.util.Scanner;
public class minmax{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    for(int i=1;cases>=i;i++){
      int max = -999999999;
      int min = 999999999;
      int y = sc.nextInt();
      for(int j=1;y>=j;j++){
        int x = sc.nextInt();
      if (x>=max){
        max = x;
      }
      if (x<=min){
        min = x;
      }
        
    }
        System.out.println("Case#" + i + " : " + "min = " + min + ", max = " + max);
    }
  }
}
