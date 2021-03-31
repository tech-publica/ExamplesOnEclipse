package esempi.introToOO;

public class ContoCorrente {
     public double saldo;
     public String nomeProprietario;
     public void deposita(double ammontare) {
    	 saldo += ammontare;
    	 // saldo = saldo + ammontare;
     }
}
