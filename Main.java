import java.util.*;

public class Main {
    public static void main(String args[]) {
        while(true) {
            
            Random rand = new Random();
            int num = rand.nextInt(8300);
            num += 1700;
            System.out.println(num);
        }
    }
}