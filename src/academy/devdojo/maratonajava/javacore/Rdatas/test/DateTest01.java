package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // conta o tempo a partir de milissegundos

        System.out.println(date.getTime()); // getTime retorna a data em milissegundos (Long)

        /*
        * Classe Date se tornou obsoleta, só é encontrada em sistemas legados.
        * Ela trabalha com Long, que representa milissegundos desde 01 de Jan de 1970
        * Praticamente todos os métodos dessa classe estão obsoletos.
        * */
    }
}
