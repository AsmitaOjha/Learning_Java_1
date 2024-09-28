package JavaPractice;
import java.util.LinkedList;
class LinkedListLearning{
    public static void main(String[] args){
        LinkedList<String> movies = new LinkedList<>();
        //add elements
        movies.add("Forest Gump");
        movies.add("the lost");
        movies.add("haha");

        System.out.println("LinkedList: "+ movies);
        //add elements at specified index
        movies.add(2,"Moonlight");
        System.out.println(movies);
    }
}