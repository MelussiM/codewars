public class NumberFun 
{
  public static long findNextSquare(long sq) 
  {
      long one = 2;
    long onee = 1;
    double pS = Math.sqrt(sq);
    //if((long)Math.floor((long)Math.sqrt(sq)) % one != 0)
    if((pS - (long)Math.floor(pS)) != 0)
    {
        
         return -1; 
    }
    else
    {
      //if(Math.sqrt(sq+1) % 1 != 0)
      //{
       long nextSq = (long)Math.floor((long)Math.sqrt(sq))+onee;
        return nextSq*nextSq;
       
      //}
      //sq++;
    } 
    //return sq;
  }
}
