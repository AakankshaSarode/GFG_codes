



class Solution
{
   
    static boolean isPalin(int N)
    {
     return helper(N,N,0); 
        
    }
     static boolean helper(int N , int curr,int rev){
          if(curr==0)
          {
              return rev==N;
              
          }
           return helper(N,curr/10, rev*10+curr%10);
     }
}