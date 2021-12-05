class TableUsingRIThread {
    public static void main(String[] args) {
        Mythread1 obj1 = new Mythread1();
        Mythread2 obj2 = new Mythread2();
        Thread obj3 = new Thread(obj1);
        Thread obj4 = new Thread(obj2);
        obj3.start();
        obj4.start();
    }
}

class Mythread1 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 5 * i);
            i++;
        }
    }
}

class Mythread2 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 6 * i);
            i++;
        }
    }
}