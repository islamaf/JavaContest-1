import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = splitString(input);
        System.out.println(result);
    }

    static int splitString(String s) {
        int right = 0, left = 0, balanced = 0;

        for(char rl: s.toCharArray()){
            if(rl == 'R') {
                right++;
            } else {
                left++;
            }

            if(right == left){
                balanced++;
                right=0;
                left=0;
            }
        }
        return balanced;
    }


}
