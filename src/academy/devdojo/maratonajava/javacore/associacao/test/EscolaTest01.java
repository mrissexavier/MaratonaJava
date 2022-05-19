package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
