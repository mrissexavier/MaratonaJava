package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Mark");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }

    }
}
