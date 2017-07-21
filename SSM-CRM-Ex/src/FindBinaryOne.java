import java.util.Scanner;

/**
 * Author:  froid
 * Date  :  2017/7/20.
 */
public class FindBinaryOne {

    public static void main(String[] args) {

        int num = 666;
        System.out.println(Integer.toBinaryString(num));
        String str = Integer.toBinaryString(num);
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
