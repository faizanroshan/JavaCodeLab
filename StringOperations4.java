class StringOperations4 {

    public static void main(String args[]) {

	charAt();
	getChars();
	getBytes();	
	indexOfMethod();
    }
    
    // gets character at a specific index of a string
    public static void charAt() {

	String str = "FooBar";
	System.out.println(str.charAt(1));

    }
    
    // gets the characters from certain range using index
    public static void getChars() {
    
	String str = "Test for charAt method";
	int start = 0;
	int end = 10;
	char target[] = new char[end - start];

	str.getChars(start, end, target, 0);
	
	System.out.println(target);
    }
    
    // converts the given string to ASCII value
    public static void getBytes() {

	String str = "BYTES";
	byte[] getBytesArray = str.getBytes();

	for ( int index = 0; index < getBytesArray.length; index ++ )  {

	    System.out.print(getBytesArray[index] + " ");
	}
	
	System.out.println();
    }

    
    // searches characters or substrings and returns index value
    public static void indexOfMethod() {

	String str = "Search the Index";
	
	System.out.println("First Index values of e " + str.indexOf('e'));
	System.out.println("Last index value of e " + str.lastIndexOf('e'));
	System.out.println("Index of substring the " + str.indexOf("the"));
	
    }
}
