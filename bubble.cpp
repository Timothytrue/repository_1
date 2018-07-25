void swap(int& a,int& b){
  int temp=a;
  a=b;
  b=temp;
}

int bubble(int A[],int n){
  for(int i=1;i<n;i++){
    for(int j=0;j<n-i;j++){
      if(A[j]>A[j+1]){
        swap(A[j],A[j+1]);
      }
    }
  }
  
}
