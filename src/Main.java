public class Main {
    public static void main(String[] args) {
        GenericClass<Integer,Integer> myInt = new GenericClass(1,9);
        GenericClass<Double,Double> myDouble = new GenericClass(3.14,1.01);
        GenericClass<Character,Character> myChar = new GenericClass('@','$');
        GenericClass<String,Character> myString = new GenericClass("hello","!");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());






    }
}
