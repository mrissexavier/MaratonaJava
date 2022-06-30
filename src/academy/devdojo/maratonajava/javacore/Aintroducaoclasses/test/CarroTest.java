package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca bala";
        carro1.modelo = "Sport";
        carro1.ano = 1998;

        carro2.nome = "Zafirinha do papai";
        carro2.modelo = "Sport";
        carro2.ano = 2002;

        System.out.println("Carros:");
        System.out.println();
        System.out.println("Nome: " +carro1.nome);
        System.out.println("Modelo: " +carro1.modelo);
        System.out.println("Ano: " +carro1.ano);
        System.out.println("===================================");
        System.out.println("Nome: " +carro2.nome);
        System.out.println("Modelo: " +carro2.modelo);
        System.out.println("Ano: " +carro2.ano);
    }
}
