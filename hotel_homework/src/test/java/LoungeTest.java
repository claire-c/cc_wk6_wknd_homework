import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoungeTest {

    private Lounge lounge;

    @Before
    public void before(){
        lounge = new Lounge("Chillax");
    }

    @Test
    public void getName(){
        assertEquals("Chillax",lounge.getName());
    }

    @Test
    public void confirmLoungeEmpty(){
        assertEquals(0, lounge.getOccupants().size());
    }





}
