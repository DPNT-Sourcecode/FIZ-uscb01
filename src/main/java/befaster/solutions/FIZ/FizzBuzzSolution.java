package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    if(isDeluxe(number)) {
    	if(isFake(number)) {
    		return fizzBuzzNumber(number)+" fake deluxe";
    	} else {
    		return fizzBuzzNumber(number)+" deluxe";
    	}
    }
    return fizzBuzzNumber(number);
    
    }
    
    public String fizzBuzzNumber(Integer num) {
    	if(
    			((num%3==0)&&(num%5==0))
    			||
    			((num.toString().contains("3")) && (num.toString().contains("5")))
    			||
    			((num.toString().contains("3")) && (num%5==0))
    			||
    			((num.toString().contains("5")) && (num%3==0))    			
    			)  {
    		return "fizz buzz";
    	} else if((num%3 == 0)||(num.toString().contains("3"))) {
    		return "fizz";
    	} else if((num%5 ==0)||(num.toString().contains("3"))) {
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
    		return true;
    	} else {
    		return false;
    	}
    }
}
