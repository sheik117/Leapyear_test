import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leapYearTest {


    @Test
    void test_verify_year_is_divisible_by_4_but_not_100() {
        assertTrue(LeapYear.isLeapYear(4));
    }

    @Test
    void test_verify_year_is_divisible_by_400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    void test_verify_year_is_not_divisible_by_4() {
        assertFalse(LeapYear.isLeapYear(5));
    }

    @Test
    void test_verify_year_is_divisible_by_100_but_not_400() {
        assertFalse(LeapYear.isLeapYear(2100));
    }
}