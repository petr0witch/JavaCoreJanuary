
public class One {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        //1. Написать метод, возвращающий количество чётных элементов массива.
        System.out.println(check(array));

    }
    static int check(int[] arr){
        int count = 0;
        for (int item: arr) {
            if (item %2 ==0) count++;
        }
        return count;
    }
}