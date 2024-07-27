/*Given a string, find the minimum number of characters to be inserted to convert it to a palindrome.

Examples :

Input: str = "abcd"
Output: 3
Explanation: Inserted character marked with bold characters in dcbabcd, here we need minimum three characters to make it palindrome.
Input: str = "aa"
Output: 0
Explanation: "aa" is already a palindrome.
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(n2)

Constraints:
1 ≤ |str| ≤ 500
str contains only lowercase alphabets.
*/
class Solution{
    static int countMin(String str)
    {
        // code here
         int n=str.length();
          char s[]= str.toCharArray();
          
           int table[][]= new int[n][n];
            int l,h,gap;
             for(gap=1;gap<n;++gap)
                  for( l=0,h=gap;h<n;++l,++h)
                   table[l][h] = (s[l] == s[h])?

                           table[l+1][h-1] :

                          (Integer.min(table[l][h-1],

                                 table[l+1][h]) + 1);

 
                   
                   
                    return table[0][n-1];
             }
    
}