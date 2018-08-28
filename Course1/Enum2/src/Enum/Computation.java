package Enum;

public enum Computation {
    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            return x / y;
        }
    },
    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    SUBTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(5,7));
        System.out.println(Computation.SUBTRACT.perform(5,7));
        System.out.println(Computation.DIVIDE.perform(5,7));
        System.out.println(Computation.MULTIPLY.ADD.perform(5,7));


    }
}
