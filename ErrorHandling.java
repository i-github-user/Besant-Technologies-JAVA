public class ErrorHandling {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("error occured");
        }finally{
            System.out.println("excecuting finally block");
        }
        System.out.println("reached end");
    }
}