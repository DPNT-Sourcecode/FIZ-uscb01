package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    
    	if((number%3==0) && (number%5==0)) {
    		if((number.toString().contains("3")) && (number.toString().contains("5"))) {
    			if(number%2 != 0) {
    				return "fizz buzz fake deluxe";
    			}
    			return "fizz buzz deluxe";
    		}
    		return "fizz buzz";
    	} else if((number%5==0) && (number.toString().contains("5"))) {
    		if(number%2 != 0) {
				return "buzz fake deluxe";
			}
			return "buzz deluxe"; 		
    	} else if((number%3==0) || (number.toString().contains("3"))) {
    		if((number%5==0) || (number.toString().contains("5"))) {
    			return "fizz buzz";
    		} else if((number%3==0) && (number.toString().contains("3"))) {
    			if(number%2 != 0) {
    				return "fizz fake deluxe";
    			}
				return "fizz deluxe";
			}
    		return "fizz";
    	} else if((number%5==0) || (number.toString().contains("5"))) {
    		if((number%5==0) && (number.toString().contains("5"))) {
    			if(number%2 != 0) {
    				return "buzz fake deluxe";
    			}
				return "buzz deluxe";
			}
    		return "buzz";
    	} else {
    		return Integer.toString(number);
    	}
    	
    	    	
    }
    

}
