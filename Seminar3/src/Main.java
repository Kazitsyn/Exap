import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        try {
            counter.add();
        }catch (IOException e){
            System.err.println(".getMessage()");
        }
    }
}