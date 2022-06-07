public class Test{

  public static void main(String[] args)
       {
    
	  System.out.println("hello beautiful world");
	  int[] myNumbers = {1,2,3,4,5};
	  System.out.println("my array length is " + myNumbers.length); 
          
	  System.out.println("The average of my array is : " + findAverage(myNumbers));
  
  	}


        private static double findAverage(int[] values)
	          
      		{
            double result = 0;
			int len = values.length;
		    for (int i = 0; i < len ; i++)
	      		 {	
	          	 result += values[i];

	       
	      		 }
	    	   return result/len;
	  }



}
