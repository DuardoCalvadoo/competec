public class data0209 {
    public static void main(String[] args) {
        
        // FUNCÃO 

        // retorna algum valor
        // todos são métodos
        // diminui a repetição de códigos

        // MÉTODO

        // ajuda no refatoramento de código
        // () chamando um método

        // void -> retornar nada, int retornar um int , objeto retornar um modelo 

        Competec();
        int lula = somaDeNumeros(5, 10);
        System.out.println(lula);
        multiplicação(7);
        String a = "eduardo";
        String b = "eduardo1";
        System.out.println(equalsIgnoreCase(a, b));
        System.out.println(equals(a, b));
    }
     public static void Competec(){
        System.out.println("COMPETOP!");
        }

        public static int somaDeNumeros (int n1, int n2){
            int soma = n1 + n2;
            return soma;
        } 
    
        public static void multiplicação(int número){
            for (int i = 1; i <= 10; i++){
                System.out.println(número * i);
            } 
        }
        public static boolean equalsIgnoreCase(String s1, String s2){
            String aux1 = s1.toLowerCase();
            String aux2 = s2.toLowerCase();
            return aux1.equals(aux2);
        }

     public static boolean equals(String nome1, String nome2){
            if(nome1.length() != nome2.length()){
                return false;
            }
            for (int i = 0; i < nome1.length(); i++) {
              if (nome1.charAt(i) != nome2.charAt(i)){
                return false;
              }
            }
        return true;
        
     }
}
