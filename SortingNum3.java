import java.util.Scanner;
public class SortingNum3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int count = 1;
        while (count <= cases) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            double min = 0, mid = 0, max = 0;
            if ((num1 > num2 && num1 > num3)) {
                max = num1;
                if (num2 > num3) {
                    mid = num2;
                    min = num3;
                } else {
                    mid = num3;
                    min = num2;
                }
            } else if ((num2 > num1 && num2 > num3)) {
                max = num2;
                if (num1 > num3) {
                    mid = num1;
                    min = num3;
                } else {
                    mid = num3;
                    min = num1;
                }
            } else if ((num3 > num1 && num3 > num2)) {
                max = num3;
                if (num1 > num2) {
                    mid = num1;
                    min = num2;
                } else {
                    mid = num2;
                    min = num1;
                }
            }
            System.out.println("Case #" + count + ": " + min + " " + mid + " " + max);
            count++;
        }
    }
}
