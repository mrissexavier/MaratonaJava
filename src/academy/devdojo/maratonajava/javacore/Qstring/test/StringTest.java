package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Emily";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Emily Xavier");

        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(3,5);
        System.out.println(sb);




    }
}
