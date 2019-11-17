import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task6 {
    static int calcul(int val[], int wt[],int count, int maxweight)
    {
        int mat[][] = new int[2][maxweight + 1];
        int i = 0;
        while (i < count)
        {
            int j = 0;
            if (i % 2 != 0)
            {
                while (++j <= maxweight)
                {
                    if (wt[i] <= j)
                    {
                        mat[1][j] = Math.max(val[i] + mat[0][j - wt[i]],
                                mat[0][j]);
                    } else
                    {
                        mat[1][j] = mat[0][j];
                    }
                }
            }
            else
            {
                while (++j <= maxweight)
                {
                    if (wt[i] <= j)
                    {
                        mat[0][j] = Math.max(val[i] + mat[1][j - wt[i]],
                                mat[1][j]);
                    } else
                    {
                        mat[0][j] = mat[1][j];
                    }
                }
            }
            i++;
        }
        return (count % 2 != 0) ? mat[0][maxweight] : mat[1][maxweight];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите грузоподъемность рюкзака: ");
        String strmaxweight=reader.readLine();
        int maxweight=Integer.parseInt(strmaxweight);
        System.out.print("Введите количество вещей: ");
        String strcount=reader.readLine();
        int count=Integer.parseInt(strcount);
        int[] val=new int[count];
        int[] wt=new int[count];
        for (int i=0;i<count;i++)
        {
            System.out.print("Введите вес "+(i+1)+"-го предмета: ");
            strcount=reader.readLine();
            val[i]=Integer.parseInt(strcount);
            System.out.print("Введите стоимость "+(i+1)+"-го предмета: ");
            strcount=reader.readLine();
            wt[i]=Integer.parseInt(strcount);
        }
        System.out.println("Итоговый вес рюкзака с вещами: "+calcul(val, wt,count, maxweight)+".");
    }
}
