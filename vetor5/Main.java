package vetor5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] vect = new int[N];
		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = (int) soma / N;
		System.out.printf("%.1f", media);
		sc.close();

	}

}
