import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest skintGuest;
    private Guest richGuest;

    @Before
    public void before(){
        skintGuest = new Guest("Simon", 0.0);
        richGuest = new Guest("Claire", 100.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",skintGuest.getName());
        assertEquals("Claire", richGuest.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(0.0, skintGuest.getWallet(), 0.1);
        assertEquals(100.0, richGuest.getWallet(), 0.1);
    }


}
