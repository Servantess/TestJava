
import java.util.Scanner;

//acmp.ru #670
public class NewClass {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        int c = 0;
        boolean flag;
        String s;
        int ii;
        for (int i = 1; c < a.length; i++) {
            int r;
            flag = true;
            s = "";
            ii = i;
            while (ii > 0) {
                r = ii % 10;
                if (s.contains(String.valueOf(r))) {
                    flag = false;
                    break;
                }
                s += r;
                ii /= 10;
            }
            if (flag) {
                a[c] = i;
                c++;
            }
        }
        System.out.print(a[n - 1]);
    }
}
