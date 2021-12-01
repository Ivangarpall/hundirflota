import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {

        int[] linea= new int[5];
        Utilidades.rellenaArray(linea,1,8);
        Scanner reader= new Scanner(System.in);
        int cambio= reader.nextInt()-1;
        for (int i=0; i< linea.length;i++) System.out.print(linea[i]);
        if (cambio>=5){
            System.out.println("vuelva a intrducir parametro");
            cambio= reader.nextInt()-1;
        }
        int y=linea[cambio];

        for (int i=cambio; i< linea.length; i++) {
            linea[i] = linea[i+1];
        }
        linea[4]=y;
            }

    }

