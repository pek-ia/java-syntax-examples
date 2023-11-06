import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream is = System.in;


        int character;
        while (true){
            try {
                if (((character = is.read()) == -1)) break;
                else {
                    char c = (char)character;
                    System.out.println("Input = " + c);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
