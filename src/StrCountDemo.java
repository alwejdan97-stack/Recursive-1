public class StrCountDemo {
    public static void main(String[] args){
        StrCount strCount=new StrCount();// create StrCount object
        System.out.println(strCount.strCount("catcowcat", "cat"));// calling strCount method
        System.out.println(strCount.strCount("catcowcat", "cow"));
        System.out.println(strCount.strCount("catcowcat", "dog"));
    }
}
