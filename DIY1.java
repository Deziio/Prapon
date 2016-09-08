import java.util.Scanner;
public class DIY1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt(); //first input arrey
    int[] myNumbers = new int[x];
    for(int i = 0; i < x; i++){
      myNumbers [i] = sc.nextInt();
    }
    int find = sc.nextInt();
    boolean found = false;
    int save = 0;
    for(int i = 0; i < x; i++){
      if (myNumbers[i] == find){
        found = true;
        save = i ;
      }
    }
    if(found == true){
      System.out.println("Found at position " + (save+1));
    }else{
      System.out.println("not found");
    }
  }
}