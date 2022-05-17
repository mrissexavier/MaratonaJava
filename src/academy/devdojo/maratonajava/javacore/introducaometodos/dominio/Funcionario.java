package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("Funcionário: ");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.print("Salários: ");
        for (double salario: salarios) {
            System.out.print(+salario + "; ");
        }
        imprimeMediaSalarial();
    }
    public void imprimeMediaSalarial(){
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salarial: "+media);
    }

}
