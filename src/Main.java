import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        String[] arr = new String[N];

        input.nextLine(); // 개행 버림

        for(int i = 0; i < N; i ++) {
            arr[i] = input.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {

                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }

                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int j = 1; j < N; j++) {
            //중복되지 않는 단어만 출력

            if (!arr[j].equals(arr[j - 1])) {
                System.out.println(arr[j]);
            }
        }
    }
}
