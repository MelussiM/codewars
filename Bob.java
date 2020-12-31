public class Bob {
  public static int enough(int cap, int on, int wait){
  // your code here
    int finalTot = on + wait;
    if(finalTot > cap)
    {
      return on - wait;
    }
    else
      return 0;
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
    }
}
