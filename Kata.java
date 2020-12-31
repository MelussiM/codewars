public class Kata 
{

  public static String str;
  public static int toBinary(int n) 
  {
    //for(int i = 31; i >= 0; i++)
    //{
      //int k = n >> i;
      //if(k & 1)
        //return 1;
      //else
        //return 0;
    //}
    
    int bNum = 0;
    int cn = 0;
    while(n != 0)
    {
      int rem = n % 2;
      double c = Math.pow(10,cn);
      bNum += rem * c;
      n /= 2;
      
      cn++;
    }
    return bNum;
  }

}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class KataTest {
    @Test
    public void testToBinary() {
  		assertEquals(1, Kata.toBinary(1));
  		assertEquals(10, Kata.toBinary(2));
  		assertEquals(11, Kata.toBinary(3));
  		assertEquals(101, Kata.toBinary(5));
    }
}
