import java.util.Scanner;
public class roundnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int count = 1;
        while (count <= cases) {
          int x = sc.nextInt();
            x = x + 5;
            x = x / 10;
            x = x * 10;
            System.out.println("Case #" + count + ": " +x);
            count++;
        }
    }
}
