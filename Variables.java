class Variable {
	public static void main (String[] args) {
		
		variableDeclaration();
		dynamicIntialization();
	}
	
	public static void variableDeclaration() {
	    
        int a, b, c;            // declares three ints a, b, and c;
        int d = 3, e , f = 5;   // declares three more ints, intializing
        
        byte z = 22;            // intialize z
        double pi = 3.14159;    // declares an approximation of pi
        char x = 'x';           // the variable x has the value x
	}
	
	public static void dynamicIntialization() {
	    
	    double a = 3.0, b = 4.0;
	    double c = Math.sqrt(a * a + b * b);
	    
	    System.out.println("Hypotenuse is " + c);
	}
  
  public static void scopeOfVariables() {
	    
	    int x;
	    
	    for ( x = 0; x < 3; x++ ) {
	        
	        int y = -1; //y is intialized each time block is entered
	        System.out.println("y is: " + y); // this will always print -1
	        y = 100;
	        System.out.println("y is now: " + y);
	    }
	}
}
