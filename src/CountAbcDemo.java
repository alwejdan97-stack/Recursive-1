public class CountAbcDemo {
    public static void main(String[] args){
        CountAbc countAbc=new CountAbc(); //create CountAbc object
        System.out.println(countAbc.countAbc("abc")); //calling countAbc method
        System.out.println(countAbc.countAbc("abcxxabc")); //
        System.out.println(countAbc.countAbc("abaxxaba"));
    }
}