public class Iguales {
    public static void main(String[] args) {
        int[] vector1= new int[5];
     int[] vector2=new int[5];
     Utilidades.rellenaArray(vector1,1,8);
     for (int i=0;i< vector1.length;i++){
         vector2[i]=vector1[i];
     }
     for (int i=0; i< vector2.length; i++){
         if (vector1[i]!=vector2[i]){
             System.out.println("estos dos vectores no son iguales");
             break;
         }

     }
        System.out.println("los vectores son iguales");

    }


}
