import java.util.Scanner ;

class Main {

    public static int getAllWays(int remainingSum, int power, int base){
    

        // calculate power
    	int result = (int)Math.pow(base, power);
    
    	if (result == remainingSum)
    	return 1 ;
    	
    	if (result > remainingSum)
    	return 0 ;
    	
    	// Two recursive calls one to include current base's
    	// power in sum another to exclude
    	return getAllWays(remainingSum - result, power, base + 1) + 
    	        getAllWays(remainingSum, power, base + 1) ;
    }
        // Driver Code
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;
    	int x = sc.nextInt() ;
    	int n = sc.nextInt() ;
    	System.out.print( getAllWays(x, n, 1) ) ;
    }
}