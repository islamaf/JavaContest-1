import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class yandex_prob5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        String line = br.readLine();
        String[] line_s = line.split("\\s");

        ArrayList<Integer> arr = new ArrayList<>(size);

        for(int i=0; i < size; i++){
            arr.add(Integer.parseInt(line_s[i]));
        }

        int result = findPairless(size, arr);
        System.out.println(result);
    }

    public static int findPairless(int size, ArrayList<Integer> a){
        int lonely = 0;

        for(int i: a){
            lonely ^= i;
        }

        return lonely;
    }
}
