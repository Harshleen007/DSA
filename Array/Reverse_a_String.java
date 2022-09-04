import java.util.*;
class Driver{
    public static void main(String[] args)
    {
      BufferedReader read= new BufferedReader(new InputStramReader(System.in));
      int t=Integer.parseInt(read.readLine());
      while(t-->0)
      {
        String str=read.readLine();
        System.out.println(new Reverse().reverseWord(str));
      }
    }
}



class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuilder s=new StringBuilder(str);
        String s1= s.reverse().toString();
        return s1;
    }
}
