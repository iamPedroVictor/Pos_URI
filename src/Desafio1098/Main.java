package Desafio1098;

import java.io.IOException;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		int count = 0;
		for (double i = 0, j = 1.0; i < 2.1; j++, count++) {
			if(count == 3) {
				i += 0.2;
				j = 1 + i;
				count = 0;
			}
			if(i < 2.1) {
				if( i == 1 || equal(i, 2.0) || i == 0) {
					System.out.printf("I=%.0f J=%.0f\n",i,j);
				}else {
					System.out.printf("I=%.1f J=%.1f\n",i,j);
				}
			}
		}		
	}
	
	public static boolean equal(double d1, double d2) {
		  double d = d1 / d2;
		  return (Math.abs(d - 1.0) < 0.001);
	}
}
