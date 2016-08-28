import java.util.Scanner;
public class DayName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int count = 1;
        while(count<=cases) {
            System.out.println("Case #" + count + ": " + day(sc.nextInt()));
        count++;
        }
    }
    static String day(int day){
        switch(day){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "Not valid";
    }
}
