public class ByteClassMethods {
    public static void main(String[] args) {
        
        Byte byteObj = 43;
        byte b = 100;
        Short s = (short)32767;


        System.out.println("toString : "+Byte.toString(b));
        System.out.println("valueOf : "+Byte.valueOf(b));
        System.out.println("valueOf(redix) : "+Byte.valueOf("101", 2));
        System.out.println("valueOf(String) : "+Byte.valueOf("105"));
        System.out.println("parseByte(String, redix) : "+Byte.parseByte("1011", 2));
        System.out.println("parseByte(String) : "+Byte.parseByte("127"));
        System.out.println("decode(String) : "+Byte.decode("0x0f"));
        System.out.println("byteValue(Byte) : "+byteObj.byteValue());
        System.out.println("shortValue(Byte) : "+byteObj.shortValue());
        
    }
}
