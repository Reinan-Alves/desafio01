package RefatoracaoDesafioDistancias;

public class Sistema {

	public static void main(String[] args) {

		Eixo x = new Eixo();
		Eixo y = new Eixo();

		Ponto a = new Ponto();
		Ponto b = new Ponto();

		Entradas.entradaDeDados(a, b);
		Resolucao.DistanciaFinal(x, y, a, b);
	}

}
