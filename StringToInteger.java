public class Solution {

    public int myAtoi(String str) {

        if(str==null||str.length()<1)

            return 0;

        str=str.trim();

        int i=0;

        char flag='+';

        if(str.charAt(0)=='-')

        {

            flag='-';

            i++;

        }

        else if(str.charAt(0)=='+'){

            i++;

        }

        double result=0;

        while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9')

        {

            result=10*result+(str.charAt(i)-'0');

            i++;

        }

        if(flag=='-')

        {

            result=-result;

        }

        if(result>Integer.MAX_VALUE)

        {

            return Integer.MAX_VALUE;

        }

        if(result<Integer.MIN_VALUE)

        {

            return Integer.MIN_VALUE;

        }

        return (int)result;

                

    }

}
