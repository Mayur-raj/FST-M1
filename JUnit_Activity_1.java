import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1Test {

    private static List<String> values;

    @BeforeEach
    void initializeList() {
        values = new ArrayList<>();
        values.add("alpha");
        values.add("beta");
    }

    @Test
    void verifyInsertOperation() {
        assertEquals(2, values.size());

        values.add("charlie");

        assertEquals(3, values.size());
        assertEquals("alpha", values.get(0));
        assertEquals("beta", values.get(1));
        assertEquals("charlie", values.get(2));
    }

    @Test
    void verifyReplaceOperation() {
        values.set(1, "charlie");

        assertEquals(2, values.size());
        assertEquals("alpha", values.get(0));
        assertEquals("charlie", values.get(1));
    }
}
