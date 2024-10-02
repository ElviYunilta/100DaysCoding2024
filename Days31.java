package days31;

public class days31 {
    
public static void main(String[] args) {
    String abc = "80"; //ini adalah string
    System.out.println(abc);
    
    int intNumber = Integer.parseInt(abc);
    System.out.println("nilai string setelah di konversi ke integer "+ abc);
    
    abc = "90";
    System.out.println("nilai string "+ abc);
    
    
    byte byteNumber = Byte.parseByte(abc);
    System.out.println("nilai string setelah di konversi ke byte "+ byteNumber);
    abc = "70";
    System.out.println("nilai string "+ abc);
    
    short shortNumber = Short.parseShort(abc);
    System.out.println("nilai string setelah di konversi ke short "+ shortNumber);
    abc = "91";
    System.out.println("nilai string "+ abc);
    
    long longNumber = Long.parseLong(abc);
    System.out.println("nilai string setelah di konversi ke Long "+ longNumber);
    
    
}
}
    
    
    
