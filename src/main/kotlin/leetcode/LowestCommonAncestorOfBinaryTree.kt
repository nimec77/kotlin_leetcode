package leetcode

import leetcode.common.TreeNode

class LowestCommonAncestorOfBinaryTree {
  fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || root == p || root == q) {
      return root
    }
    val left = lowestCommonAncestor(root.left, p, q)
    val right = lowestCommonAncestor(root.right, p, q)
    return if (left != null && right != null) {
      root
    } else {
      left ?: right
    }
  }
}