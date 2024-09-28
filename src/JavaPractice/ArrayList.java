package JavaPractice;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asmita");
        names.add("Aastha");

        System.out.println(names);
        names.add(2,"Kapil");
        names.add(3,"Dudy");
        System.out.println(names);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int index = input.nextInt();
        String element = names.get(index);
        System.out.println(element);
        //access all elements
        for (int i=0;i<=2; ++i){
            System.out.println(names.get(i));
        }
        //change element at index 2
        names.set(2, "aadhaa");
        System.out.println("Updated Arraylist: " + names);


    }
}