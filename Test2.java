package tamilnadu.chennai;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(
				System.in
				); 

				System.out.println("Enter no ");

				int no = sc.nextInt(); 

				int div = 1; 
				int count=0;
				while(div<=no)
				{
				if(no%div ==0)
					{
					System.out.println(div); 
					count=count+1;
					}
				div = div+1;
				} 
				System.out.println(count);

	}

}
