import java.rmi.ServerError;
import java.util.Scanner;

public class Task0 {
    public double inDouble(){
        double res = 0;
        try {
            System.out.println("Введите дробное число: ");
            Scanner scanner = new Scanner(System.in);
            res = scanner.nextDouble();
            return res;
        }catch (Exception e){
            System.err.println("Ввели не дробное число");
            res = inDouble();
        }
        return res;
    }

}
