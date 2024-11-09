package JavaPractice;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       //implicit type casting
        int x =1;
        x = x+2;
        System.out.println(x);
        //explicit type casting
        double p = 2.3;
        int z = (int)p + 5;
        System.out.println(z);
        //for incompatible types: using
        //for all primitive types we have learned we have wrapper classes
        //In Java we have a class which is a reference type called integer this class
        // is defined in Java the Lang package and in this class we have a method called
        // parseInt() so this method takes a string and return an integer.
        // So integer is the wrapper class for the int primitive type.
        // we also have short and in this class we have parse short so it takes a string and
        //return a short similarly we have float, double .
        String d = "4";
        int g = Integer.parseInt(d) + 78;
        System.out.println(g);
        //Math class
        int result = Math.round(6.999F);
        System.out.println(result);
        int greater = (int)Math.ceil(8.4F);
        System.out.println(greater);
        int randomNumber = (int) Math.round(Math.random()*100);
        System.out.println(randomNumber);
        //Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        //Array
        int[] numers = { 2,3,4,5,6,9,0};
        System.out.println(Arrays.toString(numers));
        System.out.println(numers.length);
        //Arrays have fixed length
        //Multidimensional array
        String[][] students = new String[2][3];
        students[0][0] = "1";
        students[0][1] = "Asmita";
        students[0][2] = "Ojha";
        //for multidimensional array use deepToString
        System.out.println(Arrays.deepToString(students));
        int[][] marks = {{ 2,3,4},{24,45,67}};
        System.out.println(Arrays.deepToString(marks));
        //Operator precedence
        NumberFormat Currency = NumberFormat.getCurrencyInstance();
        String result1 = Currency.format(12356783.234);
        System.out.println(result1);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String result2 = percentInstance.format(0.8453);
        System.out.println(result2);
        //methods chaining
        String myPercentage = NumberFormat.getPercentInstance().format(0.76);
        System.out.println(myPercentage);
        //user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You/'r name is : " + name);
        //user input second time
        Scanner ages = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are "+ age);


    }
}
