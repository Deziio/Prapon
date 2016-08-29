import java.util.Scanner;
public class DayName2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int count = 1;
        while(count<=cases) {
          int day = sc.nextInt();
          switch(day){
          case 0:
                System.out.println("Case #" + count + ": " +"Sunday");break;
            case 1:
                System.out.println("Case #" + count + ": " +"Monday");break;
            case 2:
                System.out.println("Case #" + count + ": " +"Tuesday");break;
            case 3:
                System.out.println("Case #" + count + ": " +"Wednesday");break;
            case 4:
                System.out.println("Case #" + count + ": " +"Thursday");break;
            case 5:
                System.out.println("Case #" + count + ": " +"Friday");break;
            case 6:
                System.out.println("Case #" + count + ": " +"Saturday");break;
                default:
                  System.out.println("Case #" + count + ": " +"Not valid");break;
        }
          count++;
          }
        }
    }
