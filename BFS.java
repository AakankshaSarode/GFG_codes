odes

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         Queue<Integer> q= new LinkedList<>();
          ArrayList<Integer> list= new ArrayList<>();
            boolean vis[]= new boolean[V];
             q.add(0);
              while(!q.isEmpty()){
                    int curr= q.remove();
                     if(!vis[curr]){
                          vis[curr]= true;
                           list.add(curr);
                           
                            for( int i=0;i<adj.get(curr).size();i++){
                                 int e= adj.get(curr).get(i);
                                  q.add(e);
                            }
                     }
              }
               return list;
    }
}