leetcode中的remove duplicates的两道题和move zeros以及 remove elements都适用双指针法，一个指针拥有从前往后搜寻，
另一个指针用于确定元素唯一。以下是四道题的具体实现过程。

1.例子[1,1,2,3,4]-->[1,2,3,4]
  int[]arr= {1,1,2,3,4};
	int index=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]!=arr[index]) {
			arr[index+1]=arr[i+1];
			index++;
		}
	}
 2.例子[1,1,1,2,3]-->[1,1,2,3]
 int[]arr={1,1,1,2,3};
 int index=0;
 for(int i=0;i<arr.length-2;i++){
  if(arr[i+2]!=arr[index]){
    arr[index+2]=arr[i+2];
    index++;
  }
 }
 3.例子删除一个数组中的特定项目，如[1,2,3,4]删除3---->[1,2,4]
 int[]arr={1,2,3,4};
 int index=0;
 for(int i=0;i<arr.length;i++){
  if(arr[i]!=3){
    arr[index]=arr[i];
    index++;
  }
 }
 4.移动0，将数组中的0移动到数组的最后[0,1,0,2,3]-->[1,2,3,4,0,0]
 int[]arr={0,1,0,2,3,4};
 int index=0;
 for(int i=0;i<arr.length;i++){
  if(arr[i]!=0){
    arr[index]=arr[i];
    index++;
  }
 }
 for(int j=index;j<arr.length;j++)
    arr[index]=0;
 
