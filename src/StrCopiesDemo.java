public class StrCopiesDemo {
    public static void main(String[] args){
        StrCopies strCopies=new StrCopies(); //create StrCopies object
        System.out.println(strCopies.strCopies("catcowcat", "cat", 2)); // calling strCopies
        System.out.println(strCopies.strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies.strCopies("catcowcat", "cow", 1));
    }
}
