public class Asiento{
    private boolean reservado;


    // Constructor
    public Asiento( boolean reservado){
        this.reservado = false;
    }
    
    //setter y getter 
    public boolean getReservado(){
        return this.reservado;
    }

    public void setReservado(boolean reservado){
        this.reservado = reservado;
    }

    // Métodos
    public void reservar(){
        this.reservado = true;
    }

    public void cancelar(){
        this.reservado = false;
    }

}