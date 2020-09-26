import java.util.*;

class AddandSub{
    
    public static void main(String args[]) {
	
	int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	
	addMatrix( matrix1, matrix2);
	subMatrix( matrix1, matrix2);

    }

    public static void addMatrix(int[][] matrixA, int[][] matrixB) {
	
	int[][] sumMatrix = new int[matrixA.length][matrixB.length];

	for( int indexRow = 0; indexRow < matrixA.length; indexRow++ ) {
	
	    for( int indexCol = 0; indexCol < matrixB.length; indexCol++ ) {

		sumMatrix[indexRow][indexCol] = matrixA[indexRow][indexCol] + matrixB[indexRow][indexCol];

	    }
    
	}

	    System.out.println(Arrays.deepToString(sumMatrix));
    }


    public static void subMatrix(int[][] matrixA, int[][] matrixB) {
    
        int[][] sumMatrix = new int[matrixA.length][matrixB.length];

        for( int indexRow = 0; indexRow < matrixA.length; indexRow++ ) { 
    
            for( int indexCol = 0; indexCol < matrixB.length; indexCol++ ) { 

                sumMatrix[indexRow][indexCol] = matrixA[indexRow][indexCol] -  matrixB[indexRow][indexCol];

            }
    
        }

            System.out.println(Arrays.deepToString(sumMatrix));
    }
}
