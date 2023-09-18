package vetor1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double[] numeros = new double[N];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
		}
		double maiorNum = numeros[0];
		int posicao = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorNum) {
				maiorNum = numeros[i];
				posicao = i;
			}

		}
		System.out.println(maiorNum);
		System.out.println(posicao);

		sc.close();

	}

}
