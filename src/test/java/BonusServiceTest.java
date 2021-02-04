import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount =26_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount =26_000_60;
        boolean registered = false;
        long expected = 260;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
    @Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount =2_600_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
}

