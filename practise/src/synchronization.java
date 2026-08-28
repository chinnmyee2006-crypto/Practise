class counter{
    private int count=0;

    public void increment(){
        count++;
    }
    public int getcount(){
        return count;
    }
}

class ThreadDemo extends Thread{
    public void run(){
        }
    }

public class synchronization{
    public static void main (String[] args){
        counter counter=new counter();
        ThreadDemo t1=new ThreadDemo(counter);
        ThreadDemo t2=new ThreadDemo(counter);

        t1.start();
        t2.start();

        System.out.println("final count:"+counter.getcount());
    }

}