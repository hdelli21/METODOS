public class ARITMETICA {

	//Atributos
    double numero1;
    double numero2;
    double numero3;
    // Construtor padrão (sem parâmetros)
    
    ARITMETICA() {
    }
    // Construtor que recebe três números e os inicializa
    ARITMETICA(double numero1, double numero2, double numero3) {
   
        this.numero1 = numero1;
        this.numero1 = numero2;
        this.numero1 = numero3;

    }

    // Método para verificar a média aritmetica 
    double media() {

        return (this.numero1 + this.numero2 + this.numero3) / 3;
    }

    // Executando o método
    public static void main(String[] args) {
    	 // Cria um objeto ARITMETICA com os números 4, 12 e 9
        ARITMETICA Aritmetica = new ARITMETICA(4, 12, 9);
        // Calcula a média aritmética
        double resultado = Aritmetica.media();
        // Exibe o resultado da média
        System.out.println("A media é " + resultado);

    }

}