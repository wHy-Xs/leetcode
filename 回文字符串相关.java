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
//2.原文地址http://blog.csdn.net/danielzhou888/article/details/72863570
 /** 
     * <pre> 
     * Given a string, find the length of the longest substring without repeating characters. 
     * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
     * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1. 
     * 
     * 题目大意： 
     * 给定一个字符串，找字符中的最大非重复子串 
     * 
     * 解题思路： 
     * 用start记录当当处理的开始位置 
     * 历遍字符串，当当前字符从开始位置start开始已经出现过的时候，子串开始位置+1，否则更新map中的hash值为当前位置。 
     * </pre> 
     * 
     * @param s 
     * @return 
     */  
    // 可以处理所有的UTF-8字符  
    public static int lengthOfLongestSubstring(String s) {  
          
        // 当前处理的开始位置（即：记录重复字符个数）  
        int start = 0;  
        // 无重复字符串最终长度  
        int result = 0;  
          
        // 创建一个HashMap集合，用来存放遍历的字符和对应位置  
        Map<Character, Integer> map = new HashMap<Character, Integer>(s.length());  
        // 循环遍历字符串，判断是否有重复字符ch，可以用Map中的containsKey方法判断  
        for (int i = 0; i < s.length(); i++) {  
            char ch = s.charAt(i);  
            // 如果HashMap中包含该字符并且该字符的位置要大于start记录位置，就将start值增加1（记录重复字符个数）  
            if(map.containsKey(ch) && map.get(ch) >= start) {  
                start = map.get(ch) + 1;  
            }  
            // 如果不包含该字符，就将result结果增加（但是要去掉重复的字符个数，即：i-start+1）  
            else {  
                result = Math.max(result, i - start + 1);  
            }  
            // 将该字符和位置放入HashMap中  
            map.put(ch, i);  
        }  
          
        return result;  
    }  
}  
