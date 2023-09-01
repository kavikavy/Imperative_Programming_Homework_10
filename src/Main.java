public class Main {
    public static void main(String[] args) {
        int a = 20, b = 80;
        int divisor = 1;
        boolean found = false;

        while (!found) {
            int r = a % b;
            if (r == 0) {
                divisor = b;
                found = true;
            }
            else {
                a = b;
                b = r;
            }
        }
        System.out.println(divisor);
    }
}