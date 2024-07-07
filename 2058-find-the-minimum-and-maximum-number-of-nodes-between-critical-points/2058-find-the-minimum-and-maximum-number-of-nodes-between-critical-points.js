/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */
var nodesBetweenCriticalPoints = function (head) {
    let prev = head, curr = head.next;
    let arr = [],idx = 2;
    while(curr){
        if(!curr.next) break;
        if(curr.val>prev.val && curr.val>curr.next.val){
            arr.push(idx);
        }
        else if(curr.val<prev.val && curr.val<curr.next.val){
            arr.push(idx);
        }
        curr = curr.next;
        prev = prev.next;
        idx+=1;
    }
    console.log(arr);
    if(arr.length<=1) return [-1,-1];
    let res = [Number.POSITIVE_INFINITY,-1]
    res[1] = arr[arr.length-1] - arr[0];
    for(let i=0;i<arr.length-1;i++){
        res[0] = Math.min(res[0], arr[i+1]-arr[i])
    }
    return res;
};