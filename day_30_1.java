import java.util.Scanner ;

class GFG{
    static int maxLoot(int hval[], int n){
	   	if (n < 0) {
    	    return 0;
	    }

    	if (n == 0) {
    	return hval[0];
	    }

    	int pick = hval[n] + maxLoot(hval, n - 2);
    	int notPick = maxLoot(hval, n - 1);
    	return Math.max(pick, notPick);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int hval[] = new int [n] ;
        
        for(int i = 0 ; i < n ; i++)
            hval[i] = sc.nextInt() ;
    	
    	System.out.println(maxLoot(hval, n-1));
    }
}
