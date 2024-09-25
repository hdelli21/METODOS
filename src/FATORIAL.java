public class FATORIAL {

	// Atributos
	int numero;

	// // Construtor verifica se o número é válido.
	public FATORIAL(int numero) {
		// Se o número for negativo.
		if (numero < 0) {
			throw new IllegalArgumentException("O número deve ser não negativo.");
		}
		// Armazena o número no atributo da classe
		this.numero = numero;
	}

	// Método que calcula o fatorial do número
	public int calcular() {
		// Variável que vai guardar o resultado do fatorial
		int fatorial = 1;
		// Faz a multiplicação de 1 até o número para calcular o fatorial
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		// Retorna o resultado do fatorial
		return fatorial;
	}

	// Método principal para rodar o programa
	public static void main(String[] args) {
		// Cria um objeto FATORIAL para o número 5
		FATORIAL fatorial = new FATORIAL(5);
		// Mostra o fatorial do número no console
		System.out.println("O fatorial de " + fatorial.numero + " é " + fatorial.calcular());
	}
}
