package guided2.main;
import guided2.hargapulsa.HargaPulsa;
import guided2.hargatoken.HargaToken;

public class main {
    public static void main(String[] args){
        HargaToken objectToken = new HargaToken();
        objectToken.info();
        
        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}
