package homework.people.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EngineerParameterizedConstructorJUnitTest.class,
        EngineerSettersGettersJUnitTest.class
})
public class JUnit4TestSuite {
}