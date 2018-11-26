package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    
    	if((number%3==0) || (number.toString().contains("3"))){
    		if((number%5==0) || (number.toString().contains("5"))){
    			if (isIdentical(number) && (number > 10)) {
    				if(number%2 !=0) {
    					return "fizz buzz fake deluxe";
    				}
    				return "fizz buzz deluxe";
    			}
    			return "fizz buzz";
    		} else {
    			if (isIdentical(number) && (number > 10)) {
    				if(number%2 !=0) {
    					return "fizz fake deluxe";
    				}
    				return "fizz deluxe";
    			}
    			return "fizz";
    		}
    	}
    		else if ((number%5==0) || (number.toString().contains("5"))){
    			if (isIdentical(number) && (number > 10)) {
    				if(number%2 !=0) {
    					return "buzz fake deluxe";
    				}
    				return "buzz deluxe";
    			}
    			return "buzz";
    		} else if(isIdentical(number) && (number > 10)){
    			if(number%2 !=0) {
					return "fake deluxe";
				}
    			return "deluxe";
    		} else
        		return Integer.toString(number);
    	
    }
    
    public boolean isIdentical(Integer num) {
    	String s = Integer.toString(num);
    	char[] s1 = s.toCharArray();
    	int len = s.length();
    	for(int i =1; i<len; i++) {
    		if(s1[i] != s1[0]) {
    			return false;
    		}
    	}
    	return true;
    }
}
