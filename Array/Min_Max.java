//Q1. Given an array A of size N of integers. Your task is to find the sum of minimum and maximum elements in the array.
import java.util.*;
class Array{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t-->0)
  {
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    Solution sol=new Solution();
    int sum= sol.findSum(arr,n);
    System.out.println(sum);
  }
  }
}




class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int min=A[0];
        int max=A[0];
        for(int i=0;i<N;i++)
        {
            if(A[i]<min)
                min=A[i];
            if(A[i]>max)
                max=A[i];
        }
        int sum=min+max;
        return sum;
    }
    
}
