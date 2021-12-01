public class Comunes {
    public static void main(String[] args) {

        int[] linea1 = new int[5];
        int[] linea2 = new int[5];
        Utilidades.rellenaArray(linea1,1,8);
        Utilidades.rellenaArray(linea2,1,8);
        for (int i=0; i< linea1.length;i++) System.out.print(linea1[i]);
        System.out.println();
        for (int i=0; i< linea2.length;i++) System.out.print(linea2[i]);
        System.out.println();
        for (int i=0; i< linea1.length;i++){
            if (linea1[i]==linea2[i]){
                System.out.println(linea1[i]);
            }
        }
    }
}