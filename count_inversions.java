public class count_inversions {
    static int merge(int arr[], int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int [] left = new int [n1];
        int [] right = new int [n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[i+l];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[m+1+i];
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

    static int countInv(int arr[], int l, int r){
        int res=0;
        if(l<r){
            int m = (l+r)/2;

            res += countInv(arr, l, m);
            res += countInv(arr, m+1, r);
            res += merge(arr, l, m, r);
        }
        return res;
    }

    public static void main(String [] args){
        int arr[] = {2, 4, 1, 6, 3, 5};
        int n = arr.length;

        System.out.println(countInv(arr, 0, n-1));
    }
}
