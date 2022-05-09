package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Mark";
        nomes[1] = "Emily";
        nomes[2] = "Jennifer";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
