
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
//acmp.ru #557
public class NewClass3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        String[] s;
        s = bf.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        s = bf.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int p = Integer.parseInt(bf.readLine());
        bf.readLine();
        int mul;
        int[][] arr2 = new int[n][n];
        int[] res = new int[n];
        int[] arr1 = new int[n];
        p = Math.abs(p);

        for (int i = 0; i < a - 1; i++) {
            bf.readLine();
        }
        
        s = bf.readLine().split(" ");
        for (int j = 0; j < n; j++) {  
            res[j] = Integer.parseInt(s[j]);
        }
        
        for (int i = a; i < n; i++) {
            bf.readLine();
        }

        int c = 1;
        while (c < m) {
            bf.readLine();
            for (int i = 0; i < n; i++) {
                s = bf.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    arr2[i][j] = Integer.parseInt(s[j]);
                }
            }
            for (int i = 0; i < n; i++) {
                mul = 0;
                for (int k = 0; k < n; k++) {
                    mul += res[k] * arr2[k][i];
                    if (mul >= p) {
                        mul %= p;
                    }
                }
                arr1[i] = mul;
            }
            res = Arrays.copyOf(arr1, n);
            c++;
        }
        BufferedWriter fw = new BufferedWriter(new FileWriter("output.txt"));
        fw.write(String.valueOf(res[b - 1]));
        fw.flush();
    }
}
