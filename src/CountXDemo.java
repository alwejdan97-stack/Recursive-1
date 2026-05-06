public class CountXDemo {
    public static void main(String[] args){
        CountX countx=new CountX(); //create CountX object
        System.out.println(countx.countX("xxhixx")); //calling countX method
        System.out.println(countx.countX("xhixhix"));
        System.out.println(countx.countX("hi"));
        System.out.println(countx.countX("hix"));
    }
}
