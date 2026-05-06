public class Array11Demo {
    public static void main(String[] args){
        Array11 array11=new Array11();// create Array11 object
        int[] arr1={1, 2, 11};
        int[] arr2={11, 11};
        int[] arr3={1, 2, 3, 4};
        System.out.println(array11.array11(arr1, 0));// calling array11 method
        System.out.println(array11.array11(arr2, 0));
        System.out.println(array11.array11(arr3, 0));
    }
}
