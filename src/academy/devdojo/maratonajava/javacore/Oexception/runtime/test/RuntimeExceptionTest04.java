package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Dentro da IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Dentro da IllegalArgumentException");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Dentro da ArithmeticException");
        }
    }
}
