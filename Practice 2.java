public class RemainderExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int remainder1 = a % b;
        System.out.println("10 % 3 = " + remainder1);  // Outputs: 10 % 3 = 1

        int c = 10;
        int d = -3;
        int remainder2 = c % d;
        System.out.println("10 % -3 = " + remainder2);  // Outputs: 10 % -3 = 1

        int e = -10;
        int f = 3;
        int remainder3 = e % f;
        System.out.println("-10 % 3 = " + remainder3);  // Outputs: -10 % 3 = -1

        int g = -10;
        int h = -3;
        int remainder4 = g % h;
        System.out.println("-10 % -3 = " + remainder4);  // Outputs: -10 % -3 = -1
    }
}
