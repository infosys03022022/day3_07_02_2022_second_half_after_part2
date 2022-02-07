package infosys.demo.breakcontinue;

import java.util.Scanner;

// Enter 10 numbers from user 
// and perform sum of those 10 numbers
// and in between if we enter 0
// the loop should break and the output should 
// be displayed
// either we execute the loop 10 times or
// if the value entered is 0 then we move
// out of the loop
public class Demo2 {

	public static void main(String[] args) {
	
		int sum=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Enter the number");
			num=scan.nextInt();
			if(num==0)
			{
				break;
			}
			
			sum+=num;
		}
		System.out.println(sum);

	}

}
