package academy.devdojo.maratonajava.javacore.Oexception.excepion.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoAequivo();
    }

    private static void criarNovoAequivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
