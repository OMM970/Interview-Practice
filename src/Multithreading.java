 class Threads implements Runnable{
    private String Taskname;
    public Threads(String Taskname){
        this.Taskname=Taskname;
    }

    @Override
    public void run() {
        for(int j=0;j<10;j++){
            System.out.println(Taskname + " Count" + j);
            try {
                Thread.sleep(1000);

            }
            catch (Exception e) {
                e.printStackTrace();

            }
        }

    }
}
public class Multithreading {
    public static void main(String[] args) {
        Thread t1 =    new Thread(new Threads("threads 1"));
        Thread t2 =    new Thread(new Threads("threads 1"));

        t1.start();
        t2.start();

        System.out.println("Task finished");
    }
}
