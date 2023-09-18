package vetor4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double soma = 0.0;
		double[] vect = new double[N];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / N;
		System.out.println(media);
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
