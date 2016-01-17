package distance.tdd;
import static org.junit.Assert.*;
import org.junit.Test;

public class DistanceTest {

    @Test
    public void Mile_Equals() {
        assertTrue(new Mile(3).equals(new Mile(3)));
        assertFalse(new Mile(3).equals(new Mile(4)));
    }

    @Test
    public void Yard_Equals() {
        assertTrue(new Yard(4).equals(new Yard(4)));
        assertFalse(new Yard(4).equals(new Yard(5)));
    }

    @Test
    public void Distance_MileCompareToYard() {
       assertTrue(new Mile(1).equals(new Yard(1760)));
       assertFalse(new Mile(1).equals(new Yard(1761)));
    }

    @Test
    public void Convert_Mile () {
        Mile mile = DistanceMetric.ConvertToMile(new Yard(1760));
        assertTrue(new Mile(1).equals(mile));
    }

    @Test
    public void Distance_Add() {
        assertTrue(new Mile(3).Add(new Mile(5)).equals(new Mile(8)));
        assertTrue(new Yard(3).Add(new Yard(5)).equals(new Yard(8)));
        assertTrue(new Yard(1).Add(new Mile(1)).equals(new Yard(1761)));
    }
}
