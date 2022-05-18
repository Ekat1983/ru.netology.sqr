package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @CsvSource(value =  {

            "200 | 300 | 3",
            "400 | 500 | 3",
            "200 | 500 | 8",
            "350 | 600 | 6"

    },
            delimiter = '|'
    )
    @ParameterizedTest(name = "Входные параметры: {0} {1} Ожидаемый результат: {2}")
    public void test(int min, int max, int expectedResult) {
        SQRService sqrService = new SQRService();

        Assertions
                .assertEquals(sqrService.calculateTheSquare(min, max), expectedResult);
    }


}
