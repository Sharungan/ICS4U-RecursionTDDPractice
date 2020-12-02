package RecursionTDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RecursionTDD.Group1;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group1Test{

    /**
     * An initial test
     */
    @Test
    public void Test1() {
        // make assertion statement(s)
        //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
        assertEquals(0, Group1.triangle(0));
    }
    
    @Test
    public void Test2() {
        // make assertion statement(s)
        //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
        assertEquals(1, Group1.triangle(1));
    }
    // add more tests
}
