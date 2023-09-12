package view;

import java.util.Scanner;

import model.PilhaInt;

public class PilhaFat {

	public static void main(String[] args) throws Exception {
		
		PilhaInt p =  new PilhaInt();
		
		try (Scanner SC = new Scanner(System.in)) {
			
			
			int N = SC.nextInt();
			while(N>10) {
				System.out.println("Digite um valor válido");
				N = SC.nextInt();
			}
			while (N<0) {
				System.out.println("Digite um valor válido");
				N = SC.nextInt();
			}
			if (N==0) {
				System.out.println("Fatorial= "+ N);
			} else { 
			for (int i=1;i<=N;i++) {
				if ( p.isEmpty()) {
					p.push(i);
				} else {
					int v1 = p.pop();
					p.push(v1*i);
					if (N==i) {
						System.out.println("Fatorial de " + N + "= " + p.top());
					}
				}
			}
		}
		}
	}
}

