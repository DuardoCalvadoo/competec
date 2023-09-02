import java.util.Scanner;

public class data2608 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        /* String competec = "ComPeTeC";
        String competecArrumado = competec.toLowerCase();
        System.out.println(competecArrumado.substring(0, 1).toUpperCase() + competecArrumado.substring(1));
        
        String nome1 = leitor.nextLine();
        String nome2 = leitor.nextLine();
        if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("É igual!");
        } else{
            System.out.println("Nao é igual!");
        } 
        while(true){
            System.out.println("Digite seu nome!, se quiser sair só digitar `sair`");
            String nomeTeste = leitor.nextLine();
            if (nomeTeste.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println("Digite mais um nome ai!");
            String nomeTeste2 = leitor.nextLine();
            if (nomeTeste.equalsIgnoreCase(nomeTeste2)){
                System.out.println("Sao iguais!");
            } else {
                System.out.println("Sao diferentes!");
            }
        } */
        /*
        String frase = "só sei que nada sei!";
        String separado [] = frase.split(" ");
        System.out.println(separado[1]);    
        
        for (int i = 0; i < separado.length; i++) {
            if(!separado[i].equals("")){
                System.out.print(separado[i] + " ");
            }
        }

        //disafio 1
        String usuarioEntrada = leitor.nextLine();
        int contadorDeVogais = 0;
        for (int i = 0; i < usuarioEntrada.length(); i++) {
            char caracter = usuarioEntrada.charAt(i);
            if( caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ){
                contadorDeVogais++;
            }
        }  */


        //disafio 2
        String usuarioEntrada2 = leitor.nextLine();
        for (int i = usuarioEntrada2.length() - 1;i >= 0; i--) {
            System.out.print(usuarioEntrada2.charAt(i));
        }
       
        
        //disafio 3
/* 
        String fraseEntrada = leitor.nextLine();
        int contadorPalavras = 0;
        System.out.println("Qual palavra deseja verificar?");
        String palavara = leitor.nextLine();
        String separadocontagem [] = fraseEntrada.split(" ");
        for (int i = 0; i < separadocontagem.length; i++) {
            if (separadocontagem[i].equals(palavara)){
                contadorPalavras++;
            }
        }
        System.out.println(contadorPalavras);
*/
        //disafio 4

        String cpf = leitor.nextLine();
        if (cpf.length() > 11 || cpf.length() < 11 ){
            System.out.println("número incorreto");
        }else{
            System.out.println(cpf.substring(0,3) + "." + cpf.substring(3,6 ) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9));
        }
        


    }
}
