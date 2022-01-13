import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AccountParametrizedTest {

        private final String name;
        private final boolean expectedResult;

        public AccountParametrizedTest (String name, boolean expectedResult) {
            this.name = name;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Object[][] getSumData(){
            return new Object[][]{
                    {"Тимоти Шаламе", true},
                    {"Т ш", true},
                    {"Т ", false},
                    {"Тимоти Шаламеееееее", true},
                    {"Тимоти Шаламееееееее", false},
                    {" ТимотиШаламе", false},
                    {"ТимотиШаламе ", false},
                    {"Тимоти Ша ламе", false},
                    {"", false},
            };
        }

        @Test
        public void nameShouldBeValid() {
            Account account = new Account(name);
            boolean result = account.checkNameToEmboss();
            assertEquals(expectedResult, result);
        }
    }
