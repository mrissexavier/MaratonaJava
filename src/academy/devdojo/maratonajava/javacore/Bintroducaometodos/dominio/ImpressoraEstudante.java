package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("---------------------------");

        System.out.println("Estudante");
        System.out.println("Nome: " +estudante.nome);
        System.out.println("Idade: " +estudante.idade);
        System.out.println("Sexo: " +estudante.sexo);


    }
}
