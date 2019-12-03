package exercicioA;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int[] a = new int[10];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o "+i+"° numero:");
			a[i] = ler.nextInt();	
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Analise do numero :"+a[i]);
			
			for (int j=1; j<a[i]; j++) {
				if(a[i] % j == 0) {
					System.out.println(j+" é divisor");
				}
			}
			System.out.println();
				
		}
		
	}

}

