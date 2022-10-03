public class Homework7 {
    public static void main(String[] args){
//        Write a simple application to finish the assignments below:
//        Declare an array of integers with the values: 1, 2, 3.
//        Catch an exception when you attempt to get the forth value of the array.
//        Print out to console custom exception:
//        "This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th".
        int[] array = {1,2,3};
        try {
            System.out.println(array[3]);
        } catch(Exception e){
            System.out.println("ArrayIndexOutOfBoundsException. Index 3 out of bounds for length 3");
            System.out.println("This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th");
        }
    }
}
