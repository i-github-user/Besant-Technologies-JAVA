import java.io.File;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {


        try {
            File f = new File("C:\\Users\\HP\\IdeaProjects\\test\\src\\sample.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
