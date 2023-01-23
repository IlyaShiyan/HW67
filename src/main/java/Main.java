import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a ,b;
        Scanner scanner = new Scanner(System.in);

        try {
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a/b);

        }catch (ArithmeticException arithmeticException){
            System.out.println("Not 0");
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Enter number");
        } catch (Exception e){
            System.out.println("Big trouble");
        }
        
    }
}
