package leetcode

import leetcode.common.TreeNode

class SubtreeOfAnotherTree {
  private val sameTree = SameTree()
  fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
    if (s == null) {
      return false
    }
    if (sameTree.isSameTree(s, t)) {
      return true
    }
    return isSubtree(s.left, t) || isSubtree(s.right, t)
  }
}