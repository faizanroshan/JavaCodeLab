/*
  Author: Shaik Faizan Roshan Ali
  Email: alsahercoder@gmail.com
  Date: 20-Sep-2020
  This program is part two of String Handling.
*/

public class StringOperations2{
    
    public static void main(String args[]) {
        
        strExatraction();
        strEquals();
        
        
    }
    
    public static void strExatraction() {
        
        // char charAt(int where);
        char ch;
        ch = "roshan".charAt(1);
        System.out.println("charAt() method " + ch);    

        // void getChars(int sourceStart, int sourceEnd, char target[], int targetStart);
        String str = "This is a demo of getChars method";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        
        str.getChars(start, end, buf, 0);
        System.out.println(buf);
        

    } 
    
    public static void strEquals() {
        
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-Bye";
        String s4 = "HELLO";
        
        System.out.println(s1 + " equals " + s2 + " ----> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " ----> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " ----> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " ----> " + s1.equalsIgnoreCase(s4));
        
    }
    
    
}
