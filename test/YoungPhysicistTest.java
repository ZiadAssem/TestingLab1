import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YoungPhysicistTest {

    @Test
    void returnYes(){
        int array[][]={{3,-1,7},{-5,2,-4},{2,-1,-3}};
        assertEquals("YES",YoungPhysicist.isIdle(array));
    }
    @Test
    void returnNo(){
        int array[][]={{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertEquals("NO",YoungPhysicist.isIdle(array));
    }
}