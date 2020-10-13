/*package whatever //do not write package name here */

import java.io.*;

class TypeConversion {
    
	public static void main (String[] args) {
		
    byteConversion();
    floatConversion();
	}
	
	public static void byteConversion() {
	    
        int a;
		byte b;
		b = (byte) a; 
		
		/*
		    If the integer's value is larger than the range of a byte, 
		    it will be reduced modulo ( the remainder of an integer divison by the ) byte's range
		*/
	}
	
	public static void floatingConversion() {
	    
	    byte b;
	    int i = 257;
	    double d = 323.142;
	    
	    System.out.println("\n Conversion of int to byte. ");
	    b = (byte) i;
	    System.out.println("i and b " + i +  " " + b);
	    
	    System.out.println("\n Conversion of double to int. ");
	    i = (int) d;
	    System.out.println("d and i " + d +  " " + i);
	    
	    System.out.println("\n Conversion of double to byte. ");
	    b = (byte) d;
	    System.out.println("d and b " + d +  " " + b);
	}
}
