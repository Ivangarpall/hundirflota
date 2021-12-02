public class valoresAcero {
    public static void main(String[] args) {
        int[][] matriu = new int[10][10];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                matriu[i][j] = (int) (Math.random() * 2);
            }

        }
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                System.out.print(matriu[i][j]);
            }
            System.out.println();
        }
        int columnascero = 0;
        int filascero = 0;
        for (int i = 0; i < matriu.length; i++) {
            int sumafil=0;
            for (int j = 0; j < matriu.length; j++) {
                if(matriu[i][j]==0){sumafil++;}
                if(sumafil==matriu.length-1)filascero++;
            }
        }
        for (int i = 0; i < matriu.length; i++) {
            int sumacol=0;
            for (int j = 0; j < matriu.length; j++) {
                if(matriu[j][i]==0){sumacol++;}
                if(sumacol==matriu.length-1)columnascero++;
            }
        }

        System.out.println("hay columnas a cero "+columnascero);
        System.out.println("hay filas a cero "+filascero);
    }
}
