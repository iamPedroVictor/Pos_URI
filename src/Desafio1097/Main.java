package Desafio1097;

import java.io.IOException;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		int i = 1, j = 7, count = 0;
		boolean loop = true;
		
		while(loop) {
			System.out.println(String.format("I=%d J=%d", i,j));
			count++;
			j--;
			if(count == 3) {
				loop = !(i == 9);
				i += 2;
				j += 5;
				count = 0;
			}
		}
		
	}

}
