package for문;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class fastAplusB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");

            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}