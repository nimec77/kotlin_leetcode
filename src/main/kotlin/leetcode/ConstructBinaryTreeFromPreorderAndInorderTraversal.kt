package leetcode

import leetcode.common.TreeNode

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
  fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    if (preorder.isEmpty()) {
      return null
    }
    val root = TreeNode(preorder[0])
    val rootIndex = inorder.indexOf(preorder[0])
    root.left = buildTree(preorder.sliceArray(1..rootIndex),
      inorder.sliceArray(0 until rootIndex))
    root.right = buildTree(
      preorder.sliceArray(rootIndex + 1 until preorder.size),
      inorder.sliceArray(rootIndex + 1 until inorder.size)
    )
    return root
  }
}