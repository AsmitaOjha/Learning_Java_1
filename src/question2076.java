import java.io.FileReader;
import java.io.IOException;

class question2076 {

    public static void main(String[] args) {
            char[] contents = new char[100];
        try {
            FileReader input = new FileReader("src/Test.txt");
            input.read(contents);
            System.out.println(contents);
            input.close();

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}