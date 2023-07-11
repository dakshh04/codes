import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0, o_count = 0, e_count = 0, length = 0;
        String inp;
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();

        if (inp.charAt(0) == '}') {
            count += 2;
        }

        length = inp.length();
        for (int i = 0; i < length; i++) {
            if (inp.charAt(i) == '{') {
                o_count++;
            } else {
                e_count++;
            }
        }

        if ((o_count - e_count) > -1) {
            count = count + (o_count - e_count) / 2;
        } else {
            count = count + (e_count - o_count) / 2;
        }

        if (length % 2 == 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
