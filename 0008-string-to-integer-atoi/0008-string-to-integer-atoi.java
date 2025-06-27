class Solution {
    public int myAtoi(String s) {
    
    int sign = 1;
    long res = 0;
    int i = 0;

    if (s == null || s.isEmpty()) return 0;
    while (i < s.length() && s.charAt(i) == ' ') {
        i++;
    }
    if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        res = res * 10 + (s.charAt(i) - '0');
        if (sign * res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (sign * res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        i++;
    }

    return (int) (sign * res);
    }
    
}











       /* int len=s.length();
        while()
        for(int i=0;i<arr.length;i++)
        {  int temp=(int)arr[i];
            if(arr[i]==' ') continue;
            else if(arr[i]=='-' || arr[i]=='+')
            {
                sign=arr[i];
            }
            else if(temp<Integer.MAX_VALUE &&  temp>Integer.MIN_VALUE)
            {
                int dig=temp;
                num=num*10+dig;
            }
            else
            {
                if(arr[i]>='a'&& arr[i]<='z' || arr[i]>='A' && arr[i]<='Z')
            {
                return num;
            }
            }

           
        }
    return num;
    }

}*/ /* char[] arr=s.toCharArray();
        s.trim();
        int num=0;
        int sign=1;
        if(s.length()==0) return 0;
		for (int i = 0; i < s.length(); i++) {
            if(s.charAt(0)=='0')continue;
			char ch = s.charAt(i);
           // int temp=(int)arr[i];
			if (ch == '-' || ch == '+') {
				//sign =if(ch == '-' )? -1 : 1;
                if(ch=='-')sign= -1;
                else sign=+1;
			} 
            //else if (temp>=48 && temp <=56)
            else if(ch>='1' &&  ch<='9')
            {
                //int temp=(int)s.charAt(i);
                num=num*10+(ch-'0');
            }
				//if (result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
				//return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				//}
				//result = result * 10 + (s.charAt(i) - '0');

           else break;
		}
		return sign * num;
    }
}*/
/*
int sign=1;
long res=0;
int i=0;
if(s=="")return 0;
while(s.charAt(i)==' ' && i<s.length())
{
    i++;
}
if(s.length()>i && (s.charAt(i)=='-' || s.charAt(i)=='+'))
{
    sign=s.charAt(i)=='-'?-1:1;
    i++;
}
while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
{
    res=res*10+((int)s.charAt(i)-'0');
    i++;
    if(sign*res>Integer.MAX_VALUE)
    {
        return Integer.MAX_VALUE;
    }
    else if(res*sign<Integer.MIN_VALUE  )
    {
        return Integer.MIN_VALUE;
    }
    }
    return (int)res * sign;
    }
}
*/