public class rellenaMatriz {
    public static void main(String[] args) {
        int[][] matriu= new int[10][10];
        for (int i=0;i< matriu.length;i++){
           for (int j=0;j< matriu.length;j++){
               matriu[i][j]= (int)(Math.random()*2);
           }

            }
        for (int i=0;i< matriu.length;i++){
            for (int j=0;j< matriu.length;j++){
                System.out.print( matriu[i][j]);
            }
            System.out.println();
        }
    }}

