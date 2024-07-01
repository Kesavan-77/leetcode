# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        
        def is_leaf(node):
            return node and not node.left and not node.right

        def helper(node):
            if not node:
                return 0
            sum = 0
            if node.left and is_leaf(node.left):
                sum += node.left.val
            else:
                sum += helper(node.left)
            sum += helper(node.right)
            return sum

        return helper(root)