
public class TiposDeDados {
	public static void main(String args[]) {

        // armazenar uma informa��o em uma vari�vel do tipo texto
        String nome = "Jo�o Paulo da Silva";
        // exibir a informa��o
        System.out.println("O nome �: " + nome);

        // calcular a soma de tr�s n�meros
        int a = 5;
        int b = 6;
        int c = 11;
        int total = a + b + c;
        // exibir a soma
        System.out.printf("Prezado %s, a soma de %d, %d e %d �: %d\n",
            nome, a, b, c, total);

        // calcular uma nota m�dia
        double av1 = 7.5;
        double av2 = 8; // poderia ser 8.0
        double media = (av1 + av2) / 2; // m�dia aritm�tica
        System.out.printf("M�dia entre %.2f e %.2f � %.2f\n", av1, av2, media);
    }
}
