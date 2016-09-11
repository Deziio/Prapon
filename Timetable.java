import java.util.Scanner;
public class Timetable{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int i = sc.nextInt();
       int x;
       
       for (x = 1; x <= 12; x++){
       System.out.println(i + "x" + x + "=" + i*x);
       }
  }
}