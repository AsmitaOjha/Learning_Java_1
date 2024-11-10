import java.io.FileReader;
import java.io.IOException;

class Reading_file{
    public static void main (String[] args) {
        char[] contents = new char[300];
        try {
            FileReader iRead = new FileReader("src/message.txt");
            iRead.read(contents);
            System.out.println(contents);
            iRead.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}