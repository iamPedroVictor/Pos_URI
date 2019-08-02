package Desafio1095;

import java.io.IOException;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		int i = -2;	
		for(int j = 60; j >= 0; j-=5) {
			i += 3;
			System.out.println(String.format("I=%d J=%d", i,j));
		}
		
	}
}
