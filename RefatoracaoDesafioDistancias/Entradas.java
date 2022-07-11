package RefatoracaoDesafioDistancias;

import java.util.Scanner;

public class Entradas {
	
	static void entradaDeDados(Ponto a, Ponto b) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o posição de A no eixo x: ");
		a.posicaoX = scan.nextDouble();
		
		System.out.print("Informe o posição de A no eixo Y: ");
		a.posicaoY = scan.nextDouble();
		
		System.out.print("Informe o posição de B no eixo x: ");
		b.posicaoX = scan.nextDouble();
		
		System.out.print("Informe o posição de B no eixo Y: ");
		b.posicaoY = scan.nextDouble();
		
		scan.close();
	}

}
