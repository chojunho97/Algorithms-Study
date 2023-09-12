import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            c = a+ b;

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
        }
        sc.close();
    }
}