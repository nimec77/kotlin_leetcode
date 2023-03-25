package leetcode

import leetcode.common.TreeNode

class BinaryTheeLevelOrderTraversal {
  fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result: MutableList<MutableList<Int>> = mutableListOf()
    fun dfs(node: TreeNode?, level: Int) {
      if (node == null) {
        return
      }
      if (result.size <= level) {
        result.add(mutableListOf())
      }
      result[level].add(node.`val`)
      dfs(node.left, level + 1)
      dfs(node.right, level + 1)
    }
    dfs(root, 0)
    return result
  }
}