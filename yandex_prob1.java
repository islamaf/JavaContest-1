import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class yandex_prob1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sides = Integer.parseInt(br.readLine());

        if(sides >= 1000){
            System.exit(0);
        }

        ArrayList<Double> X = new ArrayList<>(sides);
        ArrayList<Double> Y = new ArrayList<>(sides);

        for (int i=0; i<sides; i++){
            String line = br.readLine();

            X.add((double) line.charAt(0));
            Y.add((double) line.charAt(2));
        }

        double result = ngon(sides, X, Y);
        System.out.println(result);
    }

    public static double ngon(int sides, ArrayList<Double> X, ArrayList<Double> Y){
        double area = 0.0;

        int j = sides - 1;
        for (int i = 0; i < sides; i++)
        {
            area += (X.get(j) + X.get(i)) * (Y.get(j) - Y.get(i));

            j = i;
        }

        return area/2.0;
    }
}
