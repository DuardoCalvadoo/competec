import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número!");
        int n1 = leitor.nextInt();
        System.out.println("Informe o segundo número!");
        int n2 = leitor.nextInt();

        int resultado = n1 * n2;
        System.out.println("Resultado🤦‍♂️: " + resultado);
    }
}
