int search(int arr[], int n, int x)
{
    int i;
    for (i=0;i<n;i++){
    	if(arr[i]==x){
    		return i;
    	}
    }
    return -1;
}

int main(){
 	int arr[]={2,8,12,9};
 	int x=12;
 	int n=sizeof(arr)/sizeof(arr[0]);
 	printf("%d is present in %d index",x,search(arr,n,x));
 	getchar();
 	return 0;
}