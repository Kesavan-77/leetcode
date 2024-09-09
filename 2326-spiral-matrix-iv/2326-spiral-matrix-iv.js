/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {number} m
 * @param {number} n
 * @param {ListNode} head
 * @return {number[][]}
 */
var spiralMatrix = function(m, n, head) {
    let res = Array.from({ length: m }, () => Array(n).fill(-1));
    let curr = head;
    let top = 0, bottom = m - 1, left = 0, right = n - 1;
    while (curr && top <= bottom && left <= right) {
        for (let i = left; i <= right && curr; i++) {
            res[top][i] = curr.val;
            curr = curr.next;
        }
        top++;
        for (let i = top; i <= bottom && curr; i++) {
            res[i][right] = curr.val;
            curr = curr.next;
        }
        right--;
        for (let i = right; i >= left && curr; i--) {
            res[bottom][i] = curr.val;
            curr = curr.next;
        }
        bottom--;
        for (let i = bottom; i >= top && curr; i--) {
            res[i][left] = curr.val;
            curr = curr.next;
        }
        left++;
    }
    return res;
};