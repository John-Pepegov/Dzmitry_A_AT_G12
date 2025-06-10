package myproject.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import myproject.tests.junit.BookingRatingJUnitTest; // Импортируйте здесь все ваши тестовые классы

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BookingRatingJUnitTest.class // Укажите здесь все ваши тестовые классы
})
public class JUnitSuiteRunner {
    // Этот класс остается пустым, используется только для запуска тестов в Suite
}