import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        s.nextLine();
        String name=s.next();
        String name2=s.next();
        System.out.println(name);
    }
}
