package OvO.Thread.MyExThread;

public class ThreadEx2 extends Thread{
    int x =0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            int temp =x;
           // System.out.println(Thread.currentThread().getName() +" " + temp);
            temp++;
            x = temp;
        }
    }

    public int getX(){
        return x;
    }
}
