public class NUMEROMAIOR {
	// Atributos
	int numero1;
	int numero2;
	int numero3;

	// Construtor padrão sem parâmetros
	NUMEROMAIOR() {
	}

	// Construtor que recebe três números como parâmetros
	NUMEROMAIOR(int numero1, int numero2, int numero3) {
		// Inicializa os atributos com os valores fornecidos
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;

	}

	// Método para encontrar o maior número
	int Nummaior() {
		// Assume que o primeiro número é o maior inicialmente
		int maior = this.numero1;
		// Compara com o segundo número e atualiza o maior se necessário
		if (this.numero2 > this.numero1) {
			this.numero1 = this.numero2;// Corrigido para armazenar o maior corretamente

		}
		// Compara com o terceiro número e atualiza o maior se necessário

		if (this.numero3 > this.numero1) {
			this.numero1 = this.numero3;

		}
		return maior;// Retorna o maior número encontrado
	}

	public static void main(String[] args) {
		// Cria uma instância da classe NUMEROMAIOR com três números
		NUMEROMAIOR Numeromaior = new NUMEROMAIOR(20, 10, 15);
		// Imprime o maior número encontrado
		System.out.println("O maior número é: " + Numeromaior.Nummaior());

	}
}
