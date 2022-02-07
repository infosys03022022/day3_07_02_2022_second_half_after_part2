package infosys.demo.breakcontinue;

import java.util.Scanner;

// Enter 10 numbers from use and perform 
// sum of even numbers only
public class Demo3 {

	public static void main(String[] args) {
	
		int sum=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Enter the number");
			num=scan.nextInt();
			if(num%2==0)
			{
				sum+=num;
			}
			/* else
			{
				continue;
			}*/
			
			
		}
		System.out.println(sum);

	}

}
