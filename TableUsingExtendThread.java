class TableUsingExtendThread {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 5 * i);
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 6 * i);
            i++;
        }
    }
}