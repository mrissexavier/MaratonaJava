package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EstudanteTest {
    public static void main(String[] args) {
       Estudante estudante = new Estudante();
       estudante.nome = "Emily";
       estudante.idade = 20;
       estudante.sexo = 'F';


        System.out.println("Estudante");
        System.out.println("Nome: " +estudante.nome);
        System.out.println("Idade: " +estudante.idade);
        System.out.println("Sexo: " +estudante.sexo);

    }
}
