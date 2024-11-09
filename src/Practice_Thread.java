class A extends Thread {
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Hello mammi 💓");
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0;i<50; i++){
            System.out.println("Hello Baba 💐");

        }
    }
}
public class Practice_Thread{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj2.setPriority(10);
        System.out.println(obj1.getPriority());
        //Starting both thread
        obj1.start();
        obj2.start();
    }
}