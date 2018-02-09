//dddd
//原文地址：http://blog.csdn.net/yxb09501bin/article/details/53202263
  
  //第一种方法
  public int reverse(int x) {
		  //将数字转换成字符串
      int temp=Math.abs(x);
			String str=Integer.toString(temp);
      //将字符串转换成StringBuffer类型
			StringBuffer sb=new StringBuffer(str);
			String result=sb.reverse().toString();
      //如果结果溢出返回错误
			if(Long.parseLong(result)>Integer.MAX_VALUE) {
				return 0;
			}
			//结果正常
			return x>0?Integer.parseInt(result):-Integer.parseInt(result);	
		}
    
    //第二种方法
    public int reverse(int x){
      int temp=Math.abs(x);
      long result;//防止溢出问题
      while(temp>0){
        result*=10;
        result+=temp%10;
        if(result>Integer.Max_VALUE){
          return 0;
        }
        temp=temp/10;
      }
      return x>=0?result:-result;
    }
