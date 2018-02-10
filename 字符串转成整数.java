//1.原文地址https://www.cnblogs.com/keedor/p/4475346.html

static boolean finished = false;

public int atoi(String str) {

str=str.trim();

int i = 0;

boolean minus = false;

if (str.charAt(0) == '-') {

minus = true;

i++;

} else if (str.charAt(0) == '+') {

i++;

}

long MIN_VALUE = Integer.MIN_VALUE;

long MAX_VALUE = Integer.MAX_VALUE;

long num = 0;

   

for (; i < length && !finished; i++) {

char c = str.charAt(i);

if (c >= '0' && c <= '9') {

num *= 10;

num += c - '0';

} else {

num=0;

break;

}

   

if (minus && 0 - num < MIN_VALUE) {

return Integer.MIN_VALUE;

}

if (!minus && num > MAX_VALUE) {

return Integer.MAX_VALUE;

}

}

if (i==length) {

finished = true;

}

return minus ? new Long(0 - num).intValue() : new Long(num).intValue();

} 
