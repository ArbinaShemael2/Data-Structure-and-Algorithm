public class Generic{


    public static  void main(String[] args) {


        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "y", "E"};
        displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);
        System.out.println(returnFirstElement(doubleArray));
    }

    public static <Thing> void displayArray(Thing[] array) {
        for(Thing x : array){
            System.out.println(x+ " ");
        }
        System.out.println();

    }

    public static <Thing> Thing returnFirstElement(Thing[] array){
        return array[0];
    }
}
