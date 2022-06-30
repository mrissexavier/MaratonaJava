package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double media = 0;
    private double[] salarios;

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
        if (salarios == null){
            return;
        }

        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia Salarial: "+media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
