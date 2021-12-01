public class Duplicados {
    public static void main(String[] args) {
        int[] linea= new int[5];
        Utilidades.rellenaArray(linea,1,8);
        for (int i=0;i< linea.length;i++)
            System.out.print(linea[i]);
        System.out.println();

        for (int i = 0; i < linea.length; i++){

            for (int j=i+1;j< linea.length;j++){

                if (linea[i] == linea[j]){
                    System.out.println(linea[i]);
                }
            }
        }
    }
}
