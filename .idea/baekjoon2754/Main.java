import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double score = 0.0;
        char grade = s.charAt(0);
        switch (grade) {
            case 'A': score = 4.0; break;
            case 'B': score = 3.0; break;
            case 'C': score = 2.0; break;
            case 'D': score = 1.0; break;
            case 'F': score = 0.0; break;
        }
        if (s.length() == 2) {
            char opt = s.charAt(1);
            if (opt == '+') {
                score += 0.3;
            } else if (opt == '-') {
                score -= 0.3;
            } else if (opt == '0') {
                score += 0.0;
            }
        }
        System.out.println(score);
    }
}
