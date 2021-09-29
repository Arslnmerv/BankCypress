package day07_IfElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen yasýnýzý giriniz");

		int yas = scan.nextInt();

		if (yas <= 65) {
			System.out.println("emekli olamazsýn");
		} else {
			System.out.println("emekli olabilirsin");
		}
		scan.close();

	}

}
