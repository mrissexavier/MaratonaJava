package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 146;
        professor.sexo = 'M';

        System.out.println("Professor");
        System.out.println("Nome: " +professor.nome);
        System.out.println("Idade: " +professor.idade+ " anos");
        System.out.println("Sexo: " +professor.sexo);

    }
}
