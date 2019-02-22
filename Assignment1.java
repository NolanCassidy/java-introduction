import java.util.Scanner;
public class Assignment1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = 1; 
		int sum = 0;
		do{
				if (num == -3){
            		System.out.println("Sum: " + sum);
        		}
				System.out.print("Enter a positive integer (-3 to print, -2 to reset, -1 to quit): ");
				num = input.nextInt();
				if (num == -2) {
					sum = 0;
				}
				if (num > 0){
					sum = sum + num;
				}
		} while (num != -1);
		System.out.println("Sum: " + sum);
		input.close();
        System.exit(0);
	}
}