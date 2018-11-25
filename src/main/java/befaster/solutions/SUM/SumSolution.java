package befaster.solutions.SUM;

public class SumSolution {

    public int compute(int x, int y) {
    	if (x<0 || x>100) {
    		throw new IllegalArgumentException();
    	}
    	if (y<0 || y>100) {
    		throw new IllegalArgumentException();
    	}
    	return x+y;
    }

}
