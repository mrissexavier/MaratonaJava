package academy.devdojo.maratonajava.javacore.construtores.test;


import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 21, "Aventura, comédia dramática, fantasia", "Productor IG");

        anime.imprime();
    }
}
