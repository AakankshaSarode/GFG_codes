import java.util.ArrayList;
import java.util.Arrays;



class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int vis[]= new int[V];
        Arrays.fill(vis,0);
        ArrayList<Integer>ans= new ArrayList<>();
         DFS(0,ans,adj,vis);
          return ans;
        
    }
     void DFS(int node,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,int[] vis){
         ans.add(node);
          vis[node]=1;
          for(int i: adj.get(node)){
              if(vis[i]!=1)
              DFS(i,ans,adj,vis);
          }
     }
}