
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static int gcd(int a, int b)
    {
        while (b!=0)
        {
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static int lcm (int a, int b)
    {
        {return a/gcd(a,b)*b;}

    }
    public static void main(String[] args) throws IOException  {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два целых числа");
        String s1=reader.readLine();
        String s2=reader.readLine();
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        int n1=0;
        int n2=0;
        if (d1%1!=0 || d2%1!=0 || d1==0 || d2==0 || d1<0 || d2<0)
        {
            System.out.println("Неправильно введены числа");
        }
        else
        {
            n1=(int) d1;
            n2=(int)d2;
            int b1=gcd(n1,n2);
            int b2=lcm(n1,n2);
            System.out.println("НОК " +b1);
            System.out.println("НОД "+ b2);
        }

    }
}
