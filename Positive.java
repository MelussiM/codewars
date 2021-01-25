public class Positive{

  public static int sum(int[] arr)
  {
    
    int sum = 0;
    if(arr.length == 0)
    {
      return 0;
    }
    else  
    {
      for(int i = 0; i < arr.length; i++)
      {
        if(arr[i] > 0)
        {
        
          sum = sum + arr[i];
        
        }
        
      }
    }
    return sum;
  
  }
  
  

}
