class twoDArray {
    
    public static void main(String args[]) {

	int twoD[][] = new int [4][5];
	int i, j, k = 0;

	// Iterate through Rows
    	for ( i = 0; i < 4; i++ ) {
	    
	    // Iterate through Columns
	    for ( j = 0; j < 5; j++ ) {
		twoD[i][j] = k;
		k++;
	    }	

	}
	
	// Iterate for printing

        for ( i = 0; i < 4; i++ ) { 

            for ( j = 0; j < 5; j++ ) { 
		
		System.out.print(twoD[i][j] + " ");
            }
	    
	    System.out.println();
        }    
    }

}
