import java.util.Scanner;
public class dayNames {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int count = 1;
		while (count<=cases){
			int day = sc.nextInt();
			if (day == 0){
				System.out.println("Case #" + count + ": " +"Sunday");
			}
			else if (day == 1){
				System.out.println("Case #" + count + ": " +"Monday");
			}
			else if (day == 2){
				System.out.println("Case #" + count + ": " +"Tuesday");
			}
			else if (day == 3){
				System.out.println("Case #" + count + ": " +"Wednesday");
			}
			else if (day == 4){
				System.out.println("Case #" + count + ": " +"Thursday");
			}
			else if (day == 5){
				System.out.println("Case #" + count + ": " +"Friday");
			}
			else if (day == 6){
				System.out.println("Case #" + count + ": " +"Saturday");
			}
			else {
				System.out.println("Case #" + count + ": " +"Not valid");
			}
			count++;
		}
	}
}
