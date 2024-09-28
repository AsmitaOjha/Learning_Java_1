package JavaPractice;
import java.util.LinkedList;

class Dqueue {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements using add()
        numbers.add(3);
        numbers.add(1);
        System.out.println("LinkedList: " + numbers);

        // add an element at the start
        numbers.addFirst(6);
        System.out.println("After addFirst(6): " + numbers);

        // add an element at the end
        numbers.addLast(8);
        System.out.println("After addLast(8): " + numbers);

        // remove the first element
        numbers.removeFirst();
        System.out.println("After removeFirst(): " + numbers);

        // remove the last element
        numbers.removeLast();
        System.out.println("After removeLast(): " + numbers);
    }
}