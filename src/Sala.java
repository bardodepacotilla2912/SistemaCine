import java.util.ArrayList;

public class Sala{
    private ArrayList<ArrayList<Asiento>> asiento;

    // constructor
    public Sala(){
        this.asiento = new ArrayList<>();
    }

    public void reservarAsiento(Asiento asiento){
        asiento.reservar(asiento)
    }
}