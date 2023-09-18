package vetor2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cont = 0;

		int[] numeros = new int[N];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				cont += 1;
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();
		System.out.println(cont);

		sc.close();

	}

}
