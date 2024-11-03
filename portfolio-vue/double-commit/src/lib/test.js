function matrixEditor(matrix = []) {
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      if (matrix[i][j] === 0) {
        matrix[i][j] = '👽'
      }
    }
  }
  return matrix
}

const matrix = [
  [1, 2, 3, 4, 0],
  [0, 2, 0, 1, 4],
  [9, 8, 5, 2, 0]
]

console.log(matrixEditor(matrix))
