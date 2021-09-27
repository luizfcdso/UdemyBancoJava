package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BancoJava;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BancoJava banco;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			banco = new BancoJava(number, holder, initialDeposit);
		}
		else {
			banco = new BancoJava (number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		banco.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(banco);
		
		System.out.println(); 
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		banco.withdraw (withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(banco);
		
		
		
		
	sc.close();
		
}

}
