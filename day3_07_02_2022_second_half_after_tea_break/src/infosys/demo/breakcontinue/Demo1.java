package infosys.demo.breakcontinue;

import java.util.Scanner;

// Enter 10 numbers from user 
// and perform sum of those 10 numbers
public class Demo1 {

	public static void main(String[] args) {
	
		int sum=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the number");
			num=scan.nextInt();
			sum+=num;
			// sum=sum+num;
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
