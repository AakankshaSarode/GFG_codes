class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
         if(root==null)
              return false;
               
          if(root.left==null && root.right==null){
               if(target==root.data)
                return true;
                else return false;
                
          }
           return hasPathSum(root.left, target-root.data) || hasPathSum(root.right,target-root.data);
           
    }}