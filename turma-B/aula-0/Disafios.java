import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Disafios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
          
        String pokemons [] = new String[tamanho];
        String pokemonsOrganizados [] = new String[tamanho];

        
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < tamanho; i++) {
           ar.add(leitor.nextLine()) ;
        }

        ar.sort(null);

        for (int i = 0; i < tamanho; i++){
            System.out.println(ar.get(i));
        }

       
    } 
}
    
