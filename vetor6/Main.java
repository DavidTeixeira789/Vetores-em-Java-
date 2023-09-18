package vetor6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[]nome=new String[N];
		int[]idade = new int[N];
		int maisVelho = idade[0];
		String nomeMaisVelho = null;
		
		for(int i=0; i<N;i++) {
			nome[i]=sc.next();
			idade[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(idade[i]>maisVelho) {
				maisVelho = idade[i];
				nomeMaisVelho = nome[i];
			}
		}
		System.out.println("Pessoa mais velha: "+nomeMaisVelho);
		sc.close();
	}

}
