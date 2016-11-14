import java.util.Scanner;
public class Trinum{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int count = sc.nextInt();
    for(int i=1;count>=i;i++){
      int sum = 0;
      int y = sc.nextInt();
      for(int j=1;y>=j;j++){
      sum = sum+j;
    }
    System.out.println("Case#" + i + " : " + sum);
    }
  }
}
