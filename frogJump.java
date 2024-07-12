
class Solution{
    public int minimumEnergy(int arr[],int N){
        //code here
        int dp[]= new int[N];
         for( int i=1;i<N;i++){
         int step_one= Math.abs(arr[i]-arr[i-1])+dp[i-1];
          int step_two=Integer.MAX_VALUE;
            if(i-2>=0)
            step_two=Math.abs(arr[i]-arr[i-2])+dp[i-2];
             dp[i]=Math.min(step_one,step_two);
             
        
    }
     return dp[N-1];
}

}