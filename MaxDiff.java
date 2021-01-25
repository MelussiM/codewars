//You must implement a function that return the difference between the biggest and the smallest value in a list(lst) received as parameter.

//The list(lst) contains integers, that means it may contain some negative numbers.

//If the list is empty or contains a single element, return 0.

//The list(lst) is not sorted.

//maxDiff([1, 2, 3, 4]); // return 3, because 4 - 1 == 3
//maxDiff([1, 2, 3, -4]); // return 7, because 3 - (-4) == 7

public class MaxDiff 
{

  public static int maxDiff(int[] lst) 
  {
    int max = 0;
      //for(int i = 0; i < lst.length; i++)
      //{//}
      if(lst.length > 0)
      {
         return getMax(lst) - getMin(lst);
      }
    else
      return 0;
  }
  
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
