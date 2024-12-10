package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Product[] vect = new Product[10];
		System.out.println("");
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Rent #"+ "%d:%n",i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Rooom: ");
			int room = sc.nextInt();
			System.out.println("");
			vect[room] = new Product(name, email, room);
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.printf("%d"+": " +"%s, " +"%s%n",vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			}
		}
		sc.close();
	}
}
