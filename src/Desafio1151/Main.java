package Desafio1151;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, first = 0, second = 1, next;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(i <= 1) {
				next = i;
			}else {
				next = first + second;
				first = second;
				second = next;
			}
			if(i == n-1) {
				System.out.println(next);
			}else {
				System.out.print(String.format("%d ", next));
			}
		}
		
		sc.close();
	}
}
