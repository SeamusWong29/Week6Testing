package org.rmit.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration (
//following are REQUIRED
        url = "https://rmit.spiraservice.net/",
        login = "S4101434",
        rssToken = "{20A64CF1-FAC6-436C-94A6-328A3DFBCBAC}",
        projectId = 1256
//following are OPTIONAL
        //  releaseId = 7,
        //  testSetId = 1
)

public class GradeCalculatorTest {

    GradeCalculator gradeCalculator = new GradeCalculator();

    @Test
    @SpiraTestCase(testCaseId = 46707)
    public void score75ReturnsD() { assertEquals("D", gradeCalculator.convertToGrade(75));
    }


    //Analyze statement and branch coverage.
    //Let's now improve statement coverage. Uncomment the tests in the next sesion


   /* @Test
    void score40ReturnsN() {
        assertEquals("N", gradeCalculator.convertToGrade(40));
    }

    @Test
    void score55ReturnsP() {
        assertEquals("P", gradeCalculator.convertToGrade(55));
    }

    @Test
    void score65ReturnsC() {
        assertEquals("C", gradeCalculator.convertToGrade(65));
    }


    @Test
    void score85ReturnsH() {
        assertEquals("H", gradeCalculator.convertToGrade(85));
    }*/




    //Quite an improvement in the coverage. Right?
    //Let's cover first condition
    /* @Test
        void negativeScoreThrowsException() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> gradeCalculator.convertToGrade(-1)
            );
        }*/





    //100% Statement coverage!!! Feels good :)
    //But wait... what about branch coverage?
    //Analyze line vs branch coverage. What is missing?

/*    @Test
    void aboveHundredScoreThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> gradeCalculator.convertToGrade(101)
        );
    }*/
}