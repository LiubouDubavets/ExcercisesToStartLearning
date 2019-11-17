
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текстовую строку");
        String text = reader.readLine();
        String word = reader.readLine();
        String[] textword = text.split(" ");
        int len = textword.length;
        int kol=0;

        for (int i=0;i<len;i++)
        {
            if( textword[i].equalsIgnoreCase(word))
            {
                kol=++kol;
            }
        }
        System.out.println("Количество употреблений слова "+word+" :"+kol);
    }
}
