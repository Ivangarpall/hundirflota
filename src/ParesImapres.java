public class ParesImapres {
    public static void main(String[] args) {
        int[] vector= new int[6];
        Utilidades.rellenaArray(vector,1,8);
        int par=0;
        int impar=0;
        for (int i=0;i< vector.length;i++){
            if (vector[i]%2!=0){
                impar++;
            }
            else par++;
        }
        System.out.println("hay "+par+" numeros pares");
        System.out.println("hay "+impar+" numeros imapres");
    }
}
