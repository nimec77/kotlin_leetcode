package leetcode

import leetcode.common.TreeNode

class BinaryTreeRightSideView {
  fun rightSideView(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    if (root == null) {
      return result
    }
    val queue = mutableListOf<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
      val size = queue.size
      for (i in 0 until size) {
        val node = queue.removeAt(0)
        if (i == size - 1) {
          result.add(node.`val`)
        }
        if (node.left != null) {
          queue.add(node.left!!)
        }
        if (node.right != null) {
          queue.add(node.right!!)
        }
      }
    }
    return result
  }
}