package ee.tptlive.test.playground;

public class Main {

    public static void main(String[] args) {
        printDiscount(5, Status.COMMON);
        printDiscount(10, Status.COMMON);
        printDiscount(20, Status.COMMON);
        printDiscount(20, Status.STUDENT);
        printDiscount(30, Status.COMMON);
        printDiscount(30, Status.DISABLED);
        printDiscount(40, Status.COMMON);
        printDiscount(100, Status.COMMON);
    }

    public static void printDiscount(int age, Status status) {
        double discount = DiscountFactory.get(age, status);
        System.out.printf("Age: %3d; Status: %-8s; Discount: %3.0f%%\n", age, status, discount * 100);
    }

}
