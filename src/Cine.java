import java.util.ArrayList;
public class Cine{
        private <ArrayList<Sala> salas = new ArrayList<>();
        private int funcion;

        public Cine(int numeroFunciones, int salas){
            this.numeroFunciones = numeroFunciones;
            this.salas = salas;
        }
        public reservarAsiento(int sala, int funcion){
            this.sala = sala;
            this.funcion = funcion;
        }
        public cancelarReserva(int sala, int funcion){
            this.sala = sala;
            this.funcion = funcion;
        }
        public mostrarAsientoDisponible(int sala, int funcion){
            this.sala = sala;
            this.funcion = funcion;
        }
}