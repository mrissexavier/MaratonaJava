package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Emily"; // String constant pool
        String nome2 = "Emily";

        // nome e nome2 estão fazendo referência a mesma String no pool de strings

        nome = nome.concat(" Xavier"); // nome += " Xavier"


        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Emily"); // não está no pool de strings está referenciando o Obj string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // comparando o obj com o valor dentro do pool de strings

    }
}
