
class DataTypes  {
	public static void main (String[] args) {
		
        charMethod();
        integerMethod();
		
		
	}
	
	public static void charMethod() {
	    
	    char ch1, ch2;
		ch1 = 88; //ASCII valule for X
		ch2 = 'Y';
		
		System.out.println("ch1 ASCII value is " + ch1 + " \nch2 value is " + ch2 );
		
		boolean bool = false;
		System.out.println( "bool value is " + bool);
		
		bool = true;
		System.out.println( "Updated bool value is " + bool );
	}
	
	public static void integerMethod() {
	    
	    // Represent binary with a prefix 0b. 
	    
	    int val1 = 0b1010;
	    System.out.println( "Binary Value variable val1 = " + val1 );
	    
	    // We can use underscores for the ease of redability, compiler discards underscores.
	    
	    int val2 = 123_123;
	    System.out.println( "Underscored variable val2 = " + val2 );
	    
	    // We can use underscore for the binary value.
	}
	
	public static void floatMethod() {
	    
	    double doubleVal1 = 50.22;
	    System.out.println("Double value " + doubleVal1 );
	    
	    // Letters after E are considered as exponents.
	    double doubleVal2 = 6.023E2;
	    System.out.println("Double exponent value " + doubleVal2 );
	    
	    double num = 123_123.123_123;
	    System.out.println("Double value with underscores " + num );
	}
}
