package Desafio1049;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String 	dica1 = sc.nextLine().toLowerCase(),
				dica2 = sc.nextLine().toLowerCase(),
				dica3 = sc.nextLine().toLowerCase();
		
		String animal = "";
		
		animal = EncontrarAnimal(dica1, dica2, dica3);
		
		System.out.println(animal);
		
		sc.close();
	}

	private static String EncontrarAnimal(String dica1, String dica2, String dica3) {
		String animal;
		if(dica1.equals("vertebrado")) {
			if(dica2.equals("ave")) {
				if(dica3.equals("carnivoro")) {
					animal = "aguia";
				}else {
					animal = "pomba";
				}
			}else {
				if(dica3.equals("onivoro")) {
					animal = "homem";
				}else {
					animal = "vaca";
				}
			}
		}else {
			if(dica2.equals("inseto")) {
				if(dica3.equals("hematofago")) {
					animal = "pulga";
				}else {
					animal = "lagarta";
				}
			}else {
				if(dica3.equals("hematofago")) {
					animal = "sanguessuga";
				}else {
					animal = "minhoca";
				}
			}
		}
		return animal;
	}
}