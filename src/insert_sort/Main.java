package insert_sort;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		//@SuppressWarings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		//入力を受け取る場合sc.nectInt();
		int n = sc.nextInt();
		int A[] = new int[n];
		
		//配列を作るfor文
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(A).replace("[,\\[\\]]",""));
		
		
		//挿入ソート開始
		for(int j = 1; j < A.length; j++) {
			
			int key = A[j];
			 //keyの一つ左の数
			int i = j - 1;
			
			//iが0より大きい & Aがkeyより大きい場合
			while(i >= 0 && A[i] > key) {
				//左の数を右に移動 1st_loop[
				A[i + 1] = A[i];
				//さらに一つ左にずらす
				i--;
			}
			//このwhileループが終わったとき、数が重複している[i+1]が重複している
			//i=0で終了。配列の最初の場所にkeyを代入して重複を解消
			A[i + 1] = key;
			System.out.println(Arrays.toString(A).replace("[,\\[\\]]",""));
		}
	}
}