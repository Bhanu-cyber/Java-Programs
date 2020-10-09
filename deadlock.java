// https://www.facebook.com/smkmallik/posts/3415890411793806
// Subscribed by CodeHouse

class DeadLockDemo {

    public void method1() {
            synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }

    public void method2() {
            synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
}
