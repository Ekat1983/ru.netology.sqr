
import com.sun.nio.sctp.Association;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest1 {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService1 service = new BonusService1();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
         assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService1 service = new BonusService1();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
         assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForZeroAmount() {
        BonusService1 service = new BonusService1();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
         assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNegativeAmount() {
        BonusService1 service = new BonusService1();

        // подготавливаем данные:
        long amount = -100000;
        boolean registered = true;
        long expected = -30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
         assertEquals(expected, actual);
    }

}
