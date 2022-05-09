package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //1, 2, 3, 4 (meses)
        // 28, 29, 30 (dias)

        int[][] dias = new int[12][12];
        dias [0][0] = 28;
        dias [0][1] = 29;
        dias [0][2] = 30;

        dias [1][0] = 28;
        dias [1][1] = 29;
        dias [1][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
