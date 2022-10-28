import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/*
@author Pavithra Moravaneni
 */
class UrinalsTest {

    @Test
    void main() {
        assertEquals("Hello World", "Hello World");
    }

    @Test
    void testGoodExample() {
        System.out.println("====== Pavithra Moravaneni == TEST ONE EXECUTED =======");
        boolean val = true;
        boolean output = Urinals.goodExample("Not yet implemented");
        //assertEquals(val, output);
        assertTrue(output);

    }

    @Test
    void sum() {
        System.out.println("====== Pavithra Moravaneni == TEST TWO EXECUTED =======");
        assertEquals(2, Urinals.sum(1, 1));
    }

    @Test
    void validString() {
        System.out.println("====== Pavithra Moravaneni == TEST THREE EXECUTED =======");
        //assertEquals("true", Urinals.validString("Hel1"));
        assertTrue(Urinals.validStringLength("Hel", 3));
    }


    @Test
    void multiply() {

        System.out.println("====== Pavithra Moravaneni == TEST FOUR EXECUTED =======");
        assertNotEquals(0, Urinals.multiply(1, 1));
    }


    @Test
    void urinalSequence() {
        System.out.println("====== Pavithra Moravaneni == TEST FIVE EXECUTED =======");
        String s1 = "011";
        assertEquals(-1, Urinals.UrinalSequence(s1));
        assertEquals(3,Urinals.UrinalSequence("00000"));
    }

    @Test
    void readFile() {
        System.out.println("====== Pavithra Moravaneni == TEST SIX EXECUTED =======");
        Urinals.readFile();
    }

    @Test
    void testReadEmptyFile() {
        System.out.println("====== Pavithra Moravaneni == TEST SEVEN EXECUTED =======");
        File file = new File("src/main/java/urinal.dat");
        assertTrue(file.length()>0);
    }

    @Test
    void testReadFileException() throws IOException {
        System.out.println("====== Pavithra Moravaneni == TEST EIGHT EXECUTED =======");
        File file = new File("src/main/java/urinal.dat");
        assertTrue(file.exists());
    }


//    @Test
//    void writeFile() {
//        System.out.println("====== Pavithra Moravaneni == TEST SEVEN EXECUTED =======");
//            Urinals.writeFile();
//
//    }

//    @Test
//    void testMain() {
//       // String s1 = Urinals.readFile();
//       // Urinals.UrinalSequence(s1);
//        Urinals.writeFile();
//    }
}
