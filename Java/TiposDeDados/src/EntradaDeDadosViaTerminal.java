import java.util.Scanner;

public class EntradaDeDadosViaTerminal {
	
	public static void main(String args[]) {

        // criar um mecanismo de entrada de dados via teclado no terminal
        Scanner sc = new Scanner(System.in);
        // aguardar a digita��o de um n�mero
        System.out.println("Digite um n�mero inteiro: ");
        int n = sc.nextInt();
        // exibir o dobro do n�mero digitado
        System.out.printf("O dobro do n�mero digitado �: %d \n", n*2);

        // obter um nome de rua
        System.out.println("Digite o nome da rua na qual voc� reside: ");
        String rua = sc.next();
        System.out.println("Voc� mora na rua " + rua);
    }
}
