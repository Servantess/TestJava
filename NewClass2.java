import java.util.Scanner;

//acmp.ru #278
public class NewClass2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String t1 = sc.next();
        char[] s = s1.toCharArray();
        char[] t = t1.toCharArray();
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            if (j < s.length) {
                if (s[j] == t[i]) {
                    j++;
                }
            }
        }
        if (j == (s.length)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
