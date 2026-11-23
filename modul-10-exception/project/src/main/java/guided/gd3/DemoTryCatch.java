package guided.gd3;

public class DemoTryCatch {
    public static void main(String[]Args){
        try {
            int[] arr = new int[1];

            System.out.println(arr[1]);
            System.out.println("Baris ini tidak akan pernah ditampilkan");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Terjadi kesalahan karena indeks tidak valid: ");
        }

        System.out.println("program selesai");
    }
}
