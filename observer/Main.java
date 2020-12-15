 

public class Main {

    public static void main(String[] args) {
        Kacamata kacamata = new Kacamata();

        CurrentBright currentDisplay = new CurrentBright(kacamata);
      
        kacamata.setBright(6);
       
    }
}
