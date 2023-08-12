package Task3;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            nonExistedFile("Path.of()");
        }catch (NonExistedFileException e){
            System.err.println(e.getMessage());
        }
    }
    private static void nonExistedFile(String s) throws NonExistedFileException{
        try {
            FileReader reader = new FileReader(s);
        }catch (IOException e) {
            throw new NonExistedFileException();
        }
    }
}
