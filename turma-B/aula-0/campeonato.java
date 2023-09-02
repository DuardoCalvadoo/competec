import java.util.Scanner;

public class campeonato  {
    public static void main(String[] args) {

        //DISAFIO 1
        /*int vetor [] = new int[] {-2, -6, 10, 12, 5, 7, -9, 2, 4, 8};
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
        }
            for (int j = 0; j < vetor.length; j++) {
                System.out.printf("X[%d] = %d\n", j, vetor[j]);
            }*/
    
        //DISAFIO 2

        Scanner leitor = new Scanner(System.in);

        /*
        int N = leitor.nextInt();
        
        int vitor [] = new int [N];
        
        for ( int i = 0; i < N; i++) {
           vitor[i] = leitor.nextInt();
        }
        int menor  = vitor[0];
        int posicao = 0;

        for (int j = 0; j < N; j++) {
            if (vitor[j] < menor){
                menor = vitor[j];
                posicao = j;
            }
        }
        System.out.println("Menor valor:" + menor);
        System.out.println("Posicao:" + posicao); */

// DISAFIO 3

    int linha = leitor.nextInt();
    int coluna = leitor.nextInt();
    System.out.println();
    

    int M [] [] = new int[linha][coluna];

    for (int i = 0; i < linha; i++) {
        for (int j = 0; j < coluna; j++) {
            M [i][j] = leitor.nextInt();
        }
    }
    for (int i = 0; i < linha; i++) {
        for (int j = 0; j < coluna; j++) {
           System.out.print(M[i][j] + " ");
        }
    System.out.print(" ");
    }

    
    /*int l = leitor.nextInt();
    int soma = 0;
    for (int i = l;){
        for(int j = 0; j < coluna; j++){
        soma = m[j] + m[j + 1]
        }
    
    } */

       
    // DISAFIO 4
    /* 
    int tamanho = leitor.nextInt();
    int relampagoMarquinhos [] = new int[tamanho];


    for (int j = 0; j < tamanho; j++) {
        relampagoMarquinhos[j] = leitor.nextInt();
    }

    int maior = relampagoMarquinhos[0];
    for (int i = 0; i < tamanho; i++) {
        if (relampagoMarquinhos[i] > maior){
            maior = relampagoMarquinhos[i];
            if ( maior >= 20){
    System.out.println(3);
   }else if(maior >= 10){ 
    System.out.println(2);
   }else{
    System.out.println(1);
   }
    }
        }
*/




    }
}
