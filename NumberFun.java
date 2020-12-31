public class NumberFun 
{
  public static long findNextSquare(long sq) 
  {
      long one = 2;
      long onee = 1;
      double pS = Math.sqrt(sq);
      if((pS - (long)Math.floor(pS)) != 0)
      {
        return -1; 
      }
      else
      {
        long nextSq = (long)Math.floor((long)Math.sqrt(sq))+onee;
        return nextSq*nextSq;
      }
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }
    
    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }  
}
