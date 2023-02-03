import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long A = 0;
        while(scan.hasNext()) {
            A = scan.nextLong();
            long hour = A / 3600;
            A = A - (3600 * hour);
            long minute = A / 60;
            A = A - (60 * minute);
            long second = A;
            System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");
        }
    }
}
