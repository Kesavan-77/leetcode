/**
 * Definition for a binary tree root.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */

var sumOfLeftLeaves = function(root) {
    const isLeaf = (node) => node && !node.left && !node.right;

    const helper = (node) => {
        if (!node) return 0;
        let sum = 0;
        if (node.left && isLeaf(node.left)) {
            sum += node.left.val;
        } else {
            sum += helper(node.left);
        }
        sum += helper(node.right);
        return sum;
    };
    
    return helper(root);
};
