import java.io.FileWriter;
import java.io.IOException;

class File_writing{
    public static void main(String[] args){
        String data = "I am happy. He cares. He is with me.";
        try{
            FileWriter x = new FileWriter("I_am.text");
            x.write(data);
            System.out.println("Written to existing file");
            x.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}