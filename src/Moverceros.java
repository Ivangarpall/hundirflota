public class Moverceros {
    public static void main(String[] args) {
        int[] vector = new int[6];
        Utilidades.rellenaArray(vector, -1, 4);
        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i]);
        System.out.println();
        int[] vector2 = new int[6];
        int ceros = 0;
       for (int i=0;i< vector.length;i++){
           if (vector[i]!=0){
               vector2[i]=vector[i];
           }
           else{vector2[i]=vector[i+1];}
       }


        for (int i = 0; i < vector.length; i++)
            System.out.print(vector2[i]);
    }}
