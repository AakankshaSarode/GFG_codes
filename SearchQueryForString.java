static void insert(String key) 
{
    
     TrieNode curr= root;
      for( int i=0;i<key.length();i++){
           int idx= key.charAt(i)-'a';
             if(curr.children[idx] == null){
                  curr.children[idx]= new TrieNode();
             }
              curr= curr.children[idx];
              
      }
      curr.isEndOfWord= true;
    
}

//Function to use TRIE data structure and search the given string.
static boolean search(String key)
{
   
       TrieNode curr= root;
      for( int i=0;i<key.length();i++){
           int idx= key.charAt(i)-'a';
             if(curr.children[idx] == null){
               return false;
             }
              curr= curr.children[idx];
              
      }
       return curr.isEndOfWord; 
}