package leetcode

import leetcode.common.TreeNode

class ValidateBinarySearchTree {
  fun isValidBST(root: TreeNode?): Boolean {
    return isValidBST(root, null, null)
  }

  private fun isValidBST(root: TreeNode?, min: Int?, max: Int?): Boolean {
    if (root == null) {
      return true
    }
    if (min != null && root.`val` <= min) {
      return false
    }
    if (max != null && root.`val` >= max) {
      return false
    }
    return isValidBST(root.left, min, root.`val`) && isValidBST(root.right, root.`val`, max)
  }
}