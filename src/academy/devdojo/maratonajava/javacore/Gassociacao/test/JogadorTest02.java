package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Mark");
        Time time = new Time("Pelotas");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
