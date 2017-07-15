package observerpattern;

/**
 * Created by mr.w on 2017/6/14.
 */
public class charReverse {


    public void swap(char[] arr, int begin, int end) {
        while(begin < end) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
    public String swapWords(String str) {
        char[] arr = str.toCharArray();
        swap(arr, 0, arr.length - 1);
        int begin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ') {
                swap(arr, begin, i - 1);
                begin = i + 1;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(new charReverse().swapWords(str));
    }

}