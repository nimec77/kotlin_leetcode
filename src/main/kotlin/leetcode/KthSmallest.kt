package leetcode

import leetcode.common.TreeNode

class KthSmallest {
  fun kthSmallest(root: TreeNode?, k: Int): Int {
    val leftCount = count(root?.left)
    return when {
      leftCount == k - 1 -> root!!.`val`
      leftCount > k - 1 -> kthSmallest(root?.left, k)
      else -> kthSmallest(root?.right, k - leftCount - 1)
    }
  }

  private fun count(root: TreeNode?): Int {
    if (root == null) {
      return 0
    }
    return count(root.left) + count(root.right) + 1
  }
}