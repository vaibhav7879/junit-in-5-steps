import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

    MyMath math =new MyMath();
    @Test
    void calculateSum_ThreeMemberArray() {

        //System.out.println(result);
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }
    @Test
    void calculateSum_ZeroMemberArray() {

        //System.out.println(result);
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}