import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    Name thing = new Name();

    @Before
    public void before() {

    }

    @Test
    public void getRandomName() {
       String word =  thing.getRandomName();
       assertNotNull(word);

    }

    @Test
    public void getRandomPair() {
        String names = thing.getRandomPair();
        assertNotNull(names);

    }
}