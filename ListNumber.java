package ArrayInput;

import java.util.Scanner;

public class ArrayInputs {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Length : ");
		int length=input.nextInt();
		int[] number=new int[length];
		for(int i=0;i<length;i++) {
			System.out.print("Enter number[" + i +"] : ");
			number[i]=input.nextInt();
		}
		
		System.out.println("Output List of Numbers\n");
		for(int i=0;i<length;i++) {
			System.out.print("number[" + i +"] : " + number[i] + "\n");
		}
	}
}