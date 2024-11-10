import java.io.File;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        File f1 = new File("Asmita.txt");
        try{
            boolean value = f1.createNewFile();
                if(value){
                    System.out.println("The next file 'Asmita.txt' created.");
                }
                else{
                    System.out.println("The file already exists");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}