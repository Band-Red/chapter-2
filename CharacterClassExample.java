public class PrimativeJava{                //primitive types
    public static void main(String[] args){
        char a = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.355453532;
        float f = 4.7333434f;
        System.out.println("char: "+a);
        System.out.println("integer: "+i);
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("double:  "+d);
        System.out.println("float: "+f);
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class StringExample{                  //Objects
    public static void main (String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.compareTo(s2));
        System.out.println("String length is: "+s1.length());
        String sllower=s1.toLowerCase();             /*[String Upper=s1.toUpperCase();]<== إذا كان يريدها كبتل نكتب */
        System.out.println(sllower);              /*[System.out.println(Upper);]<== إذا  كانت كبتل نكتب شرط طباعه*/
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class IntegerClassExample{
    public static void main(String[] args){
        int a = 20;
        Integer i=Integer.valueOf(a);
        Integer j=i;
        System.out.println("a = "+a+ " i = "+i+ " j = "+j);
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class CharacterClassExample{
    public static void main(String[] args){
        char ch1,ch2;
        ch1='9';
        ch2='v';
        boolean b1,b2;
        b1 =Character.isDigit(ch1);
        b2 =Character.isDigit(ch2);
        String str1=ch1+" is Digit is "+b1;
        String str2=ch2+" is Digit is "+b2;
        System.out.println(str1);
        System.out.println(str2);
    }
}