package RefatoracaoDesafioDistancias;

public class Resolucao {

	static void DistanciaFinal(Eixo x, Eixo y, Ponto a, Ponto b) {
		
		double distanciadoEixoX = x.distanciaEntreEixo(a.posicaoX, b.posicaoX);
		double distanciadoEixoY = y.distanciaEntreEixo(a.posicaoY, b.posicaoY);
		double distanciaFinal = Math.sqrt(distanciadoEixoX + distanciadoEixoY);
		System.out.println("Distância entre pontos : " + distanciaFinal); 
	}
}
