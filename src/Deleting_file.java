import java.io.File;

class Deleting{
    public static void main(String[] args){
        File file = new File("src/message.txt");
        try{
            boolean value = file.delete();
            if(value){
                System.out.println("The file is deleted");
            }
            else{
                System.out.println("the file is not deleted");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}