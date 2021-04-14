
package binrayjump;

import java.util.Scanner;

public class binaryJump {

	public static void main(String[] args) {
		int j=0;
		int[] arr=new int[100];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(int i=0; i<arr.length-1;)
		{
			if(arr[i]==0 && arr[i+2] == 0)
			{
				j++;
				i=i+2;
			}
			else if (arr[i] == 0 && arr[i+1]==0)
			{
				j++;
				i++;
			}
		}
		
		System.out.println(j);
	}
}
