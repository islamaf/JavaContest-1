import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class yandex_prob3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String line1 = br.readLine();
        String line2 = br.readLine();

        String[] line1_s = line1.split("\\s");
        String[] line2_s = line2.split("\\s");

        ArrayList<Integer> a = new ArrayList<>(size);
        ArrayList<Integer> b = new ArrayList<>(size);

        for(int i=0; i < size; i++){
            a.add(Integer.parseInt(line1_s[i]));
            b.add(Integer.parseInt(line2_s[i]));
        }

        String result = maximalSum(a, b, size);
        System.out.println(result);
    }

    public static String maximalSum(ArrayList<Integer> a, ArrayList<Integer> b, int size){
        ArrayList<Integer> maxes = new ArrayList<>(size);
        int max = 0;
        int temp = 0;

        ArrayList<Integer> index_i = new ArrayList<>(size);
        ArrayList<Integer> index_j = new ArrayList<>(size);

        int i = 0;
        int j = 0;
        while (i < size){
            temp = a.get(i) + b.get(j);
            if(j == size-1){
                max = temp;
                maxes.add(max);
                index_i.add(i);
                index_j.add(j);
                i++;
                j = 0;
            }else {
                max = temp;
                maxes.add(max);
                index_i.add(i);
                index_j.add(j);
                j++;
            }
        }

//        System.out.println(maxes);
//        System.out.println(index_i);
//        System.out.println(index_j);
//        System.out.println(good);

        String res = index_i.get(maxes.indexOf(Collections.max(maxes))).toString() + " " + index_j.get(maxes.indexOf(Collections.max(maxes))).toString();

        return res;
    }
}

