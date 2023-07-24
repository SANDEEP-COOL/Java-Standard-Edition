enum Color{
    RED {
        public void go() {
            System.out.println("RED GO");
        }
    },
    GREEN {
        public void go() {
            System.out.println("GREEN GO");
        }
    },
    BLUE {
        public void go() {
            System.out.println("BLUE GO");
        }
    },
    YELLOW {
        public void go() {
            System.out.println("YELLOW GO");
        }
    };

    // instance method 
    public void say() {
        System.out.println("say hello!");
    }

    // abstract method 
    public abstract void go();
}

public class EnumInSwitch {
    
    public static void main(String[] args) {
        
        // var is object of Color enum 
        Color var = Color.YELLOW;

        // switch case with enum 
        switch(var) {
            
            case BLUE:
                System.out.println("Blue is here!");
                break;
            case RED:
                System.out.println("Red is here!");
                break;
            case GREEN:
                System.out.println("Green is here!");
                break;
            case YELLOW:
                System.out.println("Yellow is here!");
                break;
            default:
                System.out.println("Default");
        }

        // caling say() - using var which is object of Color enum 
        var.say();

        // calling go() - abstract method 
        var.go();
    }

}
