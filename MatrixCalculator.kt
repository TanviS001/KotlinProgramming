import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Matrix Calculator")
    println("Choose an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    print("Enter your choice (1/2/3/4): ")
    val choice = scanner.nextInt()

    println("Enter the dimensions of the first matrix:")
    print("Rows: ")
    val rowsA = scanner.nextInt()
    print("Columns: ")
    val colsA = scanner.nextInt()

    val matrixA = Array(rowsA) { DoubleArray(colsA) }

    println("Enter the elements of the first matrix:")
    for (i in 0 until rowsA) {
        for (j in 0 until colsA) {
            print("Element at ($i, $j): ")
            matrixA[i][j] = scanner.nextDouble()
        }
    }

    println("Enter the dimensions of the second matrix:")
    print("Rows: ")
    val rowsB = scanner.nextInt()
    print("Columns: ")
    val colsB = scanner.nextInt()

    val matrixB = Array(rowsB) { DoubleArray(colsB) }

    println("Enter the elements of the second matrix:")
    for (i in 0 until rowsB) {
        for (j in 0 until colsB) {
            print("Element at ($i, $j): ")
            matrixB[i][j] = scanner.nextDouble()
        }
    }

    when (choice) {
        1 -> {
            if (rowsA == rowsB && colsA == colsB) {
                val result = matrixAddition(matrixA, matrixB)
                printMatrix(result)
            } else {
                println("Matrix dimensions are not compatible for addition.")
            }
        }
        2 -> {
            if (rowsA == rowsB && colsA == colsB) {
                val result = matrixSubtraction(matrixA, matrixB)
                printMatrix(result)
            } else {
                println("Matrix dimensions are not compatible for subtraction.")
            }
        }
        3 -> {
            if (colsA == rowsB) {
                val result = matrixMultiplication(matrixA, matrixB)
                printMatrix(result)
            } else {
                println("Matrix dimensions are not compatible for multiplication.")
            }
        }
        4 -> {
            // Division is not a standard matrix operation, so it's not implemented here.
            println("Matrix division is not supported.")
        }
        else -> println("Invalid choice.")
    }
}

fun matrixAddition(matrixA: Array<DoubleArray>, matrixB: Array<DoubleArray>): Array<DoubleArray> {
    val rows = matrixA.size
    val cols = matrixA[0].size
    val result = Array(rows) { DoubleArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            result[i][j] = matrixA[i][j] + matrixB[i][j]
        }
    }

    return result
}

fun matrixSubtraction(matrixA: Array<DoubleArray>, matrixB: Array<DoubleArray>): Array<DoubleArray> {
    val rows = matrixA.size
    val cols = matrixA[0].size
    val result = Array(rows) { DoubleArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            result[i][j] = matrixA[i][j] - matrixB[i][j]
        }
    }

    return result
}

fun matrixMultiplication(matrixA: Array<DoubleArray>, matrixB: Array<DoubleArray>): Array<DoubleArray> {
    val rowsA = matrixA.size
    val colsA = matrixA[0].size
    val colsB = matrixB[0].size
    val result = Array(rowsA) { DoubleArray(colsB) }

    for (i in 0 until rowsA) {
        for (j in 0 until colsB) {
            result[i][j] = 0.0
            for (k in 0 until colsA) {
                result[i][j] += matrixA[i][k] * matrixB[k][j]
            }
        }
    }

    return result
}

fun printMatrix(matrix: Array<DoubleArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
}
