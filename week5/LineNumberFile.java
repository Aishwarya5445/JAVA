import java.io.*;
public class LineNumberFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int lineNo = 1;
        while ((line = br.readLine()) != null) {
            System.out.println(lineNo + " : " + line);
            lineNo++;
        }
        br.close();
    }
}
