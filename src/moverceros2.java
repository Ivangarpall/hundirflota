public class moverceros2 {
    public static void main(String[] args) {
        int [] vector= new int[5];
        Utilidades.rellenaArray(vector,-1,5);
        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i]);
        System.out.println();
        int []posicion=new int[5];
        int []vector2=new int[5];
        for (int i = 0; i < vector.length; i++){
            if (vector[i]!=0){
                posicion[i]=1;
            }
            else posicion[i]=0;
        }
        int numeros=-1;
        for (int i = 0; i < vector.length; i++){
        if (posicion[i]!=0){
            numeros++;
            vector2[numeros]=vector[i];
        }
        }

        for (int i = 0; i < vector.length; i++)
            System.out.print(vector2[i]);
        System.out.println();
        for (int i = 0; i < vector.length; i++)
            System.out.print(posicion[i]);
    }
}
