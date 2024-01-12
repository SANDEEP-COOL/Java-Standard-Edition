class A {
    int x = 10;
}

class Box {
    private int l , b , h;

    public Box(int l , int b , int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public String toString() {
        return l +" , "+b+" , "+h;
    }

    // REFLEXIVE , SYMMETRIC , TRANSITIVE , CONSISTENT
    public boolean equals(Object o) {

        if(this == o)
            return true;

        if(o == null || this.getClass() != o.getClass())
            return false;

        Box z = (Box) o;

        
        return (this.l == z.l && this.b == z.b && this.h == z.h);
    }
}

public class ImplEqualsMeth1 {
    public static void main(String[] args) {
        
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(10, 20, 30);
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
        System.out.println(b1.equals(new A()));
        System.out.println(b1.equals(null));
        System.out.println(b1.getClass()+" , "+b2.getClass());

    }
}
