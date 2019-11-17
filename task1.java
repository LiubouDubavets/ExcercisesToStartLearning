import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число");
        String str=reader.readLine();
        Double n= Double.parseDouble(str);
        if (n%1!=0)
        {
            System.out.println("Неправильно введено число");
        }
        else {
            if (n % 2 == 0) {
                System.out.print("Число четное ");
            } else {
                System.out.print("Число нечетное ");
            }
            boolean l = false;
            int i = 2;
            while (l == false) {
                if (n==0 || n==1)
                {
                    l=true;
                }
                else
                {
                    double k = n / i;
                    if (k % 1 == 0) {
                        System.out.print("составное ");
                        l = true;
                    } else {
                        if (i < n - 1) {
                            i = i + 1;
                        } else {
                            l = true;
                            System.out.print("простое ");
                        }
                    }
                }
            }
        }
    }
}

