class First implements Runnable{
    public void run(){
        for(int i=0; i<50;i++){
            System.out.println("Hello Dora");
        }
    }
}
class Second implements Runnable{
    public void run(){
        for(int i=0; i<50;i++){
            System.out.println("Hello Monkey");

        }
    }
}
public class Runnable_Thread_Example{
    public static void main(String[] args){
        First task1 = new First();
        Second task2 = new Second();

        //wrapping the runnable objects inside thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        //starting both threads
        t1.start();
        t2.start();
    }
}