package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("How many Ns");
		int z = in.nextInt();
		int[] count = new int[z];
		
		for (int i = 0; i<z; i++) {
			count[i]= (1+i);
		}
				
		for (int i = 2; i*i<=z; i++) {
			for (int  x = i; x*i <= z; x++) {
				count[x*i-1] = -1;
			}
		}
		count[0]=-1;
		for (int i = 0; i<z; i++) {
			if (count[i]!=-1)
				System.out.println(count[i]+" ");
		}
	}
}

