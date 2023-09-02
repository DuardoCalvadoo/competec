import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    double media;
    double somaDasNotas;
        
        
    Scanner notas = new Scanner(System.in);
    double n1 = notas.nextDouble();
    double n2 = notas.nextDouble();
    double n3 = notas.nextDouble();
    double n4 = notas.nextDouble();
    
    
    somaDasNotas = (n1*2) + (n2*3) + (n3*4) + n4;
    media = somaDasNotas / (2 + 3 + 4 + 1);
    
    if (media >= 7){
        System.out.println("Media: " + media);
        System.out.println("Aluno aprovado.");
    } else if (media > 5.0 && media <= 6.9){
        System.out.println("Media: " + media);
        System.out.println("Aluno em exame.");
        double exame = notas.nextDouble();
        System.out.println("Nota do exame: " + exame);
        exame = exame + media;
        exame = exame / 2;
        if (exame >= 5){
           System.out.println("aluno aprovado.");
           System.out.println("Media final: " + exame);
        }
    } else{
        System.out.println("Media: " + media);
        System.out.println("Aluno reprovado.");
        
    }
    
        
        
    }
 
}
