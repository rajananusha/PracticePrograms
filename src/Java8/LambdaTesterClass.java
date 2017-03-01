package Java8;

/**
 * Created by anusha on 12/10/16.
 */
interface MathOperation {
    int operation (int a, int b);
}
interface Greeting {
    void sayMessage(String message);
}
class LambdaTesterClass {
    final static String christmas_greeting = "Merry Christmas";
    private int operate(int a , int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
    public static void main(String args[]){
        MathOperation addition = (a,b) -> { return a + b;};
        MathOperation subtraction = (int a , int b) -> a-b;

        LambdaTesterClass tester = new LambdaTesterClass();
        System.out.println(tester.operate(5,3,addition));
        System.out.println(tester.operate(5,3,subtraction));

        Greeting christmas = message -> System.out.println(christmas_greeting +" " + message);
        Greeting newyear = message -> { System.out.println("Happy New Year " + message);};

        christmas.sayMessage("Anusha");
        newyear.sayMessage("Anusha");
    }
}
