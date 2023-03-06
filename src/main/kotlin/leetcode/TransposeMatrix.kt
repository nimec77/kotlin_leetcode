package leetcode

class TransposeMatrix {
  fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val result = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in matrix.indices) {
      for (j in matrix[i].indices) {
        result[j][i] = matrix[i][j]
      }
    }
    return result
  }
}