public class ParenBitDemo {
    public static void main(String[] args){
        ParenBit parenBit=new ParenBit(); //create ParenBit object
        System.out.println(parenBit.parenBit("xyz(abc)123")); //calling parenBit method
        System.out.println(parenBit.parenBit("x(hello)"));
        System.out.println(parenBit.parenBit("(xy)1"));
    }
}
