package guided1;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3];

        //constructor 1
        Manusia objMns1 = new Manusia();

        //constructor 2
        Manusia objMns2 = new Manusia("Budi");

        //constructor 3
        Manusia objMns3 = new Manusia("Joko", 20);
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < arrMns.length; i++) {
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
    
    }
}
