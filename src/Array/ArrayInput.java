package Array;
public class ArrayInput {
    public void ArrayIn() {
        String[] array = {"bike", "car", "cycle"};
        System.out.println(array[0]);
        array[0] = "motor";
        System.out.println(array[0] + " replaced value");
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            error.printStackTrace();
        }
    }

    public void IntArray() {
        int sum = 0;
        int[] intarray = {11, 3, 5, 4, 3, 2};
        for (int i = 0; i < intarray.length; i++) {
            sum = sum + intarray[i];
        }
        System.out.println("the total sum is " + sum);
    }
}
