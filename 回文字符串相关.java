//1.判断一个字符串是否是回文字符串
 
 public void panduan(){
  for (int i = 0; i < str.length() / 2; i++) {  
          if ((str.substring(i, i + 1)).equals(str.substring(str.length() - 1- i, str.length() - i))) {  
                  count++;  
              }  
          }  
          if (count == str.length() / 2) {  
              System.out.println("是回文字符串");  
          }else{  
              System.out.println("不是回文字符串");  
          }  
    }
    
public void panduan1(){
    StringBuffer sb = new StringBuffer(str);  
    sb.reverse();// 将Str中的字符串倒置  
  
    int count = 0;  
    for (int i = 0; i < str.length(); i++) {  
        if (str.charAt(i) == sb.charAt(i)) {  
            count++;  
        }  
    }  
    if (count == str.length()) {  
          
        System.out.println("此字符串是一个回文字符串");  
    } else {  
        System.out.println("此字符串不是一个回文字符串");  
    }  
}

public static boolean isHuiWen(String text) {
          int length = text.length();
          for (int i = 0; i < length / 2; i++) {
              if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                  return false;
              }
          }
          return true;
     }
//2.找出一个字符串中最长的回文字符串
