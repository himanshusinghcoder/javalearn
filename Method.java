public class Method {
    static String myMethod(String a){
        // System.out.println(a);
        return a;
    }
    // method overloading 
    static void plus(int a, int b){
        System.out.println(a + b);
    }

    static void plus(float a, float b){
        System.out.println(a + b);
    }
    public static void main(String[] arg){
        System.out.println(myMethod("Hello Java"));
        // myMethod("Hello JS");
        plus(1,2);
        plus(1.2f,2.8f);
    }
}
