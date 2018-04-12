 思路：https://blog.csdn.net/sunnyyoona/article/details/18362525
 以一个数为中心，左右展开去判断是否存在数组当中
  int[]arr= {400,1,40,3,2,401,402,403};
	HashSet<Integer>set=new HashSet<Integer>();
	for(int element:arr) {
		set.add(element);
	}
	
	int maxlen=0;
	for(int i:arr) {
		System.out.print(i+" ");
		
		int cur=i+1;
		int len=1;
		
		while(set.contains(cur)) {
			set.remove(cur);
			cur++;
			len++;
			
			
		}
		
		cur=i-1;
		while(set.contains(cur)) {
			set.remove(cur);
			cur--;
			len++;
			
		}
		
		maxlen=Math.max(len, maxlen);
	}
	
