import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class yandex_prob4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size_a = Integer.parseInt(br.readLine());
        String line1 = br.readLine();
        int size_b = Integer.parseInt(br.readLine());
        String line2 = br.readLine();
        int value = Integer.parseInt(br.readLine());

        String[] line1_s = line1.trim().split("\\s+");
        String[] line2_s = line2.trim().split("\\s+");

        ArrayList<Integer> a = new ArrayList<>(size_a);
        ArrayList<Integer> b = new ArrayList<>(size_b);

        for (int i = 0; i < size_a; i++) {
            a.add(Integer.parseInt(line1_s[i]));
        }

        for (int i = 0; i < size_b; i++) {
            b.add(Integer.parseInt(line2_s[i]));
        }

        int result = maxSum(a, b, size_a, size_b, value);
        System.out.println(result);
    }

    public static int maxSum(ArrayList<Integer> a, ArrayList<Integer> b, int size_a, int size_b, int value){
        int i = 0;
        int temp = 0;
        int count = 0;

        int j = size_b-1;
        while(i < size_a && j >= 0){
            temp = a.get(i) + b.get(j);
//            a[i] + b[j]
            if(temp == value){
                i++;
                j--;
                count++;
            }else if(temp < value){
                i++;
            }else {
                j--;
            }
        }

        return count;
    }
}

