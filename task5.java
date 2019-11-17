import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task5
{
    public static void main(String[] args) throws IOException {
        System.out.print("Введите последовательность N:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i<=n; i++) {
            String num = Integer.toString(i);
            StringBuffer rev = new StringBuffer(num).reverse();
            String numrev = rev.toString();
            if (num.equals(numrev)) {
                System.out.print(num+" ");
            }

        }
    }
}