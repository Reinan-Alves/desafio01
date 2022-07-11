package RefatoracaoDesafioDistancias;

public class Eixo implements Eixos {

	public Double distanciaEntreEixo(Double pontoA, Double pontoB) {
		
		double distancia = Math.pow(pontoA - pontoB, 2);
		
		return distancia;
		
	}
	
}
