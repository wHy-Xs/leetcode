翻转数组

int[]arr={1,2,3,4,5,6};
int i=0;
int j=arr.length-1;
while(i<j){
  int temp=arr[j];
  arr[j]=arr[i];
  arr[i]=temp;
  i++;
  j--;
}
