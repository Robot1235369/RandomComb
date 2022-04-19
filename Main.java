import java.util.*;

public class Main {
    public static void main(String args[]) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            String exit = scan.next();
            if (exit.equals("exit")) {
                break;
            }
            Random rand = new Random();
            int num = rand.nextInt(8300);
            num += 1700;
            System.out.println(num);
        }
    }
}