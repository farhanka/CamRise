 

public class CurrentBright implements Observer, DisplayElement {
    private float bright;
    private Subject kacamata;

    public CurrentBright(Subject kacamata) {
        this.kacamata = kacamata;
        kacamata.addObserver(this);
    }

    public void update(float bright) {
        
        this.bright = bright;
        
        display();
    }

    public void display() {
        if (bright > 5 ){
        
            
        System.out.println("Kondisi Kacamata Saat Ini: Gelap");
        System.out.println(" \\                      //     ");
        System.out.println("  \\                    //      ");
        System.out.println("   \\=====        =====//           ");
        System.out.println("    |/////| ==== |/////|");
        System.out.println("     =====        =====             ");
    }else{
    
     System.out.println("Kondisi Kacamata Saat Ini: normal");
     System.out.println(" \\                      //     ");
     System.out.println("  \\                    //      ");
     System.out.println("   \\=====        =====//           ");
     System.out.println("    |     | ==== |     |            ");
     System.out.println("     =====        =====             ");
    }
}
}