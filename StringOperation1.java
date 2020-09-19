/*
  This program is part one of String Handling.
*/

public class StringOperation1{
    
    public static void main(String args[]) {
        
        stringConstructor();
        stringLength();
        specialStrOperation();
        strConcatenation();
        
        
        
    }
    
    public static void stringConstructor() {
        
        char chars[] = { 'a', 'b', 'c' };
        String strChar = new String(chars);
        
        byte ascii[] = { 65, 67, 68, 69, 70};
        String strByte = new String(ascii);

        System.out.println("print using character string constructor" + strChar);
        System.out.println("print using Byte string constructor" + strByte);
        System.out.println();
    }
    
    public static void stringLength() {
        
        char chars[] = { 'l', 'e', 'n', 'g', 't', 'h'};
        String strChar = new String(chars);
        
        System.out.println(strChar.length());
        System.out.println();
    }
    
    public static void specialStrOperation() {
        
        char chars[] = { 'R', 'U', 'H', 'I' };
        String s1 = new String(chars);
        String s2 = "RUHI";
        
        System.out.println("Length of string RUHI is " + s1.length());
        System.out.println("Length of string RUHI is " + s2.length());
        System.out.println();
    }
    
    public static void strConcatenation() {
        
        int age = 18;
        String longStr = "I am" + " really" + " happy at " + age;
        System.out.println(longStr);
        
    }
    
}
