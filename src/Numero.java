public class Numero {
	private int resultado;

	// Construtor
	public Numero(int valor) {
		this.resultado = valor;
	}

	// Método para verificar se o número é positivo ou negativo
	public String Verificacao() {
		if (this.resultado >= 0) {
			return "O número é positivo.";
		} else {
			return "O número é negativo.";
		}
	}

	// Getter e Setter
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int valor) {
		this.resultado = valor;
	}

	// Método principal para testes
	public static void main(String[] args) {
		Numero num1 = new Numero(20);
		Numero num2 = new Numero (-10);
		Numero num3 = new Numero(4);

		System.out.println(num1.Verificacao()); // O número é positivo.
		System.out.println(num2.Verificacao()); // O número é negativo.
		System.out.println(num3.Verificacao()); // O número é positivo.
	}
}
