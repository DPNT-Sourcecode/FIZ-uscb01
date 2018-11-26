package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    
    
    }
    
    public String fizzbuzz(Integer num) {
    	if((num%3==0)&&(num%5==0))  {
    		return "fizz buzz";
    	} else if(num%3 == 0) {
    		return "fizz";
    	} else if(num%5 ==0) {
    		return "buzz";
    	} else 
    		return Integer.toString(num);
    }
}
