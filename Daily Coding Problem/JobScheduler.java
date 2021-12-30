interface Callable {
    public void call();
}

class MyFunction implements Callable {
    @Override
    public void call() {
        System.out.println("Function action");
    }
}

public class JobScheduler {
    public static void scheduleJob(Callable f, int n) {
        try {
            Thread.sleep(n);
            f.call();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Callable func = new MyFunction();
        scheduleJob(func, 5000);
    }
}