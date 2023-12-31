class throwskeyword {
    static void throwMethod1() throws NullPointerException {
        System.out.println("Inside throwMethod1");
        throw new NullPointerException("Throws_Demo1");
    }

    static void throwMethod2() throws ArithmeticException {
        System.out.println("Inside throwsMethod2");
        throw new ArithmeticException("Throws_Demo2");
    }

    public static void main(String args[]) {
        try {
            throwMethod1();
        } catch (NullPointerException exp) {
            System.out.println("Exception is: " + exp);
        }
        try {
            throwMethod2();
        } catch (ArithmeticException ae) {
            System.out.println("Exception is: " + ae);
        }
    }
}
