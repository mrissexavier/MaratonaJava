package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nums = "12345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(nums.length());
        System.out.println(nums.substring(0,0));
        System.out.println(nome.trim()); // remove os valores em branco em uma String

    }
}
