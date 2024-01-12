class One {

    public void printGeek() { System.out.print("Geeks"); };

}

class Two extends One{


    public void printFor() { System.out.print("For"); };

}


public class SingleLevelInheritence {

    public static void main(String[] args) {

        Two t = new Two();

        t.printGeek();
        t.printFor();
        t.printGeek();
        
    }
    
}
