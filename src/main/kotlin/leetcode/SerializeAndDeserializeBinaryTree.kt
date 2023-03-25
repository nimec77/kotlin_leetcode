package leetcode

import leetcode.common.TreeNode

class SerializeAndDeserializeBinaryTree {
  fun serialize(root: TreeNode?): String {
    if (root == null) {
      return "null"
    }
    return "${root.`val`},${serialize(root.left)},${serialize(root.right)}"
  }

  fun deserialize(data: String): TreeNode? {
    val nodes = data.split(",")
    return deserialize(nodes.iterator())
  }

  private fun deserialize(nodes: Iterator<String>): TreeNode? {
    val node = nodes.next()
    if (node == "null") {
      return null
    }
    val root = TreeNode(node.toInt())
    root.left = deserialize(nodes)
    root.right = deserialize(nodes)
    return root
  }
}