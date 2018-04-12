1.判断数组中是否有重复元素

int[]arr={1,2,3,1};
HashSet<Integer> set=new HashSet<Integer>();
for(int i=0;i<arr.length;i++){
  if(!set.contains(num[i])){
    set.add(num[i]);
  }else{
    return true;
  }
}

思路：https://blog.csdn.net/derrantcm/article/details/48084061
2.判断数组元素是否有重复元素并且重复元素中下标相差小于等于K
int[]arr={1,2,3,1};
HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++){
  if(!map.containsKey(arr[i])){
    map.put(arr[i],i);
  }else{
    int value=map.get(arr[i]);
    if(i-value<=k){
      return true;
    }
    map.put(arr[i],i)
  }
}
