public class Three {
    public static void main(String[] args) {
//  3.  Написать функцию, возвращающую истину,
//  если в переданном массиве есть два
//  соседних элемента, с нулевым значением.
        int[] array = new int[]{0, 2, 3, 4, 6, 6, 7, 8, 0, 0};
        System.out.println(checkZero(array));
    }

    public static boolean checkZero(int[] arr){
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if (i - 2 > 0 && i + 2 < arr.length)
                    if (arr[i-2] == 0 || arr[i + 2] == 0) return true;
            }
        }
        return answer;
    }
}
