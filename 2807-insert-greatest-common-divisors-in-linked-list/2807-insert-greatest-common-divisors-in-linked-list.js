/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var gcd = (num1, num2) => {
    while(num1 != num2){
        if(num1 > num2) num1 = num1 - num2;
        else num2 = num2 - num1;
    }
    return num2;
}

var insertGreatestCommonDivisors = function(head) {
    let curr = head;
    while (curr && curr.next) {
        let gcdValue = gcd(curr.val, curr.next.val);
        let newNode = new ListNode(gcdValue);
        newNode.next = curr.next;
        curr.next = newNode;
        curr = newNode.next; 
    }
    return head;
};