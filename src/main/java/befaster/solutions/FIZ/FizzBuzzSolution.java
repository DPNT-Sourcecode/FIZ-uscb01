package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    
    
    }
    
    public String fizzbuzznumber(Integer num) {
    	if((num%3==0)&&(num%5==0))  {
    		return "fizz buzz";
    	} else if(num%3 == 0) {
    		return "fizz";
    	} else if(num%5 ==0) {
    		return "buzz";
    	} else 
    		return Integer.toString(num);
    }
    
    public boolean isDeluxe(Integer num2) {
    	if((num2%3==0) && (num2.toString().contains("3"))) {
    		return true;
    	} else if((num2%5==0) && (num2.toString().contains("5"))) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean isFake(Integer num3) {
    	if(num3%2 != 0) {
    		return false;
    	} else {
    		return true;
    	}
    }
}
