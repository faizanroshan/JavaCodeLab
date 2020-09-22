class StringOperations3 {
    
    public static void main(String args[]) {

	regionMatches();
	startsWith();
	endsWith();
	equalsNotEqualto();
	stringJoin();

    }
    
    public static void regionMatches() {
    
	String s1 = "Hello, Java";
	String s2 = "Java";
	String s3 = "JAVA";

	System.out.println(s1.regionMatches(7, s2, 0, 3));
	System.out.println(s1.regionMatches(7, s3, 0, 3));
	System.out.println(s1.regionMatches(true, 7, s3, 0, 3));
    }


    public static void startsWith() {

	String str = "FooBar";
	System.out.println(str.startsWith("Foo"));
    }

    public static void endsWith() {

        String str = "FooBar";
        System.out.println(str.endsWith("Bar"));
    }

    public static void equalsNotEqualto() {
	
	String str1 = "Hello";
	String str2 = new String(str1);

	System.out.println( str1 + " equals " + str2 + "----> " + str1.equals(str2) );
	System.out.println( str1 + " == " + str2 + "----> " + (str1 == str2) );
    }  
    
    public static void stringJoin() {

	String strJoin = String.join( ", ", "Java", "coding", "is", "awesome");
	System.out.println(strJoin);
    }    
}
