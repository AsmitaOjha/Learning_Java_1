// Replace ___ with your code
package JavaPractice;
import java.util.LinkedList;
import java.util.Scanner;

class LQueue {
    public static void main(String[] args) {

        // create a LinkedList of Integer type
        LinkedList<Integer> numbersList = new LinkedList<>();

        // add elements to numberList
        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(15);


        // remove element from the front
        numbersList.poll();

        // take an integer input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int number = input.nextInt();

        // add the user input to the end of numberList
        numbersList.offer(number);

        // print numbersList
        System.out.println(numbersList);

        input.close();
    }
}