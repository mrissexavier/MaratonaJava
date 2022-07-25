package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        /*
        * Classes Wrappers irão encapsular os tipos primitivos e transforma-los em objetos
        * */

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");

    }
}
