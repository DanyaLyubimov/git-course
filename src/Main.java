public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, branch2");
        System.out.println("Hello, branch2");
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println(i);
                }
            }
        });
        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println(i);
                }
            }
        });
        myThread.start();
        myThread2.start();
    }
}