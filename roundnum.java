import java.util.Scanner;
public class roundnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=1;cases>=i;i++){
          int x = sc.nextInt();
            x = ((x+5)/10)*10;
            /*
             x = x+5;
             x = x/10;
             x = x*10;
             */
            System.out.println("Case #" + i + ": " +x);
        }
    }
}