import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        //int tamanho = leitor.nextInt();

        // DISAFIOS VETORES ---------------------------------
        
        //int i = 10;

        /*while(i < 1000){
                i += 10;
        }*/

        /*for (int i = 10; i < 1000; i+= 10) {
            //System.out.println(i);
        */

        /*int numeros [] = new int [3];
        numeros [0] = 5;
        numeros [1] = 7;
        numeros [2] = 9;*/

        /* 
        int numeros [] = {5, 7, 9}; 

        int soma = numeros[0] + numeros[1] + numeros[2];
        System.out.println(soma); */

        
         /*int numeros [] = new int[3];
        

        for (int i = 0; i < 3; i++) {
            numeros [i] = leitor.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/  



        
        
        /*
        int arranjo [] = new int[tamanho];

        for (int i = 0; i < arranjo.length; i++) {
            arranjo[i] = leitor.nextInt();
        }
        for (int i = 0; i < arranjo.length; i++) {
             System.out.println(arranjo[i]);
        }
        
        int multiplica = 1;
        for (int i = 0; i < arranjo.length; i++) {
            multiplica *= arranjo[i];
        }

        System.out.println(multiplica);
            
        double media = 0;
        for (int i = 0; i < arranjo.length; i++) {
            media += arranjo[i];
        }
        
        media /= arranjo.length;
        System.out.println(media);*/





    /*
        int n [] = new int[tamanho];
        for (int i = 0; i < n.length; i++) {
            n[i] = leitor.nextInt();
        }

        int maior = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > maior){
                maior = n[i];
            }
        }
        int menor = n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i] < menor){
                menor = n[i];
            }
        }

        System.out.println(maior);
        System.out.println(menor);
        */



        //DISAFIO MATRIZES --------------------------------
        

      /* int linha = 2;
        int  coluna = 2;
        int [] [] tabela = {{ 4,6}, {1,7}};
        
        for (int i = 0; i < linha; i++) {

            for (int j = 0; j < coluna; j++) {
                System.out.print(tabela[i][j] + " " );
            }
            System.out.print(" ");
        }
        */

        int lin = 3;
        int col = 3;

        /* 
        int tabelaA [] [] = {{5, 7, 9}, {9, 10, 11}, {5, 6 , 9}};
        int tabelaB [] [] = {{8, 6 , 6}, {3, 3 , 2}, {9, 0 , 1}};
        int tabelaC [] [] = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                tabelaC [i] [j] = tabelaA [i][j] + tabelaB [i][j];
                
                }
            }
                for (int i = 0; i < lin; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(tabelaC[i][j] + " ");
                    }
                    System.out.println(" ");
                } */

        


                // Criar os as fileiras e os lugares e nossa matriz  

        int numfileira = 5;        
        int numlugares = 8;
        int cinema [] [] = new int [numfileira] [numlugares];

                // Criar os For's para mostrar os lugares ocupados e vazios

        for (int i = 0; i < numfileira; i++) {
            for (int j = 0; j < numlugares; j++) {
                cinema[i] [j] = 0;
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("quantos pedidos serão efetuados?");

        int pedidos = leitor.nextInt();

        for (int i = 0; i < pedidos; i++) {
            int fileira = leitor.nextInt();
            int lugar = leitor.nextInt();
            
        if (cinema[fileira] [lugar] == 0){
            cinema [fileira] [lugar] = 1;
            System.out.println("compra sucedida!");
        } else {
            System.out.println ("lugar ocupado! compra cancelada");
        }
    }


    }
}
            


    