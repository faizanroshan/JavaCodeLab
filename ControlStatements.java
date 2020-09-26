class ControlStatements{

    public static void main(String args[]) {

	int a = 0, b = 1;
	
	ifCondition( a, b );
	ifElseCondition( a, b );
	nestedIf( a, b );
	switchCase( a, b );

    }

    public static void ifCondition( int num1, int num2 ) {

	if ( num2 > num1 ) 
	    System.out.println(num2 + " is greatest");
    }

    public static void ifElseCondition( int num1, int num2 ) {
	
	int bigNumber;

	if ( num2 > num1 )
	    bigNumber = num2;
	else
	    bigNumber = num1; 

	System.out.println(bigNumber + " is the biggest number ");
    }

    public static void nestedIf( int num1, int num2 ) {

	if ( num2 > num1 )  {

	    if ( num1 < num2 )
		System.out.println("Number one " + num1 + " Number two is " + num2 );
	}

    }

    public static void switchCase( int num1, int num2 ) {

	int caseNum = 3;
	switch( caseNum ) {

	    case 0:
		System.out.println("case number is zero.");
		break;
	    case 1:
		System.out.println( "case number is one");
		break;
	    default:	
		System.out.println("it is the default value");

	}
    }
}
