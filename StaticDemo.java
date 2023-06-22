package day1assignment;

class StaticDemo {
    //static variable
    static int a;
    static int b;

    static void math(int x) { //static method
        System.out.println("x = " + x);

    }

    static { //static block
        a = 5;
        b = a * 4;
    }

    public static void main(String args[]) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        math(60);
    }
}