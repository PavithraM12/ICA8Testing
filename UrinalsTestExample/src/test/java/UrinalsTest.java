import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void main() {
        assertEquals("Hello World","Hello World");
    }

    @Test
    void testGoodExample() {
        System.out.println("====== Pavithra Moravaneni == TEST ONE EXECUTED =======");
        boolean val=true;
        boolean output = Urinals.goodExample("Not yet implemented");
        assertEquals(val, output);

    }

    @Test
    void sum() {
        System.out.println("====== Pavithra Moravaneni == TEST TWO EXECUTED =======");
        assertEquals(2, Urinals.sum(1,1));
    }
}