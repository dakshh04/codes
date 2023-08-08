public class count_inversions {
    static int merge(int arr[], int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int [] left = new int [n1];
        int [] right = new int [n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[i+l];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[m+1+j];
        }
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++]=right[j++];
                res = res + (n1-i);
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
        return res;
    }
}
