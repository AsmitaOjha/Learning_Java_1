import java.io.FileWriter;
import java.io.IOException;

class Writer {
    public static void main(String[] args){
        String data = "I am loved. He love me. He is with me.";
        try{
            FileWriter A = new FileWriter("I_am.text");
            A.write(data);
            System.out.println("Data is written to the file");
            A.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}