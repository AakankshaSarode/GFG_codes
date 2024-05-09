class Solution
{
     public static Node reverse( Node temp){
          Node prev=null;
           Node cur=temp;
            Node next;
            while(cur!=null){
                 next=cur.next;
                  cur.next=prev;
                  prev=cur;
                   cur=next;
            }
             return prev;
            
     }
    public static Node addOne(Node head) 
    { 
        //code here.
         int sum=1;
          int carry=1;
           head=reverse(head);
            Node copy=head;
           Node tracker=null;
            while(head!=null){
                 sum=carry;
                  carry=0;
                   sum=sum+head.data;
                   head.data=sum%10;
                    carry=sum/10;
                     if(carry==0){
                          Node h1=reverse(copy);
                           return h1;
                     }
                      tracker=head;
                      head=head.next;
                      
            }
             if(carry==1){
                  Node newnode=new Node(1);
                   head=newnode;
                   tracker.next=head;
             }
              Node ans=reverse(copy);
              return ans;
    }
}




