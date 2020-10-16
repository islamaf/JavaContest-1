import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class yandex_prob2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N;
        int k;

        String line = br.readLine();

        String[] numbers = line.split("\\s");

        N = Integer.parseInt(numbers[0]);
        k = Integer.parseInt(numbers[1]);

        int result = countingProblem(N, k);
        System.out.println(result);
    }

    public static int countingProblem(int N, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= N; i++){
            circle.add(i);
        }

        if(N == 1){
            return 1;
        }

        if(N <= 5){
            return 2;
        }

        int temp = k-1;
        int iter = N-1;

        while (iter > 0){
            circle.remove(temp);
            temp += k - 1;
            if(temp > circle.size() - 1){
                temp = temp % circle.size();
            }
            iter--;
        }

        return circle.get(0);
    }
}
