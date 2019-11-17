
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        String[] result=str.split(" ");
        int len=result.length;
        System.out.println("Количество слов "+ len);

        for (int i=0; i<len; i++) {
            char ch = result[i].charAt(0);
            int i1=(int)ch;
            if (i1<1104 && i1>1071)
            {i1=i1-32;}
            ch=(char)i1;
            result[i]=result[i].substring(0,0)+ch+result[i].substring(1);
        }
        for (int j=0;j<len;j++) {
            for (int i = 0; i < len - 1; i++) {
                if(result[i].compareTo(result[i+1])>0)
                {
                    String zam=result[i+1];
                    result[i+1]=result[i];
                    result[i]=zam;
                }
            }
        }
        for(int i=0; i<len;i++)
        {
            System.out.println(result[i]);
        }
    }
}
