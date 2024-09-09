public class MainVetores {
    public static void main(String[] args) {

        System.out.println("----- VETORES DE OBJETOS ------");

        /*
         O vetor possui um atributo público denominado length o qual fornece a quantidade de elementos contidos no vetor.
         Não é possível alterar o valor desse atributo.
         O atributo length é comumente utilizado para varrer vetores.
        */

        int i;
        int n [] = {5,10,15,20};

        for (i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}