
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Find the continuous sequences of numbers in a given input. Provide all possible test cases to
// test your code with proper error handling
/*Input: 1 2 3 5 9 a 6 7 8 4 @ 5 -5 -7 -3 -2 -1

        Output: There are 3 sequences:

        123

        678

        -3-2-1*/
public class Contigeousarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputArr[] = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {
            try {
                list.add(Integer.parseInt(inputArr[i], 10));

            } catch (NumberFormatException e) {
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1 && list.get(i+1)== list.get(i) + 1) {
                System.out.print(list.get(i) + " ");
            } else if (i != 0 && list.get(i - 1) == list.get(i) - 1) {
                System.out.print(list.get(i) + " ");
            } else {
                System.out.println();
            }
        }
    }
}
