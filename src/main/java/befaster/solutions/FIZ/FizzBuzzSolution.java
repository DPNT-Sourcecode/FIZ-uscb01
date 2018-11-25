package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    
    	if((number%3==0) || (number.toString().contains("3"))){
    		if((number%5==0) || (number.toString().contains("5"))){
    			if (isDeluxe(number)) {
    				return "fizz buzz deluxe";
    			}
    			return "fizz buzz";
    		} else {
    			return "fizz";
    		}
    	}
    		else if ((number%5==0) || (number.toString().contains("5"))){
    			return "buzz";
    		} else
        		return Integer.toString(number);
    	
    }
    
    public boolean isDeluxe(Integer num) {
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
