package leetcode

import leetcode.common.TreeNode

class BinaryTheeMaximumSum {
  fun maxPathSum(root: TreeNode?): Int {
    var max = Int.MIN_VALUE
    fun dfs(node: TreeNode?): Int {
      if (node == null) {
        return 0
      }
      val left = dfs(node.left)
      val right = dfs(node.right)
      val sum = node.`val` + left + right
      max = max.coerceAtLeast(sum)
      return 0.coerceAtLeast(node.`val` + left.coerceAtLeast(right))
    }
    dfs(root)
    return max
  }
}