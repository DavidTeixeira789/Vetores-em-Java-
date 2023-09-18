package vetor8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[]altura= new double[N];
		char[]genero = new char[N];
		
		for(int i=0;i<N;i++) {
			altura[i]=sc.nextDouble();
			genero[i]=sc.next().charAt(0);
		}
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for(int i=0;i<N;i++) {
			if(altura[i]<menorAltura) {
				menorAltura = altura[i];
				System.out.printf("Menor altura = %.2f%n",menorAltura);
			}
		}
		for(int i=0;i<N;i++) {
			if(altura[i]>maiorAltura) {
				maiorAltura = altura[i];
				System.out.printf("Maior altura = %.2f%n",maiorAltura);
			}
		}
		int cont = 0;
		double soma = 0.0;
		for(int i=0;i<N;i++) {
			if(genero[i]=='F') {
				cont += 1;
				soma += altura[i];
			}
		}
		double media = soma/cont;
		System.out.printf("Media das alturas das mulheres = %.2f%n",media);
		int contM = 0;
		for(int i=0;i<N;i++) {
			if(genero[i]=='M') {
				contM += 1;
			}
		}
		System.out.println("Numero de homens = "+contM);
		sc.close();
	}

}
