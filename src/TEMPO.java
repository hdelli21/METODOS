
public class TEMPO {

	int minutoshora;

	// Construtor que recebe a quantidade de minutos
	TEMPO(int minutoshora) {
		this.minutoshora = minutoshora;
	}

	// Método que converte os minutos em horas e minutos
	public String HorasMinutos() {
		int horas = minutoshora / 60; // Calcula em horas
		int minutos = minutoshora % 60; // Calcula em minutos

		return horas + " hora(s) e " + minutos + " minuto(s)";
	}

	// Método principal para teste
	public static void main(String[] args) {
		TEMPO tempo = new TEMPO(150); // 150 minutos convertendo em horas e minutos
		System.out.println(tempo.HorasMinutos());
	}
}
