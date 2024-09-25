
public class AB {
	// Atributos de 'a' e 'b'
    int a;
    int b;
    // Construtor padrão (sem parâmetros)
    AB() {
    }
 // Construtor que recebe os valores de 'a' e 'b'
    AB(int a, int b) {
        this.a = a;
        this.b = b;
    }
// Método que retorna a^b
   double ab() {
        return Math.pow(this.a, this.b);
    }

    public static void main(String[] args) {
    	   // Cria um objeto AB com 'a' igual a 10 e 'b' igual a 2
        AB AB = new AB(10, 2);
        // Exibe o resultado de 'a' elevado a 'b'
        System.out.println("Resultado de a^b: " + AB.ab());
    }
}
