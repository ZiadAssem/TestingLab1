import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {

    @Test
    void TenReturnYes(){
        assertEquals("YES",Watermelon.Divider(10));
    }
    @Test
    void TwoReturnNO(){
        assertEquals("NO",Watermelon.Divider(2));
    }
    @Test
    void NineReturnNO(){
        assertEquals("NO",Watermelon.Divider(9));
    }
}