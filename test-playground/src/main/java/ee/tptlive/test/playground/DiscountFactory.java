package ee.tptlive.test.playground;

import static ee.tptlive.test.playground.Status.DISABLED;
import static ee.tptlive.test.playground.Status.STUDENT;
import static ee.tptlive.test.playground.Status.VIP;

public class DiscountFactory {

    private DiscountFactory() {
        // DiscountFactory instances should NOT be constructed
    }

    public static double get(int age, Status status) {
        // TODO: implememt
        return 0;
    }

}
