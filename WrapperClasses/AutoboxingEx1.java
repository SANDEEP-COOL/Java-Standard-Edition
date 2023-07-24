public class AutoboxingEx1{
    public static void main(String[] args) {

        // primitive 
        int x = 5;
        float y = 3.14f;
        long z = 6000;

        // autoboxing - primitve to Wrapper object
        Integer intobj = x;
        Float floatobj = y;
        Long longobj = z;

        System.out.println(intobj + " and "+floatobj + " and "+longobj);

    }
}