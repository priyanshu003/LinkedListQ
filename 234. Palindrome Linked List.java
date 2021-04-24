// Given the head of a singly linked list, return true if it is a palindrome.

 

// Example 1:


// Input: head = [1,2,2,1]
// Output: true
  
  /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     static ListNode left ;
   
    public boolean isPalindrome(ListNode head) {  
        left = head;
        return isc(head);
        
    }
   
        public boolean isc( ListNode right){
            if(right == null){
                return true;
            }
            boolean rres = isc(right.next);
            if(rres == false){
                return false;
            }else if(left.val != right.val){
                return false;
            }else{
                  
            left = left.next;
                return true;
            }
          
        }
    
}
