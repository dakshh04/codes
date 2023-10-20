class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        int digit, sum = 0;  
        for(int i=0;i<N;i++){
            int number=arr[i];
            while(number > 0)  {
               digit = number % 10;  
               sum = sum + digit;  
               number = number / 10;
           } 
        }
        if(sum%3==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}