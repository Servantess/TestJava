
import java.util.Scanner;

//acmp.ru #579
public class NewClass1 {

    public static void main(String[] args) {
        int sumPos = 0, sumNeg = 0, countPos = 0, countNeg = 0, k;
        String s1 = "", s2 = "";
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumPos += arr[i];
                countPos++;
                s1 += (i + 1) + " ";
            } else if (arr[i] < 0) {
                sumNeg += Math.abs(arr[i]);
                countNeg++;
                s2 += (i + 1) + " ";
            }
        }
        if (sumPos >= sumNeg) {
            System.out.print(countPos + "\n" + s1);
        } else {
            System.out.print(countNeg + "\n" + s2);
        }
    }
}

