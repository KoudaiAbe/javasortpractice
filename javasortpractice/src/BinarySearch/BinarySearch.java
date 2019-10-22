package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[] a = {39,41,53,68,72,84,88,92,97};
		int x,pos,left,right,middle;
		
		System.out.printf("x = ");
		
		x = scn.nextInt();
		pos = -1;
		left = 0;
		right = a.length - 1;
		
		System.out.printf("ループの前:x = %d\n", x);
		System.out.printf("ループ前の:pos = %d,\tleft = %d, \tmiddle = ?,\tright = %d\n",
				pos,left,right);
		
		while(pos == -1 && left <= right) {
			middle = (left + right) / 2;
			if(a[middle] == x) {
				pos = middle;
			}else if(a[middle] > x) {
				right = middle - 1;
			}else {
				left = middle + 1;
			}
			System.out.printf("ループの中:pos = %d,\tleft = %d,\tmiddle = %d,\tright = %d\n",
					pos,left,middle,right);
		}
		System.out.printf("pos = %d\n",pos);
	}
}
