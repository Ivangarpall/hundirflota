import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("introduzca sumatorio");
        int suma= reader.nextInt();
        int [] linea= new int[6];
        Utilidades.rellenaArray(linea,1,8);
        for (int i=0;i< linea.length;i++)
            System.out.print(linea[i]);
        System.out.println();
        for (int i=0; i< linea.length-1;i++){
            for (int j=i+1;j< linea.length;j++){
                if(linea[i]+linea[j]==suma){
                    System.out.println(linea[i]+"y"+linea[j]);
                }
            }
        }
    }
}
