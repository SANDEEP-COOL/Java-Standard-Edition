class A {
    int a ; int b;
    float c;

    A(int a, int b){
        this.a = a; this.b = b;
    }

    A(int a) {
        this.a = a;
    }

    A(int a, float c) {
        this.a = a ; this.c = c;
    }

    @Override
    public String toString() {
        return ""+a+" , "+b+" , "+c;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        
        A obj1 = new A(10);
        System.out.println(obj1);

    }
}
