public class FactorialDemo {
    public static Factorial factorial=new Factorial(); //create object for Factorial class
    public static void main(String[] args){
        System.out.println(Factorial.factorial(1)); // calling factorial() from Factorial class
        System.out.println(Factorial.factorial(2));
        System.out.println(Factorial.factorial(3));
    }
}
