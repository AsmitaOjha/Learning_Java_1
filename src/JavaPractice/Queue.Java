package JavaPractice;
import java.util.LinkedList;
class Queue{
    public static void main(String[] args){
        //create a linkedlist
        LinkedList<String> patient = new LinkedList<>();

        //add elements
        patient.add("Ram");
        patient.add("Shyam");
        patient.add("Hari");

        System.out.println("Original LinkedList: "+ patient);
        //removes element from the front: poll()
        patient.poll();
        System.out.println("Queue after poll():" + patient);

        //adds element at the back: offe()
        patient.offer("Laxman");
        System.out.println("Queue after offer(): "+ patient);


    }
}
