package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

import java.lang.reflect.AnnotatedElement;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 21, "Aventura, comédia dramática, fantasia");
        anime.imprime();
    }
}
