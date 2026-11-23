package guided.gd6;

public class DemoFinally {

    public static void main(String[] args) {
        int x = 3;
        int[] arr = {10, 11, 12};

        try{
            System.out.println(arr[x]);
            System.out.println("Tidak ada exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Ada exception");
        } finally {
            System.out.println("Program selesai");
        }
    }

}
