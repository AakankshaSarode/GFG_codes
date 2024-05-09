
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
         if(head==null){
              return 0;
               
         }
          Node slow=head;
           Node fast=head;
            boolean cycle=false;
             while(fast!=null && fast.next!=null){
                  slow=slow.next;
                   fast=fast.next.next;
                    if(slow==fast){
                         cycle=true;
                          break;
                    }
             }
              if(cycle==false)
              return 0;
               slow=head;
                while(fast!=slow){
                    slow=slow.next;
                     fast=fast.next;
    }
     int distance=1;
      while(slow.next!=fast){
           slow=slow.next;
           distance++;
      }
      return distance;
}
}
